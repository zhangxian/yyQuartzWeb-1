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
import com.yycoin.service.ITMessageSyhService;
import com.yycoin.util.BaseContants;
import com.yycoin.util.SmsConfigProperties;
import com.yycoin.vo.TMessageSyh;
import com.yycoin.vo.TMessageSyhExample;

/**
 * 世园会短信发送类
 * 
 * @author Administrator
 *
 */
@DisallowConcurrentExecution
@Component
public class SYHSendSmsSchedule implements Job, BaseContants {

	private static Logger logger = LoggerFactory.getLogger(SYHSendSmsSchedule.class);

	@Autowired
	private ITMessageSyhService syhService;

	/**
	 * 短信未发送状态
	 */
	private final int MESSAGESTATUS_0 = 0;

	@Autowired
	private SmsConfigProperties smsConfig;

	/**
	 * 每天早晨八点40分执行一次
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("start SYHSendSmsSchedule");

		Calendar cal = Calendar.getInstance();
		Date currDate = cal.getTime();
		TMessageSyhExample example = new TMessageSyhExample();
		example.createCriteria().andLogdateEqualTo(currDate).andStatusEqualTo(MESSAGESTATUS_0);
		List<TMessageSyh> queryList = syhService.selectByExample(example);
		Map<String, String> queryMap = new HashMap<String, String>();
		for (TMessageSyh message : queryList) {
			int type = message.getType();
			if (type == 1) {
				queryMap = createType1Content(message);
			}
			if (type == 2) {
				queryMap = createType2Content(message);
			}
			if (type == 3) {
				queryMap = createType3Content(message);
			}
			if (type == 4) {
				queryMap = createType4Content(message);
			}
			sendMessage(queryMap);
		}

		logger.info("end SYHSendSmsSchedule");
	}

	/**
	 * 世园会个人销量
	 * 
	 * @param message
	 * @return
	 */
	public Map<String, String> createType1Content(TMessageSyh message) {
		Map<String, String> queryMap = new HashMap<String, String>();

		queryMap.put("phone", message.getMobile());
		// 模板code
		queryMap.put("templateCode", "SMS_174023633");

		queryMap.put("messageId", message.getId().toString());

		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("name", message.getStaffername());
		paramMap.put("mb", message.getMb().toString());
		paramMap.put("xl", message.getXl().toString());
		paramMap.put("wcl", message.getWcl());
		paramMap.put("todayno", message.getTodayno().toString());
		paramMap.put("notxt", message.getNotxt());

		String paramString = JSONObject.toJSONString(paramMap);

		queryMap.put("paramString", paramString);

		return queryMap;
	}

	/**
	 * 世园会团队销量
	 * 
	 * @param message
	 * @return
	 */
	public Map<String, String> createType2Content(TMessageSyh message) {
		Map<String, String> queryMap = new HashMap<String, String>();

		queryMap.put("phone", message.getMobile());
		// 模板code
		queryMap.put("templateCode", "SMS_174029066");

		queryMap.put("messageId", message.getId().toString());

		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("name", message.getStaffername());
		paramMap.put("bmname", message.getBmname());
		paramMap.put("mb", message.getMb().toString());
		paramMap.put("xl", message.getXl().toString());
		paramMap.put("wcl", message.getWcl());
		paramMap.put("todayno", message.getTodayno().toString());
		paramMap.put("notxt", message.getNotxt());

		String paramString = JSONObject.toJSONString(paramMap);

		queryMap.put("paramString", paramString);

		return queryMap;
	}

	/**
	 * 世园会大区销量
	 * 
	 * @param message
	 * @return
	 */
	public Map<String, String> createType3Content(TMessageSyh message) {
		Map<String, String> queryMap = new HashMap<String, String>();

		queryMap.put("phone", message.getMobile());
		// 模板code
		queryMap.put("templateCode", "SMS_174029074");

		queryMap.put("messageId", message.getId().toString());

		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("name", message.getStaffername());
		paramMap.put("bm", message.getBmname());
		paramMap.put("mb", message.getMb().toString());
		paramMap.put("xl", message.getXl().toString());
		paramMap.put("wcl", message.getWcl());
		paramMap.put("todayno", message.getTodayno().toString());

		String paramString = JSONObject.toJSONString(paramMap);

		queryMap.put("paramString", paramString);

		return queryMap;
	}

	/**
	 * 世园会各部销量
	 * 
	 * @param message
	 * @return
	 */
	public Map<String, String> createType4Content(TMessageSyh message) {
		Map<String, String> queryMap = new HashMap<String, String>();

		queryMap.put("phone", message.getMobile());
		// 模板code
		queryMap.put("templateCode", "SMS_174029086");

		queryMap.put("messageId", message.getId().toString());

		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("name", message.getStaffername());
		paramMap.put("ywb", message.getYwbname());
		paramMap.put("mb", message.getMb().toString());
		paramMap.put("xl", message.getXl().toString());
		paramMap.put("wcl", message.getWcl());

		String paramString = JSONObject.toJSONString(paramMap);

		queryMap.put("paramString", paramString);

		return queryMap;
	}

	/**
	 * 发送短信并更新状态
	 * 
	 * @param queryMap
	 * @param messageId
	 */
	public void sendMessage(Map<String, String> queryMap) {

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
				TMessageSyhExample updateExample = new TMessageSyhExample();
				updateExample.createCriteria().andIdEqualTo(Integer.valueOf(queryMap.get("messageId")));
				TMessageSyh updateRecord = new TMessageSyh();
				updateRecord.setStatus(1);
				syhService.updateByExampleSelective(updateRecord, updateExample);
			}
		} catch (Exception e) {
			logger.error("send sms error", e);
		}
	}

}
