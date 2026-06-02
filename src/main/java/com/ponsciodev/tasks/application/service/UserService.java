package com.ponsciodev.tasks.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ponsciodev.tasks.application.dto.UserRegisterRequestDto;
import com.ponsciodev.tasks.application.dto.UserRegisterResponseDto;
import com.ponsciodev.tasks.domain.model.User;
import com.ponsciodev.tasks.domain.port.UserRepostitory;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepostitory repostitory;
    
    public UserRegisterResponseDto registerUser(UserRegisterRequestDto request) {
        if (!ValidIfEmailExists(request.email())) throw new RuntimeException("Email already exists");
        repostitory.save( new User( request.name(), request.email(), request.password()));
        return new UserRegisterResponseDto(request.name(), request.email());
    }

    private Boolean ValidIfEmailExists(String email) {
        String formatEmail = email.trim();
        List<User> sameUser = repostitory.findByEmail(formatEmail);
        
        if (sameUser.size() > 0) return false;
        return true;
    }

}
