package com.ponsciodev.tasks.infrastructure.persistence.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ponsciodev.tasks.infrastructure.persistence.entitty.BoardEntity;

@Component
public interface BoardJpaRepository extends JpaRepository<BoardEntity, UUID>{
    
}
