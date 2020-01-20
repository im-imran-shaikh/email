package com.imran.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.imran.email.dto.Email;

@Service
public class EmailServiceImpl
{
	@Autowired
	private Email email;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public String sendMail()
	{
		SimpleMailMessage  message = new SimpleMailMessage ();
		message.setTo(email.getReceipent());
		message.setSubject(email.getSubject());
		message.setText(email.getText());
		javaMailSender.send(message);	
		return "message send";
	}
}
