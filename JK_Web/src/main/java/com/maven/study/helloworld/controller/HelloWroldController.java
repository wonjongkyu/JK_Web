package com.maven.study.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWroldController {
	String message = "Welcome";
	
	@RequestMapping("/hello")
	public ModelAndView showMessage(@RequestParam(value="name", required = false, defaultValue = "world") String name) {
		System.out.println("in controller");
		
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	
	@RequestMapping("/content")
	public ModelAndView showMessage2(@RequestParam(value="name", required = false, defaultValue = "world") String name) {
		System.out.println("in controller");
		
		ModelAndView mv = new ModelAndView("content");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	
}
