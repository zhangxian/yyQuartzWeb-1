package com.yycoin.job;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yycoin.pojo.maycur.MayCurAuthInfo;
import com.yycoin.pojo.maycur.MayCurResultData;
import com.yycoin.service.IMayCurConsumeSubmitService;
import com.yycoin.service.IMayCurExpenseSubmitService;
import com.yycoin.util.BaseContants;
import com.yycoin.util.DateUtils;
import com.yycoin.util.MayCurConfigProperties;
import com.yycoin.util.MayCurUtils;
import com.yycoin.vo.MayCurConsumeSubmit;
import com.yycoin.vo.MayCurConsumeSubmitExample;
import com.yycoin.vo.MayCurExpenseSubmit;
import com.yycoin.vo.MayCurExpenseSubmitExample;

@Component
public class MayCurExportSchedule implements Job, BaseContants {

	private static Logger logger = LoggerFactory.getLogger(MayCurExpenseSubmitSchedule.class);

	@Autowired
	private MayCurUtils mayCurUtils;

	@Autowired
	private MayCurConfigProperties mayCurConfigProperties;

	@Autowired
	private IMayCurExpenseSubmitService mayCurExpenseSubmitService;

	@Autowired
	private IMayCurConsumeSubmitService mayCurConsumeSubmitService;

	@SuppressWarnings("rawtypes")
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {

		logger.info("start export expense submit");
		MayCurExpenseSubmitExample expenseSubmitExample = new MayCurExpenseSubmitExample();
		expenseSubmitExample.createCriteria().andExportflagEqualTo(0);
		List<MayCurExpenseSubmit> expenseList = mayCurExpenseSubmitService.selectByExample(expenseSubmitExample);
		if (expenseList.size() > 0) {

			logger.info("start export expense,do login maycur");
			MayCurResultData<MayCurAuthInfo> loginResult = mayCurUtils.loginMayCurOpenAPI();
			logger.info(loginResult.toString());
			String code = loginResult.getCode();

			if (MAYCUR_SUCCESS_CODE.equalsIgnoreCase(code)) {
				String entCode = loginResult.getData().getEntCode();
				String tokenId = loginResult.getData().getTokenId();
				long timestamp = loginResult.getData().getTimestamp();
				Map<String, String> header = new HashMap<String, String>();
				header.put("entCode", entCode);
				header.put("tokenId", tokenId);
				String exportUrlPath = mayCurConfigProperties.getHost() + mayCurConfigProperties.getExpenseexport();
				String currDateTime = DateUtils.getCurrDateTime();
				for (MayCurExpenseSubmit expense : expenseList) {
					String businessCode = expense.getReportId();
					List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("businessCode", businessCode);
					map.put("exportStatus", "1");
					list.add(map);
					MayCurResultData exportResultData = mayCurUtils.synchronizeToMaycur(header, timestamp,
							exportUrlPath, "POST", "application/json", "UTF-8", list);
					String exportResultCode = exportResultData.getCode();
					logger.info("export expense businesscode:" + businessCode + " result code:" + exportResultCode);
					if (MAYCUR_SUCCESS_CODE.equalsIgnoreCase(exportResultCode)) {
						MayCurExpenseSubmitExample updateExample = new MayCurExpenseSubmitExample();
						updateExample.createCriteria().andReportIdEqualTo(businessCode).andExportflagEqualTo(0);
						MayCurExpenseSubmit updateRecord = new MayCurExpenseSubmit();
						updateRecord.setReportId(businessCode);
						updateRecord.setExportflag(1);
						updateRecord.setExporttime(currDateTime);
						mayCurExpenseSubmitService.updateByExampleSelective(updateRecord, updateExample);

					}

				}
			}
		}

		logger.info("end export expense submit");

		logger.info("start export consume submit");
		MayCurConsumeSubmitExample consumeSubmitExample = new MayCurConsumeSubmitExample();
		consumeSubmitExample.createCriteria().andExportflagEqualTo(0);
		List<MayCurConsumeSubmit> consumeList = mayCurConsumeSubmitService.selectByExample(consumeSubmitExample);
		if (consumeList.size() > 0) {

			logger.info("start export consume,do login maycur");
			MayCurResultData<MayCurAuthInfo> loginResult = mayCurUtils.loginMayCurOpenAPI();

			logger.info(loginResult.toString());

			String code = loginResult.getCode();

			if (MAYCUR_SUCCESS_CODE.equalsIgnoreCase(code)) {
				String entCode = loginResult.getData().getEntCode();
				String tokenId = loginResult.getData().getTokenId();
				long timestamp = loginResult.getData().getTimestamp();
				Map<String, String> header = new HashMap<String, String>();
				header.put("entCode", entCode);
				header.put("tokenId", tokenId);
				String exportUrlPath = mayCurConfigProperties.getHost() + mayCurConfigProperties.getConsumeexport();
				String currDateTime = DateUtils.getCurrDateTime();
				for (MayCurConsumeSubmit consume : consumeList) {
					String businessCode = consume.getReportId();
					List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("businessCode", businessCode);
					map.put("exportStatus", "1");
					list.add(map);
					MayCurResultData exportResultData = mayCurUtils.synchronizeToMaycur(header, timestamp,
							exportUrlPath, "POST", "application/json", "UTF-8", list);
					String exportResultCode = exportResultData.getCode();
					logger.info("export consume businesscode:" + businessCode + " result code:" + exportResultCode);
					if (MAYCUR_SUCCESS_CODE.equalsIgnoreCase(exportResultCode)) {
						MayCurConsumeSubmitExample updateExample = new MayCurConsumeSubmitExample();
						updateExample.createCriteria().andReportIdEqualTo(businessCode).andExportflagEqualTo(0);
						MayCurConsumeSubmit updateRecord = new MayCurConsumeSubmit();
						updateRecord.setReportId(businessCode);
						updateRecord.setExportflag(1);
						updateRecord.setExporttime(currDateTime);
						mayCurConsumeSubmitService.updateByExampleSelective(updateRecord, updateExample);
					}

				}
			}
		}

		logger.info("end export consume submit");
	}

}
