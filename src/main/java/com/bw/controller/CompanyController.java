package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bw.entity.Company;
import com.bw.service.CompanyService;
import com.bw.vo.CompanyVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author 作者:SYk
 * @version 创建时间：2020年1月6日 上午10:07:39 类功能说明
 */
@Controller
public class CompanyController {
	@Autowired
	private CompanyService cService;

	// 查询所有，模糊插叙，区间查询
	@RequestMapping("findAll.do")
	public ModelAndView findAll(@RequestParam(defaultValue = "1") int pageNow, Company company, CompanyVo companyVo) {
		PageHelper.startPage(pageNow, 10);
		ModelAndView mv = new ModelAndView("show");
		List<Company> list = cService.findAll(companyVo);
		PageInfo<Company> page = new PageInfo<Company>(list);
		mv.addObject("list", list);
		mv.addObject("companyVo", companyVo);
		mv.addObject("page", page);
		return mv;
	}

	@RequestMapping("reshow.do")
	public ModelAndView reshow(@RequestParam("id") String id) {
		ModelAndView mv = new ModelAndView("update");
		Company company = cService.reshow(id);
		if (company.getCstatus().equals("未年检")) {
			mv.setViewName("fail");
		}
		mv.addObject("company", company);
		return mv;
	}

}
