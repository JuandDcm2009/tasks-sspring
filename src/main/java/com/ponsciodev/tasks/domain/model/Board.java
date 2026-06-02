package com.ponsciodev.tasks.domain.model;

import java.util.UUID;


public class Board {
    private UUID id;
    private String name;
    private UUID userId;
    
    public Board() {}
    public Board(UUID id, String name, UUID userId) {
        this.id = id;
        this.name = name;
        this.userId = userId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public UUID getUserId() {
        return userId;
    }
    public void setUser(UUID userId) {
        this.userId = userId;
    }
}

