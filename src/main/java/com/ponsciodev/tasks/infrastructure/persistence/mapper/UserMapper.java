package com.ponsciodev.tasks.infrastructure.persistence.mapper;

import org.springframework.stereotype.Component;

import com.ponsciodev.tasks.domain.model.User;
import com.ponsciodev.tasks.infrastructure.persistence.entitty.UserEntity;

@Component
public class UserMapper {

    public UserEntity toEntity(User user) {
        return new UserEntity(
            user.getId(),
            user.getName(),
            user.getEmail(),
            user.getPassword()
        );
    }

    public User toDomain(UserEntity entity) {
        return new User(
            entity.getName(),
            entity.getEmail(),
            entity.getPassword()
        );
    }
}
