package com.ponsciodev.tasks.infrastructure.persistence.mapper;

import org.springframework.stereotype.Component;

import com.ponsciodev.tasks.domain.model.Board;
import com.ponsciodev.tasks.infrastructure.persistence.entitty.BoardEntity;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class BoardMapper {
    
    public BoardEntity toEntity(Board domain) {
        return new BoardEntity(
            domain.getId(),
            domain.getName()
        );
    }

    public Board toDomain(BoardEntity entity) {
        return new Board(
            entity.getId(),
            entity.getName()
        );
    }    

}
