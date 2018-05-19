package com.test.multi.multifrontend.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {

	@RequestMapping("/hello")
	public String hello(Model model) {
		
		return "hello";
	}
}
