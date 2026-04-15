package com.nba.nba_arena.repository;

import com.nba.nba_arena.model.Player;
import com.nba.nba_arena.model.PlayerId;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, PlayerId> {
}