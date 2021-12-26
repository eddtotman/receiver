package com.eddie.receiver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(method = RequestMethod.GET, value="/bestWifeNA") 
	public String sayHello() {
		return "Emily is the best wife. I love you";
	}

}