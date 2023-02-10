package com.gmstore.backend.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Hello {
	
	@GetMapping
	public String helloWorld()
	{
		System.out.println("Hello world");
		return "hello world" + new Date();
	}
}
