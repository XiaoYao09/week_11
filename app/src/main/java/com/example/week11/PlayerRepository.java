package com.example.week11;

import java.util.List;

public class PlayerRepository extends Repository<Player> {
    public List<Player> filterByTeam(String teamName) {
        return filter(player -> player.getTeam().equalsIgnoreCase(teamName));
    }
}



