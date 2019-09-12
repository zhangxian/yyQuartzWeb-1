package com.yycoin.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yycoin.pojo.maycur.MayCurAuthInfo;
import com.yycoin.pojo.maycur.MayCurResultData;

@Component
public class MayCurUtils implements BaseContants {

	private static Logger logger = LoggerFactory.getLogger(MayCurUtils.class);

	@Autowired
	private MayCurConfigProperties mayCurConfigProperties;

	/**
	 * 获取每刻开放api身份验证信息 测试自己公司的时候 把配置文件里面的每刻配置修改成自己公司的--
	 * 
	 * @return
	 */
	public MayCurResultData<MayCurAuthInfo> loginMayCurOpenAPI() {

		// Result封装的是结果信息
		MayCurResultData<MayCurAuthInfo> authResult = new MayCurResultData<MayCurAuthInfo>();
		// 每刻平台主机常量KEY https://uat.maycur.com
		String maycurHost = mayCurConfigProperties.getHost();
		// 公司的code (app_client 里面的code)
		String appCode = mayCurConfigProperties.getCode();
		// 公司的密钥 每刻平台应用秘钥常量KEY(app_client 里面的secret)
		String secret = mayCurConfigProperties.getSecret();
		long timestamp = System.currentTimeMillis(); // 时间戳
		String secretKey = DigestUtils.sha256Hex((secret + ":" + appCode + ":" + timestamp).getBytes());// 经过sha256
																										// 加密后的密钥
		String authParam = "{\"appCode\":\"" + appCode + "\", \"secret\": \"" + secretKey + "\", \"timestamp\": \""
				+ timestamp + "\"}";
		String authapi = mayCurConfigProperties.getAuthapi();// 身份认证的路径 /api/openapi/auth/login
		String urlPath = maycurHost + authapi;// 身份认证的完整路径 https://uat.maycur.com/api/openapi/auth/login
		logger.info("authParam====" + authParam);
		logger.info(urlPath);
		try {
			// 拿到登陆后返回的json 数据
			String authStr = HttpClientUtil.sendRequest(urlPath, "POST", "application/json", "UTF-8",
					new HashMap<String, String>(), authParam);
			logger.info("登陆发送请求后返回的json 数据为：" + authStr);
			JSONObject jo = JSON.parseObject(authStr);
			String responseCode = jo.getString("code");// json 中的 code 字段的值
			if (MAYCUR_SUCCESS_CODE.equalsIgnoreCase(responseCode)) { // "ACK".equals code
				JSONObject jdata = jo.getJSONObject("data");// json 中data 字段的值
				MayCurAuthInfo authInfo = new MayCurAuthInfo();
				authInfo.setEntCode(jdata.getString("entCode"));
				authInfo.setTokenId(jdata.getString("tokenId"));
				authInfo.setTimestamp(timestamp);
				authResult.setCode(MAYCUR_SUCCESS_CODE);
				authResult.setData(authInfo);
			} else {
				authResult.setCode(MAYCUR_FAIL_CODE);
				authResult.setMessage(jo.getString("message"));
			}
		} catch (Exception e) {
			logger.error("每刻身份校验异常，请求参数：" + authParam, e);
			authResult.setCode(MAYCUR_FAIL_CODE);
			authResult.setMessage("调用每刻身份验证异常");
		}
		return authResult;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public MayCurResultData synchronizeToMaycur(Map<String, String> header, long timestamp, String urlPath,
			String httpMethod, String contentType, String encode, Object dataInfors) {
		MayCurResultData result = new MayCurResultData();
		String dataStr = null;
		// 判断携带的参数是否为空，如果不为空，把时间戳和携带的参数设置进map里
		if (dataInfors != null) {
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("timestamp", timestamp);//
			paramMap.put("data", dataInfors);// data
			dataStr = JSONObject.toJSONString(paramMap);// 将对象转化为Json字符串
		}
		logger.info("请求json为：" + dataStr);
		String resultStr = null;
		try {
			// 访问要访问的网址 并且携带有 headers头信息和 要携带的参数
			resultStr = HttpClientUtil.sendRequest(urlPath, httpMethod, contentType, encode, header, dataStr);
			logger.info("返回数据:" + resultStr);
			JSONObject jo = JSON.parseObject(resultStr);
			String responseCode = jo.getString("code");// code
			if (BaseContants.MAYCUR_SUCCESS_CODE.equalsIgnoreCase(responseCode)) { // "ACK".equals code
				result.setData(jo.getString("data"));// data //这里需要注意下获取 data的方式
				result.setCode(responseCode);
			} else {
				result.setCode(responseCode);
				result.setMessage(jo.getString("message"));
			}
		} catch (Exception e) {
			result.setCode(BaseContants.MAYCUR_FAIL_CODE);
			result.setMessage(e.getMessage());
			logger.error("调用每刻接口异常", e);
		}
		return result;
	}

}
