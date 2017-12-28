package com.mainiway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@Value("${user}")
	private String user;
	
	@GetMapping("/get")
	public String get(){
		return "my  name is "+ user;
	}
}
