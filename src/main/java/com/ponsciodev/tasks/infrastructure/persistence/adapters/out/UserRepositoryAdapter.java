package com.ponsciodev.tasks.infrastructure.persistence.adapters.out;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ponsciodev.tasks.domain.model.User;
import com.ponsciodev.tasks.domain.port.UserRepostitory;
import com.ponsciodev.tasks.infrastructure.persistence.mapper.UserMapper;
import com.ponsciodev.tasks.infrastructure.persistence.repository.UserJpaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserRepositoryAdapter implements UserRepostitory {
    private final UserMapper mapper;
    private final UserJpaRepository repostitory;

    @Override
    public List<User> getAll() {
        return repostitory.findAll().stream().map(mapper::toDomain).toList();
    }
    
    @Override
    public Optional<User> findById(UUID id) {
        return repostitory.findById(id).map(mapper::toDomain);
    }
    
    @Override
    public User save(User user) {
        return mapper.toDomain(repostitory.save(mapper.toEntity(user)));
    }
    
    @Override
    public void deleteById(UUID id) {
        repostitory.deleteById(id);
    }

    @Override
    public List<User> findByEmail(String email) {
        return repostitory.findByEmail(email).stream().map(mapper::toDomain).toList();
    }

}
