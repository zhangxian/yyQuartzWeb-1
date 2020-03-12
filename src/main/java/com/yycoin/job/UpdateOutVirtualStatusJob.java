package com.yycoin.job;

import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yycoin.vo.bill.TCenterOut;
import com.yycoin.vo.bill.TCenterOutExample;
import com.yycoin.vo.bill.TCenterOutMapper;

/**
 * 更新正单的virtualstatus为1的时候,退单的virtualstatus也为1
 * 
 * @author Administrator
 *
 */
@Component
public class UpdateOutVirtualStatusJob implements Job {

	private static Logger logger = LoggerFactory.getLogger(UpdateOutVirtualStatusJob.class);

	@Autowired
	private TCenterOutMapper tCenterOutMapper;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("start UpdateOutVirtualStatusJob");

		TCenterOutExample example = new TCenterOutExample();
		example.createCriteria().andVirtualstatusEqualTo(1).andRefoutfullidEqualTo("");
		List<TCenterOut> outList = tCenterOutMapper.selectByExample(example);
		for (TCenterOut out : outList) {
			String fullId = out.getFullid();

			TCenterOutExample queryupdateexample = new TCenterOutExample();
			queryupdateexample.createCriteria().andRefoutfullidEqualTo(fullId).andVirtualstatusEqualTo(0);

			List<TCenterOut> updateList = tCenterOutMapper.selectByExample(queryupdateexample);
			for (TCenterOut updateOut : updateList) {
				TCenterOut oo = new TCenterOut();
				oo.setFullid(updateOut.getFullid());
				oo.setVirtualstatus(1);
				tCenterOutMapper.updateByPrimaryKeySelective(oo);
			}
		}

		logger.info("end UpdateOutVirtualStatusJob");
	}

}
