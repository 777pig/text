package cn.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.service.service;


@Controller
@RequestMapping("")
public class text_controller  {

	@Resource
	public service ser;

	@RequestMapping("/hello.do")
	public String Controler(
			@RequestParam(value = "d", required = false, defaultValue = "1") String id,
			@RequestParam(value = "action", required = false, defaultValue = "default") String action) {
		String rpage = "index";
		System.out.println("测试");
		ser.sayhello();
		if (action.equals("")) {

		} else if (action.equals("")) {

		}
		return rpage;
	}

}