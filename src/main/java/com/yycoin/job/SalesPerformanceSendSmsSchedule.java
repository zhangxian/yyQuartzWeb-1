package com.yycoin.job;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.yycoin.service.sms.ITMessageInfoService;
import com.yycoin.util.BaseContants;
import com.yycoin.util.SmsConfigProperties;
import com.yycoin.vo.sms.TMessageInfo;
import com.yycoin.vo.sms.TMessageInfoExample;

/**
 * 销售毛利短信发送类
 * 
 * @author Administrator
 *
 */
@DisallowConcurrentExecution
@Component
public class SalesPerformanceSendSmsSchedule implements Job, BaseContants {

	private static Logger logger = LoggerFactory.getLogger(SalesPerformanceSendSmsSchedule.class);

	private static final String TEMPLATE_CODE_11_BANK1 = "SMS_174170399";

	private static final String TEMPLATE_CODE_11_BANKOTHER = "SMS_174165400";

	private static final String TEMPLATE_CODE_12_BANK1 = "SMS_174170423";

	private static final String TEMPLATE_CODE_12_BANKOTHER = "SMS_174170436";

	private static final String TEMPLATE_CODE_13_BANK1 = "SMS_174165415";

	private static final String TEMPLATE_CODE_13_BANKOTHER = "SMS_174170457";

	private static final String TEMPLATE_CODE_OTHER = "SMS_174165429";

	@Autowired
	private SmsConfigProperties smsConfig;

	@Autowired
	private ITMessageInfoService messageInfoService;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("start send SalesPerformance message");
		Calendar cal = Calendar.getInstance();
		Date currDate = cal.getTime();

		TMessageInfoExample infoExample = new TMessageInfoExample();
		infoExample.createCriteria().andLogdateEqualTo(currDate).andStatusEqualTo(0);
		List<TMessageInfo> infoList = messageInfoService.selectByExample(infoExample);

		for (TMessageInfo info : infoList) {
			Map<String, String> queryMap = new HashMap<String, String>();
			int type = info.getType();
			if (type == 11) {
				queryMap = createType11Content(info);
			} else if (type == 12) {
				queryMap = createType12Content(info);
			} else if (type == 13) {
				queryMap = createType13Content(info);
			} else {
				queryMap = createTypeOtherContent(info);
			}

			sendMessage(queryMap, info.getId());

		}

		logger.info("end send SalesPerformance message");
	}

	/**
	 * type 11
	 * 
	 * @param info
	 * @return
	 */
	private Map<String, String> createType11Content(TMessageInfo info) {
		Map<String, String> queryMap = new HashMap<String, String>();
		String ywbName = info.getYwbname();
		if ("银行一部".equalsIgnoreCase(ywbName)) {
			Map<String, String> paramMap = new HashMap<String, String>();
			paramMap.put("name", info.getStaffername());
			paramMap.put("ml", String.valueOf(info.getMl()));
			paramMap.put("todayno", String.valueOf(info.getTodayno()));
			paramMap.put("notxt", info.getNotxt());

			String paramString = JSONObject.toJSONString(paramMap);

			queryMap.put("paramString", paramString);

			queryMap.put("phone", info.getMobile());
			// 模板code
			queryMap.put("templateCode", TEMPLATE_CODE_11_BANK1);

		} else {
			Map<String, String> paramMap = new HashMap<String, String>();
			paramMap.put("name", info.getStaffername());
			paramMap.put("ml", String.valueOf(info.getMl()));
			paramMap.put("todayno", String.valueOf(info.getTodayno()));
			paramMap.put("notxt", info.getNotxt());
			paramMap.put("syhxl", String.valueOf(info.getSyhxl()));
			paramMap.put("syhwcmb", info.getSyhwcmb());

			String paramString = JSONObject.toJSONString(paramMap);

			queryMap.put("paramString", paramString);

			queryMap.put("phone", info.getMobile());
			// 模板code
			queryMap.put("templateCode", TEMPLATE_CODE_11_BANKOTHER);

		}
		return queryMap;
	}

	/**
	 * type 12
	 * 
	 * @param info
	 * @return
	 */
	private Map<String, String> createType12Content(TMessageInfo info) {
		Map<String, String> queryMap = new HashMap<String, String>();
		String ywbName = info.getYwbname();
		if ("银行一部".equalsIgnoreCase(ywbName)) {
			Map<String, String> paramMap = new HashMap<String, String>();
			paramMap.put("name", info.getStaffername());
			paramMap.put("bmname", info.getBmname());
			paramMap.put("avgml", String.valueOf(info.getAvgml()));
			paramMap.put("todayavgno", String.valueOf(info.getTodayavgno()));
			paramMap.put("notxt", info.getNotxt());

			String paramString = JSONObject.toJSONString(paramMap);

			queryMap.put("paramString", paramString);

			queryMap.put("phone", info.getMobile());
			// 模板code
			queryMap.put("templateCode", TEMPLATE_CODE_12_BANK1);

		} else {
			Map<String, String> paramMap = new HashMap<String, String>();
			paramMap.put("name", info.getStaffername());
			paramMap.put("bmname", info.getBmname());
			paramMap.put("ml", String.valueOf(info.getMl()));
			paramMap.put("avgml", String.valueOf(info.getAvgml()));
			paramMap.put("todayavgno", String.valueOf(info.getTodayavgno()));
			paramMap.put("notxt", info.getNotxt());
			paramMap.put("syml", String.valueOf(info.getSyml()));

			String paramString = JSONObject.toJSONString(paramMap);

			queryMap.put("paramString", paramString);

			queryMap.put("phone", info.getMobile());
			// 模板code
			queryMap.put("templateCode", TEMPLATE_CODE_12_BANKOTHER);

		}
		return queryMap;
	}

	/**
	 * type 13
	 * 
	 * @param info
	 * @return
	 */
	private Map<String, String> createType13Content(TMessageInfo info) {
		Map<String, String> queryMap = new HashMap<String, String>();
		String ywbName = info.getYwbname();
		if ("银行一部".equalsIgnoreCase(ywbName)) {
			Map<String, String> paramMap = new HashMap<String, String>();
			paramMap.put("name", info.getStaffername());
			paramMap.put("bmname", info.getBmname());
			paramMap.put("avgml", String.valueOf(info.getAvgml()));
			paramMap.put("todayavgno", String.valueOf(info.getTodayavgno()));
			paramMap.put("notxt", info.getNotxt());

			String paramString = JSONObject.toJSONString(paramMap);

			queryMap.put("paramString", paramString);

			queryMap.put("phone", info.getMobile());
			// 模板code
			queryMap.put("templateCode", TEMPLATE_CODE_13_BANK1);

		} else {
			Map<String, String> paramMap = new HashMap<String, String>();
			paramMap.put("name", info.getStaffername());
			paramMap.put("bmname", info.getBmname());
			paramMap.put("ml", String.valueOf(info.getMl()));
			paramMap.put("avgml", String.valueOf(info.getAvgml()));
			paramMap.put("todayavgno", String.valueOf(info.getTodayavgno()));
			paramMap.put("todayavgnosyb", String.valueOf(info.getTodayavgnoSyb()));
			paramMap.put("notxt", info.getNotxt());
			paramMap.put("syml", String.valueOf(info.getSyml()));

			String paramString = JSONObject.toJSONString(paramMap);

			queryMap.put("paramString", paramString);

			queryMap.put("phone", info.getMobile());
			// 模板code
			queryMap.put("templateCode", TEMPLATE_CODE_13_BANKOTHER);

		}
		return queryMap;
	}

	/**
	 * type other
	 * 
	 * @param info
	 * @return
	 */
	private Map<String, String> createTypeOtherContent(TMessageInfo info) {
		Map<String, String> queryMap = new HashMap<String, String>();
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("name", info.getStaffername());
		paramMap.put("bmname", info.getBmname());
		paramMap.put("ml", String.valueOf(info.getMl()));
		paramMap.put("todaynosyb", String.valueOf(info.getTodaynoSyb()));
		paramMap.put("notxt", info.getNotxt());

		String paramString = JSONObject.toJSONString(paramMap);

		queryMap.put("paramString", paramString);

		queryMap.put("phone", info.getMobile());
		// 模板code
		queryMap.put("templateCode", TEMPLATE_CODE_OTHER);

		return queryMap;
	}

	/**
	 * 发送短信并更新状态
	 * 
	 * @param queryMap
	 * @param messageId
	 */
	public void sendMessage(Map<String, String> queryMap, int messageId) {

		DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", smsConfig.getAkid(), smsConfig.getAksecret());
		IAcsClient client = new DefaultAcsClient(profile);

		CommonRequest request = new CommonRequest();
		request.setMethod(MethodType.POST);
		request.setDomain(smsConfig.getSmshost());
		request.setVersion("2017-05-25");
		request.setAction("SendSms");
		request.putQueryParameter("RegionId", "cn-hangzhou");
		request.putQueryParameter("PhoneNumbers", queryMap.get("phone"));
		request.putQueryParameter("SignName", "永银文化");
		request.putQueryParameter("TemplateCode", queryMap.get("templateCode"));
		request.putQueryParameter("TemplateParam", queryMap.get("paramString"));
		try {
			CommonResponse response = client.getCommonResponse(request);

			JSONObject json = JSON.parseObject(response.getData());
			String returnCode = json.getString("Code");
			if (ALI_SMS_RESULT_SUCCESS.equalsIgnoreCase(returnCode)) {
				TMessageInfo updateInfo = new TMessageInfo();
				updateInfo.setId(messageId);
				updateInfo.setStatus(1);
				messageInfoService.updateByPrimaryKeySelective(updateInfo);
			}
		} catch (Exception e) {
			logger.error("send sms error", e);
		}
	}

}
