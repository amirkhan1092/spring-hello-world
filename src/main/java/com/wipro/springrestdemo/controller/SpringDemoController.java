package com.wipro.springrestdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDemoController {
	
	@GetMapping("/control")
	public String nowShow() {
		return "This Method inside Controller";
	}

}
