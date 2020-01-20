package com.imran.email.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.imran.email.dto.Email;
import com.imran.email.service.EmailService;
import com.imran.email.service.EmailServiceImpl;

@Configuration
public class BeansConfiguration 
{
	@Autowired
	private EmailServiceImpl emailServiceImpl;
	
	@Bean
	public EmailService emailService() { return ()-> { return emailServiceImpl.sendMail(); }; }
	
}
