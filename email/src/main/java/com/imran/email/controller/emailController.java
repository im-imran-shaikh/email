package com.imran.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imran.email.service.EmailService;

@RestController
public class emailController 
{	
	@Autowired
	private EmailService emailService;
	
	@GetMapping(path = "/sendEmail")
	private String sendMessage()
	{	
		return emailService.sendEmail();
	}
}
