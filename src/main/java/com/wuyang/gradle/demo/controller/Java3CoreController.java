package com.wuyang.gradle.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wuyang.gradle.demo.service.Java8CorService;

@RestController
public class Java3CoreController {
	@Autowired
	Java8CorService java8CoreService;
	
	@GetMapping("/showOddNumbers/{startNum}/{endNum}")
	public String oddNumbers (@PathVariable int startNum, @PathVariable int endNum) {		
		return java8CoreService.oddNumbers(startNum, endNum);
	}
	
	@GetMapping("/countFrequency/{digit}/{num}")
	public String countFrequency (@PathVariable String digit, @PathVariable int num) {		
		return java8CoreService.countFrequency(digit, num);
	}
}
