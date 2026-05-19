package com.ponsciodev.tasks.infrastructure.persistence.mapper;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ponsciodev.tasks.domain.model.Task;
import com.ponsciodev.tasks.infrastructure.persistence.entitty.TaskEntity;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class TaskMapper {

    @Autowired
    private BoardMapper boardMapper;

    public TaskEntity toEntity(Task domain) {
        return new TaskEntity(
            domain.getId(),
            boardMapper.toEntity(domain.getBoard()),
            domain.getName(),
            domain.getDescription(),
            domain.getStartDate().toString(),
            domain.getEndDate().toString()
        );
    }

    public Task toDomain(TaskEntity entity) {
        return new Task(
            entity.getId(),
            boardMapper.toDomain(entity.getBoard()),
            entity.getName(),
            entity.getDescription(),
            LocalDateTime.parse(entity.getStartDate()),
            LocalDateTime.parse(entity.getEndDate())
        );
    }

}
