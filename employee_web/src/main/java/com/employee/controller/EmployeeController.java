package com.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

		
	
	@GetMapping(value="add")
	@ResponseBody
	public String addEmployee() {
			
		return "Request  Successfull!";
			
		}
	}
