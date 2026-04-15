package com.nba.nba_arena.model;

import java.io.Serializable;
import java.util.Objects;

public class PlayerId implements Serializable {

    private String playerId;
    private String team;

    public PlayerId() {}

    public PlayerId(String playerId, String team) {
        this.playerId = playerId;
        this.team = team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerId)) return false;
        PlayerId that = (PlayerId) o;
        return Objects.equals(playerId, that.playerId) &&
               Objects.equals(team, that.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, team);
    }
}