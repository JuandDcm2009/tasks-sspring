package com.ponsciodev.tasks.infrastructure.persistence.adapters.out;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ponsciodev.tasks.domain.model.Task;
import com.ponsciodev.tasks.domain.port.TaskRepository;
import com.ponsciodev.tasks.infrastructure.persistence.mapper.TaskMapper;
import com.ponsciodev.tasks.infrastructure.persistence.repository.TaskJpaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TaskRepositoryAdapter implements TaskRepository {
    
    @Autowired
    private TaskJpaRepository repository;
    @Autowired
    private TaskMapper taskMapper;

    @Override
    public List<Task> getall() {
        return repository.findAll().stream().map(taskMapper::toDomain).toList();
    }
    
    @Override
    public Optional<Task> getById(UUID id) {
        return repository.findById(id).map(taskMapper::toDomain);
    }

    @Override
    public Task save(Task task) {
        return taskMapper.toDomain(repository.save(taskMapper.toEntity(task)));
    }

    @Override
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }

}
