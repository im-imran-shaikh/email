package com.imran.email.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("email.properties")
@ConfigurationProperties
public class Email
{
	private String receipent;
	private String subject;
	private String text;
	
	public String getReceipent() {
		return receipent;
	}
	public void setReceipent(String receipent) {
		this.receipent = receipent;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
