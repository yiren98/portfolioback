package com.ry.ryportfolio.dto;

/**
 * @Auther:ry
 * @Date:
 */

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class ContactRequest {
    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Message cannot be empty")
    private String message;

    // Getter & Setter
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
