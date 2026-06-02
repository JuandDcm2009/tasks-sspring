package com.ponsciodev.tasks.domain.service;

public interface PasswordService {
    String encode(String plainPassword);
    Boolean matches(String plainPassword, String hashedPassword);
}
