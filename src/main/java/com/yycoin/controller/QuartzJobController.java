package com.yycoin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yycoin.pojo.ResultData;
import com.yycoin.pojo.TCenterTaskScheduler;
import com.yycoin.service.IQuartzJobService;
import com.yycoin.util.BaseContants;
import com.yycoin.util.DataGridBean;
import com.yycoin.util.PageBean;

/**
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/job")
public class QuartzJobController extends BaseController implements BaseContants {

	private static Logger log = LoggerFactory.getLogger(QuartzJobController.class);

	@Autowired
	private IQuartzJobService quartzJobService;

	/**
	 * 查询所有的定时任务
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("/taskList")
	public ModelAndView taskList() {
		log.info("taskList");
		ModelAndView view = new ModelAndView();
		view.setViewName("jobview");
		return view;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/queryPageData")
	@ResponseBody
	public DataGridBean queryPageData(HttpServletRequest request) throws SchedulerException {

		String pageNumberStr = request.getParameter("page");
		if (!StringUtils.isEmpty(pageNumberStr)) {
			pageNumber = Integer.valueOf(pageNumberStr);
		}
		String pageSizeStr = request.getParameter("rows");

		if (!StringUtils.isEmpty(pageSizeStr)) {
			pageSize = Integer.valueOf(pageSizeStr);
		}
		String description = request.getParameter("description");
		String jobStatus = request.getParameter("status");
		Map<String, String> paramMap = new HashMap<String, String>();
		if (StringUtils.isNotEmpty(description)) {
			paramMap.put("description", description);
		}
		if (StringUtils.isNotEmpty(jobStatus)) {
			paramMap.put("jobStatus", jobStatus);
		}
		int count = quartzJobService.countAllJobs(paramMap);
		PageBean pg = getPageBean(pageNumber, pageSize, count);
		List<TCenterTaskScheduler> schedulerList = quartzJobService.getAllJobsByPage(paramMap, pg);
		DataGridBean dataGrid = new DataGridBean<>();
		dataGrid.setRows(schedulerList);
		dataGrid.setTotal(pg.getTotalRecord());
		return dataGrid;
	}

	@RequestMapping("/addScheduler")
	@ResponseBody
	public ResultData addScheduler(HttpServletRequest request) {
		ResultData resultData = new ResultData();
		resultData.setReturnCode(RESULT_SUCCESS_CODE);
		resultData.setReturnMsg("新增调度任务成功!");
		try {
			String adddescription = request.getParameter("adddescription");
			String addbeanclass = request.getParameter("addbeanclass");
			String addjobcronExpression = request.getParameter("addjobcronExpression");
			if (StringUtils.isEmpty(adddescription)) {
				resultData.setReturnCode(RESULT_ERROR_CODE);
				resultData.setReturnMsg("任务描述不能为空");
				return resultData;
			}
			if (StringUtils.isEmpty(addbeanclass)) {
				resultData.setReturnCode(RESULT_ERROR_CODE);
				resultData.setReturnMsg("实现类不能为空");
				return resultData;
			}
			if (StringUtils.isEmpty(addjobcronExpression)) {
				resultData.setReturnCode(RESULT_ERROR_CODE);
				resultData.setReturnMsg("任务频率不能为空");
				return resultData;
			}

			TCenterTaskScheduler addScheduler = new TCenterTaskScheduler();
			addScheduler.setBeanClass(addbeanclass);
			addScheduler.setJobGroup(SCHEDULER_DEFAULT_GROUP_NAME);
			addScheduler.setDescription(adddescription);
			addScheduler.setCronExpression(addjobcronExpression);
			quartzJobService.addScheduler(addScheduler);
		} catch (Exception e) {
			log.error("新增调度任务出错", e);
			resultData.setReturnCode(RESULT_ERROR_CODE);
			resultData.setReturnMsg("新增调度任务出错:" + e.getMessage());
			return resultData;
		}
		return resultData;
	}

	@RequestMapping("/editScheduler")
	@ResponseBody
	public ResultData editScheduler(HttpServletRequest request) {
		ResultData resultData = new ResultData();
		resultData.setReturnCode(RESULT_SUCCESS_CODE);
		resultData.setReturnMsg("修改调度任务成功!");
		String editdescription = request.getParameter("editdescription");
		String editbeanclass = request.getParameter("editbeanclass");
		String editjobcronExpression = request.getParameter("editjobcronExpression");
		if (StringUtils.isEmpty(editdescription)) {
			resultData.setReturnCode(RESULT_ERROR_CODE);
			resultData.setReturnMsg("任务描述不能为空");
			return resultData;
		}
		if (StringUtils.isEmpty(editbeanclass)) {
			resultData.setReturnCode(RESULT_ERROR_CODE);
			resultData.setReturnMsg("实现类不能为空");
			return resultData;
		}
		if (StringUtils.isEmpty(editjobcronExpression)) {
			resultData.setReturnCode(RESULT_ERROR_CODE);
			resultData.setReturnMsg("任务频率不能为空");
			return resultData;
		}

		try {
			TCenterTaskScheduler editScheduler = new TCenterTaskScheduler();
			editScheduler.setBeanClass(editbeanclass);
			editScheduler.setJobGroup(SCHEDULER_DEFAULT_GROUP_NAME);
			editScheduler.setDescription(editdescription);
			editScheduler.setCronExpression(editjobcronExpression);
			quartzJobService.editScheduler(editScheduler);
		} catch (Exception e) {
			log.error("修改调度任务出错", e);
			resultData.setReturnCode(RESULT_ERROR_CODE);
			resultData.setReturnMsg("修改调度任务出错:" + e.getMessage());
			return resultData;
		}
		return resultData;

	}

	@RequestMapping("/deleteScheduler")
	@ResponseBody
	public ResultData deleteScheduler(HttpServletRequest request) {
		ResultData resultData = new ResultData();
		resultData.setReturnCode(RESULT_SUCCESS_CODE);
		resultData.setReturnMsg("删除调度任务成功!");
		String beanClass = request.getParameter("beanClass");
		if (StringUtils.isEmpty(beanClass)) {
			resultData.setReturnCode(RESULT_ERROR_CODE);
			resultData.setReturnMsg("任务名称不能为空");
			return resultData;
		}

		try {
			quartzJobService.deleteScheduler(beanClass, SCHEDULER_DEFAULT_GROUP_NAME);
		} catch (Exception e) {
			log.error("删除调度任务出错", e);
			resultData.setReturnCode(RESULT_ERROR_CODE);
			resultData.setReturnMsg("删除调度任务出错:" + e.getMessage());
			return resultData;
		}
		return resultData;
	}

	@RequestMapping("/pauseScheduler")
	@ResponseBody
	public ResultData pauseScheduler(HttpServletRequest request) {
		ResultData resultData = new ResultData();
		resultData.setReturnCode(RESULT_SUCCESS_CODE);
		resultData.setReturnMsg("暂停调度任务成功!");
		String beanClass = request.getParameter("beanClass");
		if (StringUtils.isEmpty(beanClass)) {
			resultData.setReturnCode(RESULT_ERROR_CODE);
			resultData.setReturnMsg("任务名称不能为空");
			return resultData;
		}

		try {
			quartzJobService.pauseScheduler(beanClass, SCHEDULER_DEFAULT_GROUP_NAME);
		} catch (Exception e) {
			log.error("暂停调度任务出错", e);
			resultData.setReturnCode(RESULT_ERROR_CODE);
			resultData.setReturnMsg("暂停调度任务出错:" + e.getMessage());
			return resultData;
		}
		return resultData;
	}

	@RequestMapping("/resumeScheduler")
	@ResponseBody
	public ResultData resumeScheduler(HttpServletRequest request) {
		ResultData resultData = new ResultData();
		resultData.setReturnCode(RESULT_SUCCESS_CODE);
		resultData.setReturnMsg("执行调度任务成功!");
		String beanClass = request.getParameter("beanClass");
		if (StringUtils.isEmpty(beanClass)) {
			resultData.setReturnCode(RESULT_ERROR_CODE);
			resultData.setReturnMsg("任务名称不能为空");
			return resultData;
		}
		try {
			quartzJobService.resumeScheduler(beanClass, SCHEDULER_DEFAULT_GROUP_NAME);
		} catch (Exception e) {
			log.error("执行调度任务出错", e);
			resultData.setReturnCode(RESULT_ERROR_CODE);
			resultData.setReturnMsg("执行调度任务出错:" + e.getMessage());
			return resultData;
		}
		return resultData;

	}

}
