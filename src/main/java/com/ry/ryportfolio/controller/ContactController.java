package com.ry.ryportfolio.controller;

import com.ry.ryportfolio.dto.ContactRequest;
import com.ry.ryportfolio.service.MailService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther:
 * @Date:
 */

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // 前端和后端分离时必须允许 CORS
public class ContactController {

    private final MailService mailService;

    public ContactController(MailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping("/contact")
    public ResponseEntity<String> contact(@Valid @RequestBody ContactRequest request) {
        mailService.sendMail(request.getEmail(), request.getMessage());
        return ResponseEntity.ok("Message sent successfully");
    }
}
