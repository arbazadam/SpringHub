package com.spring.main.controller;

import java.io.File;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@GetMapping("/hello")
public String getHello()
{
return "template server side app";	
}
@PostMapping("/postToServer")
public void postData(@RequestHeader Map<String, String> headers)
{
	System.out.println(Thread.currentThread().getName());
}
}
