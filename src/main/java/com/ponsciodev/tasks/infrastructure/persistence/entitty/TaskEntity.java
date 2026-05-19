package com.ponsciodev.tasks.infrastructure.persistence.entitty;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "task")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskEntity {
    @Id @Column(nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "board_id", referencedColumnName = "id", nullable = false)
    private BoardEntity boardId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String startDate;

    @Column(nullable = false)
    private String endDate;
}
