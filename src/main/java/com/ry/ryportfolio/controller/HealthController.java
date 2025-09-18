package com.ry.ryportfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:
 * @Date:
 */

@RestController
@RequestMapping("/api")
public class HealthController {
    @GetMapping("/ping")
    public String ping() { return "pong"; }
}

