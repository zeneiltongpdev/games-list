package com.javadslist.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javadslist.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}