package com.ponsciodev.tasks.domain.port;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.ponsciodev.tasks.domain.model.Board;

public interface BoardRepository {
    List<Board> getAll();
    Optional<Board> getById(UUID id);
    Board save(Board board);
    void deleteById(UUID id);
}
