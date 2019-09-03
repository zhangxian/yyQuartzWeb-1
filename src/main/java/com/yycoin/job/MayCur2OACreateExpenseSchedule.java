package com.yycoin.job;

import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yycoin.service.IMayCurExpenseDetailRootService;
import com.yycoin.service.IMayCurExpenseSubmitService;
import com.yycoin.util.BaseContants;
import com.yycoin.vo.MayCurExpenseDetailRootWithBLOBs;
import com.yycoin.vo.MayCurExpenseSubmit;
import com.yycoin.vo.MayCurExpenseSubmitExample;

@Component
public class MayCur2OACreateExpenseSchedule implements Job, BaseContants {

	private static Logger logger = LoggerFactory.getLogger(MayCur2OACreateExpenseSchedule.class);

	@Autowired
	private IMayCurExpenseSubmitService mayCurExpenseSubmitService;

	@Autowired
	private IMayCurExpenseDetailRootService mayCurExpenseDetailRootService;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("start create expense submit data to OA");
		MayCurExpenseSubmitExample submitExample = new MayCurExpenseSubmitExample();
		submitExample.createCriteria().andCreateflagEqualTo(0).andStatusEqualTo("SETTLEMENT");
		List<MayCurExpenseSubmit> submitList = mayCurExpenseSubmitService.selectByExample(submitExample);

		if (submitList.size() > 0) {
			try {
				for (MayCurExpenseSubmit submit : submitList) {
					MayCurExpenseDetailRootWithBLOBs submitDetail = mayCurExpenseDetailRootService
							.selectByPrimaryKey(submit.getReportId());
					if (submitDetail == null) {
						logger.error("query expense submit detail error, reportid:" + submit.getReportId());
						continue;
					}
					String subType = submitDetail.getFormsubtype();
					if (BaseContants.MAYCUR_FORM_SUBTYPE_CLFBXD.equalsIgnoreCase(subType)) {
						mayCurExpenseSubmitService.saveSubmitData2OA(submit, submitDetail,
								BaseContants.TCP_EXPENSETYPE_TRAVEL);
					} else if (BaseContants.MAYCUR_FORM_SUBTYPE_RCFYBX.equalsIgnoreCase(subType)) {
						mayCurExpenseSubmitService.saveSubmitData2OA(submit, submitDetail,
								BaseContants.TCP_EXPENSETYPE_PUBLIC);
					}
				}

			} catch (Exception e) {
				logger.error("create submit expense data to OA error", e);
			}
		}

	}

}
