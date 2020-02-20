package com.yycoin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yycoin.service.h5api.ListLogService;
import com.yycoin.vo.h5api.THgListlog;

/**
 * @author SunQi
 * @Description: 查询页面
 * @date Create in 2017/10/23 11:04
 */
@Controller
@RequestMapping("queryLog")
public class ListLogController {

	// 注入Service
	@Autowired
	private ListLogService listLogService;

	// 根据手机号查询回购
	@RequestMapping(value = "queryPhone", method = RequestMethod.GET)
	@ResponseBody
	public List<THgListlog> queryPhone(@RequestParam("phone") String phone, @RequestParam("token") String token)
			throws Exception {

//        if(!token.equals(md5(phone))){
//            List<String> b = new ArrayList<String>();
//            b.add("205");
//            return b;
//        }

		// 调用Service查询
		// 根据手机号查询单号、收货时间
		List<THgListlog> listphone = listLogService.findByPhone(phone);

		return listphone;
	}

	// 根据订单号查询信息
	@RequestMapping(value = "queryLog", method = RequestMethod.GET)
	@ResponseBody
	public List<THgListlog> queryNoId(@RequestParam("backId") String NoId, @RequestParam("token") String token)
			throws Exception {

//        if(!token.equals(md5(NoId))){
//            List<String> b = new ArrayList<String>();
//            b.add("205");
//            return b;
//        }

		// 调用Service查询
		// 根据单号查询信息
		List<THgListlog> listNoId = listLogService.findByNoId(NoId);

		return listNoId;
	}

	@RequestMapping(value = "updateListLogStatus", method = RequestMethod.POST)
	@ResponseBody
	public List<String> updateListLogStatus(@RequestParam("backId") String NoId, @RequestParam("status") String status)
			throws Exception {
		listLogService.updateListLogStatus(NoId, status);

		List<String> result = new ArrayList<>();
		result.add("OK");
		return result;
	}

}
