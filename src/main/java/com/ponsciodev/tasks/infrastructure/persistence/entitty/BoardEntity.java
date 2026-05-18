package com.ponsciodev.tasks.infrastructure.persistence.entitty;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter @Setter
@Table(name = "board")
public class BoardEntity {
    
    @Id
    @Column(nullable = false)
    private UUID id;

    @Column(nullable = false)
    private String name;

}
