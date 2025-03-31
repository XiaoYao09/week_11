package com.example.week11;

public class Match {
    private String homeTeam;
    private String awayTeam;
    private String score;
    private String league;
    private String date;
    private String location;

    public Match(String homeTeam, String awayTeam, String score, String league, String date, String location) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.score = score;
        this.league = league;
        this.date = date;
        this.location = location;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public String getScore() {
        return score;
    }

    public String getLeague() {
        return league;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }
}


