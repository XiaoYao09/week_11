package com.example.week11;

import java.util.List;

public class MatchRepository extends Repository<Match> {
    public List<Match> filterByTeam(String teamName) {
        return filter(match ->
                match.getHomeTeam().equalsIgnoreCase(teamName) ||
                        match.getAwayTeam().equalsIgnoreCase(teamName)
        );
    }
}

