package com.r3sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsuranceController {
	@RequestMapping("/")
	public String open(){
		return "login";
	}

}
