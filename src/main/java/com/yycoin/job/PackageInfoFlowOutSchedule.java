package com.yycoin.job;

import java.util.List;
import java.util.Map;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yycoin.util.BaseContants;
import com.yycoin.vo.packageinfo.TCenterPackage;
import com.yycoin.vo.packageinfo.TCenterPackageItem;
import com.yycoin.vo.packageinfo.TCenterPackageItemExample;
import com.yycoin.vo.packageinfo.TCenterPackageItemMapper;
import com.yycoin.vo.packageinfo.TCenterPackageMapper;
import com.yycoin.vo.packageinfo.TCenterPackageMapperExt;

/**
 * 更新发货单的发票，赠品是单发还是混合发的状态
 * 
 * @author Administrator
 *
 */
@Component
public class PackageInfoFlowOutSchedule implements Job, BaseContants {

	private static Logger logger = LoggerFactory.getLogger(PackageInfoFlowOutSchedule.class);

	@Autowired
	private TCenterPackageMapperExt packageMapperExt;

	@Autowired
	private TCenterPackageMapper packageMapper;

	@Autowired
	private TCenterPackageItemMapper packageItemMapper;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("start PackageInfoFlowOutSchedule");

		List<Map<String, Object>> packageInfoList = packageMapperExt.queryPackageFlowOutData();

		for (Map<String, Object> map : packageInfoList) {

			String packageId = (String) map.get("packageid");

			TCenterPackage updatePackage = new TCenterPackage();
			updatePackage.setId(packageId);

			long allcnt = (long) map.get("allcnt");

			long fpcnt = (long) map.get("fpcnt");

			long zscnt = (long) map.get("zscnt");

			if (allcnt == fpcnt) {
				updatePackage.setInsfollowout(INVOICE_SHIP_ALONE);
			} else {
				updatePackage.setInsfollowout(INVOICE_SHIP_FOLLOW_OUT);
			}

			if (allcnt == zscnt) {
				updatePackage.setZsfollowout(ZS_SHIP_ALONE);
			} else {
				updatePackage.setZsfollowout(ZS_SHIP_FOLLOW_OUT);
			}
			// 取packageitem表中的最近一条记录的时间，并更新package表的billstime
			TCenterPackageItemExample itemExample = new TCenterPackageItemExample();
			itemExample.createCriteria().andPackageidEqualTo(packageId);
			itemExample.setOrderByClause(" outtime desc");

			List<TCenterPackageItem> itemList = packageItemMapper.selectByExample(itemExample);
			if (itemList.size() > 0) {
				TCenterPackageItem item = itemList.get(0);
				updatePackage.setBillstime(item.getOuttime());
			}

			// 更新package表
			packageMapper.updateByPrimaryKeySelective(updatePackage);
		}

		logger.info("end PackageInfoFlowOutSchedule");

	}

}
