package com.ry.ryportfolio.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @Auther:
 * @Date:
 */
@Service
public class MailService {

    private final JavaMailSender mailSender;

    public MailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendMail(String fromEmail, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("ren980602@gmail.com"); // 接收人，可以写成你自己的邮箱
        message.setSubject("New Contact from Portfolio");
        message.setText("From: " + fromEmail + "\n\n" + content);
        mailSender.send(message);
    }
}
