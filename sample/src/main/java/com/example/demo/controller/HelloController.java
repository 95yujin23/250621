package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
//	@RequestMapping(method = RequestMethod.GET, path = "/") //구버전
	@GetMapping("/") //요즘은 이렇게 씁니다!
	public String hello() {
		return "Hello World!!!";
		
	}
}
