package com.ponsciodev.tasks.domain.port;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.ponsciodev.tasks.domain.model.User;

public interface UserRepostitory {
    List<User> getAll();
    Optional<User> findById(UUID id);
    List<User> findByEmail(String email);
    User save(User user);
    void deleteById(UUID id);
}
