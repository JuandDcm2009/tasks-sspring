package com.ponsciodev.tasks.application.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRegisterRequestDto(

    @NotBlank(message = "Name can't be null")
    String name,

    @NotBlank(message = "Email can't be null")
    @Email(message = "Invalid email format")
    String email,

    @NotBlank(message = "Password can't be null")
    @Size(min = 6, message = "Password must be more than 6 characters long")
    String password
    
) {}
