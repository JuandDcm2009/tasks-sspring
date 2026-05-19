package com.ponsciodev.tasks.domain.port;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.ponsciodev.tasks.domain.model.Task;

public interface TaskRepository {
    List<Task> getall();
    Optional<Task> getById(UUID id);
    Task save(Task task);
    void deleteById(UUID id);
}
