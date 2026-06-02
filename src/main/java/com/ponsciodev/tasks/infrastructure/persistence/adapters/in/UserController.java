package com.ponsciodev.tasks.infrastructure.persistence.adapters.in;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ponsciodev.tasks.application.dto.UserRegisterRequestDto;
import com.ponsciodev.tasks.application.dto.UserRegisterResponseDto;
import com.ponsciodev.tasks.application.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/user")
@AllArgsConstructor
public class UserController {
    
    private final UserService userService;

    @PostMapping(path = "/register")
    public ResponseEntity<UserRegisterResponseDto> register(@RequestBody UserRegisterRequestDto request) {
        UserRegisterResponseDto response = userService.registerUser(request);
        return ResponseEntity.ok().body(response);
    }
    
}
