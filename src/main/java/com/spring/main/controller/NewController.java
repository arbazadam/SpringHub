package com.spring.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
	@GetMapping("/king")
public String getNew()
{
System.out.println("This is a new Controller by the forked repo");
return "enjoy social coding";
}
}
