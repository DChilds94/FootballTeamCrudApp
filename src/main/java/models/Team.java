package models;

import java.util.HashSet;
import java.util.Set;

public class Team {

    private int id;
    private String name;
    private Manager manager;
    private Set<Player> players;

    public Team() {
    }

    public Team(String name, Manager manager, Set<Player> players) {
        this.name = name;
        this.manager = manager;
        this.players = new HashSet<Player>();
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

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
