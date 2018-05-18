package models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Manager {

    private int id;
    private String name;
    private Team team;
    private Set<Player> players;

    public Manager() {
    }

    public Manager(String name, Team team, List<Player> players) {
        this.name = name;
        this.team = team;
        this.players =  new HashSet<Player>();
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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
