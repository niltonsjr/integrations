package com.nilton.integration.services;

import org.slf4j.Logger;

import com.nilton.integration.dto.EmailDTO;

public class MockEmailService implements EmailService {

	private static Logger LOG = org.slf4j.LoggerFactory.getLogger(MockEmailService.class);

	public void sendEmail(EmailDTO dto) {
		LOG.info("Sending email to: " + dto.getTo());
		LOG.info("Email sent!");
	}
}
