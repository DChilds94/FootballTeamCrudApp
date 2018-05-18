package models;

import java.util.HashSet;
import java.util.Set;

public class Competition {

    private int id;
    private String name;
    private Set<Team> teams;

    public Competition() {
    }

    public Competition(String name, Set<Team> teams) {
        this.name = name;
        this.teams = new HashSet<Team>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }
}

