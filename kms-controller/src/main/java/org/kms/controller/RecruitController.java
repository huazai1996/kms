package org.kms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.kms.dao.RecruitDao;
import org.kms.pojo.Recruit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rec")
public class RecruitController {
	
	@Resource
	private RecruitDao RecruitDao;
	
	
	public void setRecruitDao(RecruitDao recruitDao) {
		RecruitDao = recruitDao;
	}

	@RequestMapping("/index")
	public String index() throws Exception{
		return "zhao";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public Map<String, Object> list(@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="5") Integer rows,@RequestParam(defaultValue="id") String sort,@RequestParam(defaultValue="asc") String order,Recruit condition) throws Exception {
		Map<String, Object> map = new HashMap<>();
		
		int start = (page - 1) * rows;
		List<Recruit> list = RecruitDao.getListByCondition(start, rows, condition, sort, order);
		int total = RecruitDao.getCountByCondition(condition);
		
		map.put("rows", list);
		map.put("total", total);
		
		return map;
	}
}
