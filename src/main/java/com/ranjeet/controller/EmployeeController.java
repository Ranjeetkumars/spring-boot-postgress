package com.ranjeet.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class EmployeeController {
	
	
	
	
	
	@GetMapping("/test")
	public String registerEmployee() {
		
		
	  return "Ranjeet this is your current time = " +new Date().toString();
	}

}
