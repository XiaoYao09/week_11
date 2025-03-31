package com.example.week11;

import java.util.List;

public class TeamRepository extends Repository<Team> {
    public List<Team> filterByLeague(String league) {
        return filter(team -> team.getLeague().equalsIgnoreCase(league));
    }
}


