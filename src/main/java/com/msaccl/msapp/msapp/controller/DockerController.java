package com.msaccl.msapp.msapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping("/name")
	public String getMyName() {
		
		return "My First MicroService";
	}

}
