package com.ponsciodev.tasks.infrastructure.security.adapter;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ponsciodev.tasks.domain.service.PasswordService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PasswordServiceAdapter implements PasswordService {
    
    private final PasswordEncoder passwordEncoder;

    @Override
    public String encode(String plainPassword) {
        return passwordEncoder.encode(plainPassword);
    }

    @Override
    public Boolean matches(String plainPassword, String hashedPassword) {
        return passwordEncoder.matches(plainPassword, hashedPassword);
    }
}
