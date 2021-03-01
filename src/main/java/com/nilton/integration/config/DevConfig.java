package com.nilton.integration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nilton.integration.services.EmailService;
import com.nilton.integration.services.SendGridEmailService;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Bean
	public EmailService emailService() {
		return new SendGridEmailService();
	}
}
