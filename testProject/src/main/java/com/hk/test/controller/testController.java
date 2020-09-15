package com.hk.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {

	@GetMapping("/")
	public String root() { 
		return "aaa";
	}
}
