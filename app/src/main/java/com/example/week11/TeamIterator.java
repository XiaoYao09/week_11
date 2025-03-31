package com.example.week11;

import java.util.List;

public class TeamIterator implements CustomIterator<Team> {
    private List<Team> teams;
    private int index = 0;

    public TeamIterator(List<Team> teams) {
        this.teams = teams;
    }

    @Override
    public boolean hasNext() {
        return index < teams.size();
    }

    @Override
    public Team next() {
        return hasNext() ? teams.get(index++) : null;
    }
}

