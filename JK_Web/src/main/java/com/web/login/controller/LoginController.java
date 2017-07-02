package com.web.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	String message = "Welcome";
	
	@RequestMapping("/login")
	public ModelAndView showMessage(@RequestParam(value="name", required = false, defaultValue = "world") String name) {
		System.out.println("in Logincontroller");
		ModelAndView mv = new ModelAndView("/login/login");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	
}
