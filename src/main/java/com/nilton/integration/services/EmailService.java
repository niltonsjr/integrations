package com.nilton.integration.services;

import com.nilton.integration.dto.EmailDTO;

public interface EmailService {
	
	void sendEmail(EmailDTO dto);
}
