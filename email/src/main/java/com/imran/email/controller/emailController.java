package com.imran.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imran.email.dto.Email;

@RestController
public class emailController 
{
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	private Email email;
	
	@GetMapping(path = "/sendEmail")
	private String sendMessage()
	{
		System.out.println("receipent : " + email.getReceipent());
		SimpleMailMessage  message = new SimpleMailMessage ();
		message.setTo(email.getReceipent());
		message.setSubject(email.getSubject());
		message.setText(email.getText());
		javaMailSender.send(message);
		
		return "message send";
	}
}
