package com.ponsciodev.tasks.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
    private UUID id;
    private UUID boardId;
    private String name;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Task() {}
    public Task(
        UUID id,
        UUID boardId,
        String name,
        String description,
        LocalDateTime startDate,
        LocalDateTime endDate
    ) {
        this.id = id;
        this.boardId = boardId;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public UUID getBoardId() {
        return boardId;
    }
    public void setBoardId(UUID boardId) {
        this.boardId = boardId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDateTime getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }
    public LocalDateTime getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
    
}
