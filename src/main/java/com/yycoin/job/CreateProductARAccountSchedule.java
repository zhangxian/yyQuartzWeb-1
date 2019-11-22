package com.yycoin.job;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yycoin.util.DateUtils;
import com.yycoin.vo.product.TCenterProductArAccount;
import com.yycoin.vo.product.TCenterProductArAccountMapper;
import com.yycoin.vo.product.TCenterStorageRalation;
import com.yycoin.vo.product.TCenterStorageRalationMapperExt;

/**
 * 计算产品账龄JOB
 * 
 * @author Administrator
 *
 */
@Component
public class CreateProductARAccountSchedule implements Job {

	private static Logger logger = LoggerFactory.getLogger(CreateProductARAccountSchedule.class);

	@Autowired
	private TCenterStorageRalationMapperExt tCenterStorageRalationMapperExt;

	@Autowired
	private TCenterProductArAccountMapper tCenterProductArAccountMapper;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("start CreateProductARAccountSchedule");

		List<TCenterStorageRalation> relationList = tCenterStorageRalationMapperExt.selectAmountGrateThanZeroData();
		String currDateTime = DateUtils.getCurrDateTime();
		String currDate = DateUtils.getCurrDate();
		if (relationList.size() > 0) {
			tCenterProductArAccountMapper.deleteByExample(null);
		}
		for (TCenterStorageRalation relation : relationList) {
			List<TCenterProductArAccount> productArList = new ArrayList<TCenterProductArAccount>();
			String productId = relation.getProductid();

			String price = relation.getPrice().toString();
			String virtualPrice = relation.getVirtualprice().toString();

			String idKey = productId + price + virtualPrice;

			int totalAmount = relation.getAmount();
			int totalAmountTemp = totalAmount;

			Map<String, String> paramMap = new HashMap<String, String>();
			paramMap.put("productId", productId);
			paramMap.put("price", price);
			paramMap.put("virtualPrice", virtualPrice);
			List<TCenterStorageRalation> changeDataList = tCenterStorageRalationMapperExt.selectAllChangeData(paramMap);
			logger.info("productId :" + productId + ";price:" + price + ";virtualPrice:" + virtualPrice
					+ ";changeDataList size:" + changeDataList.size());

			for (TCenterStorageRalation sr : changeDataList) {
				String changeTime = sr.getChangetime();
				int srAmount = sr.getAmount();
				int last = totalAmountTemp - srAmount;
				TCenterProductArAccount arAccount = new TCenterProductArAccount();
				arAccount.setIdKey(idKey);
				arAccount.setProductid(productId);
				arAccount.setProductname(relation.getProductname());
				arAccount.setPrice(new BigDecimal(price));
				arAccount.setVirtualPrice(new BigDecimal(virtualPrice));
				arAccount.setTotalAmount(totalAmount);
				if (StringUtils.isEmpty(changeTime)) {
					changeTime = "2010-01-01";
				}
				logger.info("changeTime :" + changeTime + ";currDate:" + currDate);
				Long dateMargin = DateUtils.daysBetweenToday(changeTime, currDate);
				arAccount.setDateMargin(dateMargin.intValue());
				arAccount.setChangeTime(changeTime);
				arAccount.setCreateTime(currDateTime);
				if (last > 0) {
					arAccount.setAmount(srAmount);
					totalAmountTemp = last;
					productArList.add(arAccount);
				} else {
					arAccount.setAmount(totalAmountTemp);
					productArList.add(arAccount);
					break;
				}
			}
			for (TCenterProductArAccount arAccount : productArList) {
				tCenterProductArAccountMapper.insert(arAccount);
			}
		}
//		if (productArList.size() > 0) {
//			tCenterProductArAccountMapper.insertBatch(productArList);
//		}
		logger.info("end CreateProductARAccountSchedule");
	}

}
