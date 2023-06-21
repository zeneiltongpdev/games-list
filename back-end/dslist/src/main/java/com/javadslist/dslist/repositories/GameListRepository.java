package com.javadslist.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javadslist.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}