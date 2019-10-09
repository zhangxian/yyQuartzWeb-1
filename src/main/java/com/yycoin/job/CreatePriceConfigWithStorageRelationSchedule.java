package com.yycoin.job;

import java.util.ArrayList;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yycoin.dao.common.ICommonSequenceDao;
import com.yycoin.util.CommonSequenceUtils;
import com.yycoin.vo.product.TCenterPriceConfig;
import com.yycoin.vo.product.TCenterPriceConfigMapper;
import com.yycoin.vo.product.TCenterStorageRalation;
import com.yycoin.vo.product.TCenterStorageRalationMapperExt;

/**
 * 产品库存表，生成金银价格数据
 * 
 * @author Administrator
 *
 */
@Component
public class CreatePriceConfigWithStorageRelationSchedule implements Job {

	private static Logger logger = LoggerFactory.getLogger(CreatePriceConfigWithStorageRelationSchedule.class);

	@Autowired
	private TCenterStorageRalationMapperExt storageRelationMapperExt;

	@Autowired
	private ICommonSequenceDao sequenceDao;

	@Autowired
	private TCenterPriceConfigMapper priceConfigMapper;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("start CreatePriceConfigWithStorageRelationSchedule");

		List<TCenterStorageRalation> relationList = storageRelationMapperExt.selectData2Make();

		List<String> productIdList = new ArrayList<String>();

		for (TCenterStorageRalation relation : relationList) {

			String productId = relation.getProductid();
			if (productIdList.contains(productId)) {
				continue;
			}
			productIdList.add(productId);
			TCenterPriceConfig priceConfig = new TCenterPriceConfig();
			// 2015/11/7 默认不随金银价波动
			priceConfig.setFtype(1);
			String id = CommonSequenceUtils.getSquenceString20(sequenceDao.getSquenceString20().toString());
			priceConfig.setId(id);
			priceConfig.setType(1);
			priceConfig.setProductid(productId);
			priceConfig.setGspriceup(relation.getPrice());

			priceConfigMapper.insert(priceConfig);

		}

		logger.info("end CreatePriceConfigWithStorageRelationSchedule");

	}

}
