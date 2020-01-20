package com.imran.email.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.imran.email.dto.Email;
import com.imran.email.service.EmailService;

@Configuration
public class BeansConfiguration 
{

	@Autowired
	private Email email;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Bean
	public EmailService emailService()
	{
		return ()-> { 
			SimpleMailMessage  message = new SimpleMailMessage ();
			message.setTo(email.getReceipent());
			message.setSubject(email.getSubject());
			message.setText(email.getText());
			javaMailSender.send(message);
			return "message send";
		};
	}
}
