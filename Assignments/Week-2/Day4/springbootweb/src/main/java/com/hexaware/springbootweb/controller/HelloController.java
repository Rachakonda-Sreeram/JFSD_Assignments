package com.hexaware.springbootweb.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/webapp")
public class HelloController {
	
	
	
	
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return "Hello, Good Morning";
	}
	@RequestMapping(value = "/show",method =RequestMethod.GET)
	@ResponseBody
	public String show() {
		return "<h1 style='color:blue'> W E L C O M E   T O   W E B</h1>" ;
	}
}
