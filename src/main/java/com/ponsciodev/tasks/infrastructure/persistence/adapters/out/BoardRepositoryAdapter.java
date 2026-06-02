package com.ponsciodev.tasks.infrastructure.persistence.adapters.out;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ponsciodev.tasks.domain.model.Board;
import com.ponsciodev.tasks.domain.port.BoardRepository;
import com.ponsciodev.tasks.infrastructure.persistence.mapper.BoardMapper;
import com.ponsciodev.tasks.infrastructure.persistence.repository.BoardJpaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BoardRepositoryAdapter implements BoardRepository {
    
    @Autowired
    private BoardMapper mapper;

    @Autowired
    private BoardJpaRepository repository;
    
    @Override
    public List<Board> getAll() {
        return repository.findAll().stream().map(mapper::toDomain).toList();
    }

    @Override
    public Optional<Board> getById(UUID id) {
        return repository.findById(id).map(mapper::toDomain);
    }
    
    @Override
    public Board save(Board board) {
        return mapper.toDomain(repository.save(mapper.toEntity(board)));
    }
    @Override
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }

}
