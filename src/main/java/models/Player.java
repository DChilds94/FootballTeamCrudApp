package models;

public class Player {

    private int id;
    private String name;
    private Manager manager;
    private Team team;

    public Player() {
    }

    public Player(String name, Manager manager, Team team) {
        this.name = name;
        this.manager = manager;
        this.team = team;
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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
