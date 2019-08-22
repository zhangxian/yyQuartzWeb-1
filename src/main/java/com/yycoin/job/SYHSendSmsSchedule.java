package com.yycoin.job;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yycoin.service.ITMessageSyhService;
import com.yycoin.util.BaseContants;
import com.yycoin.util.DateUtils;
import com.yycoin.util.HttpUtils;
import com.yycoin.util.SmsConfigProperties;
import com.yycoin.vo.TMessageSyh;
import com.yycoin.vo.TMessageSyhExample;

import net.sf.json.JSONObject;

/**
 * 世园会短信发送类
 * 
 * @author Administrator
 *
 */
@DisallowConcurrentExecution
@Component
public class SYHSendSmsSchedule implements Job {

	private static Logger logger = LoggerFactory.getLogger(SYHSendSmsSchedule.class);

	@Autowired
	private ITMessageSyhService syhService;

	/**
	 * 短信未发送状态
	 */
	private final int MESSAGESTATUS_0 = 0;

	/**
	 * 短信内容分隔符
	 */
	private final String CONENT_SPERATOR = "|";

	private final String RETURN_CODE_SUCCESS = "OK";

	@Autowired
	private SmsConfigProperties smcConfig;

	/**
	 * 每天早晨八点40分执行一次
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("start SYHSendSmsSchedule");

		Calendar cal = Calendar.getInstance();
		Date currDate = cal.getTime();
		String currDateString = DateUtils.getDateStringByDate(currDate, BaseContants.DATE_FORMAT_YYYYMMDD);
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
			sendMessage(queryMap, message.getId());
		}

		logger.info("end SYHSendSmsSchedule");
	}

	/**
	 * 类型1
	 * 
	 * @param message
	 * @return
	 */
	public Map<String, String> createType1Content(TMessageSyh message) {
		Map<String, String> queryMap = new HashMap<String, String>();
		StringBuilder builder = new StringBuilder();
		builder.append(message.getStaffername());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getMb());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getXl());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getWcl());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getTodayno());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getNotxt());

		queryMap.put("param", builder.toString());
		queryMap.put("phone", message.getMobile());
		queryMap.put("sign", "48411"); // 签名
		queryMap.put("skin", "75728"); // 模板

		return queryMap;
	}

	/**
	 * 类型2
	 * 
	 * @param message
	 * @return
	 */
	public Map<String, String> createType2Content(TMessageSyh message) {
		Map<String, String> queryMap = new HashMap<String, String>();
		StringBuilder builder = new StringBuilder();
		builder.append(message.getStaffername());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getBmname());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getMb());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getXl());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getWcl());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getTodayno());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getNotxt());

		queryMap.put("param", builder.toString());
		queryMap.put("phone", message.getMobile());
		queryMap.put("sign", "48411"); // 签名
		queryMap.put("skin", "75737"); // 模板

		return queryMap;
	}

	/**
	 * 类型3
	 * 
	 * @param message
	 * @return
	 */
	public Map<String, String> createType3Content(TMessageSyh message) {
		Map<String, String> queryMap = new HashMap<String, String>();
		StringBuilder builder = new StringBuilder();
		builder.append(message.getStaffername());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getBmname());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getMb());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getXl());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getWcl());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getTodayno());

		queryMap.put("param", builder.toString());
		queryMap.put("phone", message.getMobile());
		queryMap.put("sign", "48411"); // 签名
		queryMap.put("skin", "75746"); // 模板

		return queryMap;
	}

	/**
	 * 类型4
	 * 
	 * @param message
	 * @return
	 */
	public Map<String, String> createType4Content(TMessageSyh message) {
		Map<String, String> queryMap = new HashMap<String, String>();
		StringBuilder builder = new StringBuilder();
		builder.append(message.getStaffername());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getYwbname());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getMb());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getXl());
		builder.append(CONENT_SPERATOR);
		builder.append(message.getWcl());

		queryMap.put("param", builder.toString());
		queryMap.put("phone", message.getMobile());
		queryMap.put("sign", "48411"); // 签名
		queryMap.put("skin", "75755"); // 模板

		return queryMap;
	}

	/**
	 * 发送短信并更新状态
	 * 
	 * @param queryMap
	 * @param messageId
	 */
	public void sendMessage(Map<String, String> queryMap, int messageId) {
		try {
			Map<String, String> headers = new HashMap<String, String>();
			headers.put("Authorization", "APPCODE " + smcConfig.getAppcode());

			HttpResponse response = HttpUtils.doGet(smcConfig.getUrl(), smcConfig.getContext(), smcConfig.getMethod(),
					headers, queryMap);

			String result = EntityUtils.toString(response.getEntity());

			JSONObject json = JSONObject.fromObject(result);

			String returnCode = json.getString("Code");

			logger.info("message id:" + messageId + ";send result:" + returnCode);

			if (RETURN_CODE_SUCCESS.equalsIgnoreCase(returnCode)) {
				TMessageSyhExample updateExample = new TMessageSyhExample();
				updateExample.createCriteria().andIdEqualTo(messageId);
				TMessageSyh updateRecord = new TMessageSyh();
				updateRecord.setStatus(1);
				syhService.updateByExample(updateRecord, updateExample);
			}
		} catch (Exception e) {
			logger.error("message id:" + messageId + " send error", e);
			e.printStackTrace();
		}
	}

}
