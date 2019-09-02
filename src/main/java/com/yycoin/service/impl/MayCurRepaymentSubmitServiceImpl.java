package com.yycoin.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.IMayCurRepaymentSubmitDao;
import com.yycoin.service.IMayCurRepaymentDetailService;
import com.yycoin.service.IMayCurRepaymentSubmitService;
import com.yycoin.vo.MayCurRepaymentDetailRootWithBLOBs;
import com.yycoin.vo.MayCurRepaymentSubmit;
import com.yycoin.vo.MayCurRepaymentSubmitExample;

@Service
public class MayCurRepaymentSubmitServiceImpl implements IMayCurRepaymentSubmitService {

	private static Logger logger = LoggerFactory.getLogger(MayCurRepaymentSubmitServiceImpl.class);

	@Autowired
	private IMayCurRepaymentSubmitDao mayCurRepaymentSubmitDao;

	@Autowired
	private IMayCurRepaymentDetailService mayCurRepaymentDetailService;

	@Override
	public int countByExample(MayCurRepaymentSubmitExample example) {
		return mayCurRepaymentSubmitDao.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurRepaymentSubmitExample example) {
		return mayCurRepaymentSubmitDao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		return mayCurRepaymentSubmitDao.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurRepaymentSubmit record) {
		return mayCurRepaymentSubmitDao.insert(record);
	}

	@Override
	public int insertSelective(MayCurRepaymentSubmit record) {
		return mayCurRepaymentSubmitDao.insertSelective(record);
	}

	@Override
	public List<MayCurRepaymentSubmit> selectByExample(MayCurRepaymentSubmitExample example) {
		return mayCurRepaymentSubmitDao.selectByExample(example);
	}

	@Override
	public MayCurRepaymentSubmit selectByPrimaryKey(String reportId) {
		return mayCurRepaymentSubmitDao.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurRepaymentSubmit record, MayCurRepaymentSubmitExample example) {
		return mayCurRepaymentSubmitDao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(MayCurRepaymentSubmit record, MayCurRepaymentSubmitExample example) {
		return mayCurRepaymentSubmitDao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurRepaymentSubmit record) {
		return mayCurRepaymentSubmitDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurRepaymentSubmit record) {
		return mayCurRepaymentSubmitDao.updateByPrimaryKey(record);
	}

	@Override
	public void saveSubmitData2OA(List<MayCurRepaymentSubmit> submitList) throws Exception {

		for (MayCurRepaymentSubmit submit : submitList) {

			MayCurRepaymentDetailRootWithBLOBs submitDetail = mayCurRepaymentDetailService
					.selectByPrimaryKey(submit.getReportId());
			if (submitDetail == null) {
				logger.error("query repayment submit detail error, reportid:" + submit.getReportId());
				continue;
			}

		}

	}

}
