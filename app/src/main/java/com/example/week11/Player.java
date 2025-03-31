package com.example.week11;

public class Player {
    private String name;
    private int age;
    private String nationality;
    private String position;
    private String team;
    private int number;

    public Player(String name, int age, String nationality, String position, String team, int number) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.position = position;
        this.team = team;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    public int getNumber() {
        return number;
    }
}


