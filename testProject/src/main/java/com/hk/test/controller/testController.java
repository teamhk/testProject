package com.hk.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hk.test.dto.MemberDto;
import com.hk.test.service.TestSerivce;

@Controller
public class testController {

	@Autowired
	TestSerivce testService;
	
	@GetMapping("/register")
	public String registerGet(Model model) { 
		return "registerGet";
	}
	
	@PostMapping("/register")
	public String registerPost(Model model, MemberDto memberDto) {
		model.addAttribute("result", testService.testRegister(memberDto));
		return "registerPost";
	}
}
