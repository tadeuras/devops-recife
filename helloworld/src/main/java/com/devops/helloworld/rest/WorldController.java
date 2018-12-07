package com.devops.helloworld.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devops.helloworld.dto.HelloWorldResponse;

@RestController
@RequestMapping("/world")
public class WorldController {
	
	@RequestMapping("/hello")
	public HelloWorldResponse hello() {
		HelloWorldResponse response = new HelloWorldResponse();
		response.setResponse("Hello World Devops");
		return response;
	}
}
