package com.ponsciodev.tasks.infrastructure.persistence.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.ponsciodev.tasks.infrastructure.persistence.entitty.UserEntity;

@Component
public interface UserJpaRepository extends JpaRepository<UserEntity, UUID>{
    
    @Query("SELECT u from UserEntity u WHERE u.email = ?1")
    List<UserEntity> findByEmail(String email);

}
