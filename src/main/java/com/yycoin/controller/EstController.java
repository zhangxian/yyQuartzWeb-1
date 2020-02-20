package com.yycoin.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yycoin.service.h5api.EstService;
import com.yycoin.service.h5api.THgPayService;
import com.yycoin.vo.h5api.THgEstimate;
import com.yycoin.vo.h5api.THgPay;

/**
 * @author SunQi
 * @Description: 商品信息添加
 * @date Create in 2017/10/18 13:59
 */
@Controller
@RequestMapping("est")
public class EstController {

	@Autowired
	private EstService estService;

	@Autowired
	private THgPayService tHgPayService;

	// 添加
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public @ResponseBody String addEst(@RequestParam("cate") String cate, @RequestParam("year") Integer year,
			@RequestParam("standard") String standard, @RequestParam("condition") String condition,
			@RequestParam("packaged") String packaged, @RequestParam("certificate") String certificate,
			@RequestParam("amount") String amount, @RequestParam("price") String price,
			@RequestParam("estimateid") String estimateid, @RequestParam("token") String token) throws Exception {

//        if(!token.equals(md5(cate))){
//            return "205";
//        }

		if (StringUtils.isEmpty(cate) || year == null || StringUtils.isEmpty(standard) || StringUtils.isEmpty(condition)
				|| StringUtils.isEmpty(packaged) || StringUtils.isEmpty(certificate) || StringUtils.isEmpty(amount)
				|| StringUtils.isEmpty(price) || StringUtils.isEmpty(estimateid) || StringUtils.isEmpty(token)) {
			return "0";
		}

		THgEstimate est = new THgEstimate();
		// 将系统日期设置成数据库日期类型
		Date date = new Date();
		String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);// 将时间格式转换成符合Timestamp要求的格式.
		Timestamp ctime = Timestamp.valueOf(nowTime);// 把时间转换
		est.setCreatetime(ctime);

		est.setCategory(cate);
		est.setYeard(String.valueOf(year));
		est.setStandard(standard);
		est.setConditiond(condition);
		est.setPackaged(packaged);
		est.setCertificate(certificate);
		est.setAmount(amount);
		est.setPrice(price);
		est.setEstimateid(estimateid);

		// 调用Service添加
		estService.addEst(est);
		return "1";
	}

	@RequestMapping(value = "addPay", method = RequestMethod.POST)
	public @ResponseBody String addPay(@RequestParam("backid") String backid, @RequestParam("bank") String bank,
			@RequestParam("bankNo") String bankNo, @RequestParam("khname") String khname,
			@RequestParam("money") String money, @RequestParam("status") String status,
			@RequestParam("transportno") String transportno) throws Exception {
		if (StringUtils.isEmpty(backid) || StringUtils.isEmpty(bank) || StringUtils.isEmpty(bankNo)
				|| StringUtils.isEmpty(khname) || StringUtils.isEmpty(money) || StringUtils.isEmpty(status)
				|| StringUtils.isEmpty(transportno)) {
			return "0";
		}

		THgPay pay = new THgPay();
		// 将系统日期设置成数据库日期类型
		Date date = new Date();
		String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);// 将时间格式转换成符合Timestamp要求的格式.
		Timestamp ctime = Timestamp.valueOf(nowTime);// 把时间转换

		pay.setBank(bank);
		pay.setBankno(bankNo);
		pay.setKhname(khname);
		pay.setMoney(money);
		pay.setStatus(status);
		pay.setCreater("黄金回购");
		pay.setCreatetime(ctime);
		pay.setBackid(backid);
		pay.setTransportno(transportno);
		// 调用Service添加
		tHgPayService.insert(pay);
		return "1";
	}

}
