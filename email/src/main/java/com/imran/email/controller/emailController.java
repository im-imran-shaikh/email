package com.imran.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.imran.email.dto.Email;
import com.imran.email.service.EmailService;

@RestController
public class emailController 
{	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private Email email;
	
	@GetMapping(path = "/sendEmail")
	private String sendMessage(@RequestParam String receipent, @RequestParam String subject, @RequestParam String body)
	{	
		email.setReceipent(receipent);
		email.setSubject(subject);
		email.setText(body);
		
		return emailService.sendEmail();
	}
	
	@GetMapping(path = "/sendDefaultEmail")
	private String sendDefaultEmail()
	{
		return emailService.sendEmail();
	}
	
	@GetMapping(path = "/email")
	private ModelAndView email()
	{
		ModelAndView modelAndView = new ModelAndView("email");
		return modelAndView;
	}
}
