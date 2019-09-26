package com.yycoin.job;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.rmi.RemoteException;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.axis2.Constants;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.china.center.tools.TimeTools;
import com.sf.integration.expressservice.response.ResponseRoot;
import com.sf.integration.expressservice.response.Route;
import com.sf.integration.expressservice.response.RouteResponse;
import com.sf.integration.expressservice.response.RouteResponseBody;
import com.sf.integration.expressservice.service.CommonExpressServiceServiceStub;
import com.sf.integration.expressservice.service.SfexpressService;
import com.sf.integration.expressservice.service.SfexpressServiceE;
import com.sf.integration.expressservice.service.SfexpressServiceResponseE;
import com.yycoin.util.ExpressConstants;
import com.yycoin.util.HttpUtils;
import com.yycoin.util.MD5;
import com.yycoin.vo.packageinfo.TCenterPackage;
import com.yycoin.vo.packageinfo.TCenterPackageMapper;
import com.yycoin.vo.packageinfo.TCenterPackageMapperExt;

import sun.misc.BASE64Encoder;

/**
 * 物流信息状态变更定时任务
 * 
 * @author Administrator
 *
 */

@Component
public class LogisticsInfoChangeSchedule implements Job, ExpressConstants {

	private static Logger logger = LoggerFactory.getLogger(LogisticsInfoChangeSchedule.class);

	private static final String SF_CHECKWORD = "Ca5bvGScarYHwINuvk3Uem4smvagSyov";

	private final String KUAIDI100_CUSTOMER = "FCBCF67B3FBF4C3898D7028BF3ABFEF1";

	private final String KUAIDI100_KEY = "oPJSKTwv1061";

	@Autowired
	private TCenterPackageMapper packageMapper;

	@Autowired
	private TCenterPackageMapperExt packageMapperExt;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("start LogisticsInfoChangeSchedule");

		Map<String, String> paramMap = new HashMap<String, String>();

		String startDate = StringUtils.substring(TimeTools.now(-10), 0, 10);
		String endDate = StringUtils.substring(TimeTools.now(-1), 0, 10);
		paramMap.put("startDate", startDate);
		paramMap.put("endDate", endDate);

		List<TCenterPackage> packageList = packageMapperExt.queryPackageInfo4Condition(paramMap);

		for (TCenterPackage packageInfo : packageList) {
			try {
				String expressCode = packageInfo.getExpresscode();
				if ("shunfeng".equalsIgnoreCase(expressCode)) {
					// 调用顺风接口
					String stateString = getSFExpressStatus(packageInfo);

					if (StringUtils.isNotEmpty(stateString)) {
						int state = Integer.valueOf(stateString);
						if (state == ExpressConstants.SF_STATUS_50 || state == ExpressConstants.SF_STATUS_30
								|| state == ExpressConstants.SF_STATUS_31 || state == ExpressConstants.SF_STATUS_607
								|| state == ExpressConstants.SF_STATUS_130 || state == ExpressConstants.SF_STATUS_123) {
							// 已收件 即将派件
							TCenterPackage update = new TCenterPackage();
							update.setId(packageInfo.getId());
							update.setStatus(SHIP_STATUS_PRINT_ZAITU);
							packageMapper.updateByPrimaryKeySelective(update);

						} else if (state == ExpressConstants.SF_STATUS_80 || state == ExpressConstants.SF_STATUS_8000) {
							// 已签收
							TCenterPackage update = new TCenterPackage();
							update.setId(packageInfo.getId());
							update.setStatus(SHIP_STATUS_PRINT_SIGNED);
							packageMapper.updateByPrimaryKeySelective(update);
						} else if (state == ExpressConstants.SF_STATUS_631 || state == ExpressConstants.SF_STATUS_648
								|| state == ExpressConstants.SF_STATUS_99) {
							// 已退回
							TCenterPackage update = new TCenterPackage();
							update.setId(packageInfo.getId());
							update.setStatus(SHIP_STATUS_PRINT_RETURN);
							packageMapper.updateByPrimaryKeySelective(update);
						}

					}

				} else {
					// 调用快递100接口
					String stateString = getOtherExpressStatus(packageInfo);
					if (StringUtils.isNotEmpty(stateString)) {
						int state = Integer.valueOf(stateString);
						if (state == ExpressConstants.KD_100_STATUS_SIGNED
								|| state == ExpressConstants.KD_100_STATUS_RE_SIGNED
								|| state == ExpressConstants.KD_100_STATUS_RETURN) {
							int status = state + 10;
							TCenterPackage update = new TCenterPackage();
							update.setId(packageInfo.getId());
							update.setStatus(status);
							packageMapper.updateByPrimaryKeySelective(update);
						}
					}

				}
			} catch (Exception e) {
				logger.error("LogisticsInfoChangeSchedule error", e);
			}

		}

		logger.info("end LogisticsInfoChangeSchedule");
	}

	/**
	 * 调用顺风接口
	 * 
	 * @param packageInfo
	 * @return
	 * @throws RemoteException
	 * @throws JAXBException
	 */
	private String getSFExpressStatus(TCenterPackage packageInfo) throws RemoteException, JAXBException {
		String transportNo = packageInfo.getTransportno();

		// 请求xml
		String xmlFile = "<Request service=\"RouteService\" lang=\"zh-CN\"> \n" + "  <Head>0251659966</Head>  \n"
				+ "  <Body> \n" + "    <RouteRequest tracking_type=\"1\" method_type=\"1\" tracking_number=\""
				+ transportNo + "\"/> \n" + "  </Body> \n" + "</Request>";

		logger.info("sf request xml:" + xmlFile);

		// xml报文与checkWord前后连接
		String xc = xmlFile + SF_CHECKWORD;

		// MD5+base64编码
		String verifyCode = md5EncryptAndBase64(xc);
		CommonExpressServiceServiceStub stub = new CommonExpressServiceServiceStub();

		stub._getServiceClient().engageModule(Constants.MODULE_ADDRESSING);
		SfexpressService service = new SfexpressService();
		service.setArg0(xmlFile);
		service.setArg1(verifyCode);

		SfexpressServiceE serviceE = new SfexpressServiceE();
		serviceE.setSfexpressService(service);
		SfexpressServiceResponseE response = stub.sfexpressService(serviceE);
		String returnString = response.getSfexpressServiceResponse().get_return();
		String opCode = "";

		logger.info("sf request result:" + returnString);
		if (StringUtils.isNotEmpty(returnString)) {
			JAXBContext contextResult = JAXBContext.newInstance(ResponseRoot.class);
			Unmarshaller unmarshaller = contextResult.createUnmarshaller();
			StringReader reader = new StringReader(returnString);
			ResponseRoot respRoot = (ResponseRoot) unmarshaller.unmarshal(reader);
			if (respRoot != null) {
				RouteResponseBody respBody = respRoot.getBody();
				RouteResponse resp = respBody.getRouteResponse();
				if (resp != null) {
					List<Route> routeList = resp.getRoute();
					if (routeList != null && routeList.size() > 0) {
						// 最后一条数据为最新的物流状态信息
						Route route = routeList.get(routeList.size() - 1);
						opCode = route.getOpcode();
					}

				}
			}

		}
		return opCode;

	}

	/**
	 * 其他快递公司的物流信息
	 * 
	 * @param packageInfo
	 * @return
	 * @throws Exception
	 */
	private String getOtherExpressStatus(TCenterPackage packageInfo) throws Exception {
		HashMap<String, String> emptyMap = new HashMap<String, String>();
		Map<String, String> queryMap = new HashMap<String, String>();
		queryMap.put("com", packageInfo.getExpresscode());
		queryMap.put("num", packageInfo.getTransportno());
		String param = JSON.toJSONString(queryMap);
		String sign = MD5.encode(param + KUAIDI100_KEY + KUAIDI100_CUSTOMER);
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("param", param);
		params.put("sign", sign);
		params.put("customer", KUAIDI100_CUSTOMER);
		HttpResponse response = HttpUtils.doPost("http://poll.kuaidi100.com", "/poll/query.do", "post", emptyMap,
				emptyMap, params);
		String stateString = "";
		if (response != null) {
			String kd100Result = "";
			HttpEntity respEntity = response.getEntity();
			BufferedReader reader = new BufferedReader(new InputStreamReader(respEntity.getContent(), "UTF-8"));
			String s = null;
			while ((s = reader.readLine()) != null) {
				kd100Result = kd100Result + s;
			}
			if (StringUtils.isNotEmpty(kd100Result)) {
				JSONObject obj = JSONObject.parseObject(kd100Result);
				stateString = obj.getString("state");
			}
		}
		return stateString;
	}

	private String md5EncryptAndBase64(String str) {
		return encodeBase64(md5Encrypt(str));
	}

	private byte[] md5Encrypt(String encryptStr) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(encryptStr.getBytes("utf8"));
			return md5.digest();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private String encodeBase64(byte[] b) {
		BASE64Encoder base64Encode = new BASE64Encoder();
		String str = base64Encode.encode(b);
		return str;
	}

}
