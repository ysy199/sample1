package com.goodee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/") //value="/" : 기존 servlet의  @WebServlet("/..")과 동일
	public String home() {
		System.out.println("HomeController.home()");
		return "index";
	}
}
