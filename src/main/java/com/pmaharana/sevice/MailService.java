package com.pmaharana.sevice;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	Logger log = LoggerFactory.getLogger(MailService.class);
	
	@Autowired
	private JavaMailSenderImpl javaMailSender;

	public void sendEmail(String fromMail, String subject,String content){
		
		log.info("inside sendMail() method"); 
	    MimeMessage mimeMessage = javaMailSender.createMimeMessage();
	    try {
	        MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
	        message.setTo("sasmita.maharana555@gmail.com");
	        message.setFrom(fromMail);
	        message.setSubject(subject);
	        message.setText(content,true);
	        javaMailSender.send(mimeMessage);
	        log.debug(" e-mail from '{}'", fromMail);
	    } catch (Exception e) {
	        log.warn("E-mail could not be sent to user '{}', exception is: {}", e.getMessage());
	    }
	}
}
