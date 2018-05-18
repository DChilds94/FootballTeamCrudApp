package models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "teams")
public class Team {

    private int id;
    private String name;
    private Manager manager;
    private Set<Player> players;
    private Set<Match> matches;

    public Team() {
    }

    public Team(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
        this.players = new HashSet<Player>();
        this.matches = new HashSet<Match>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(cascade = CascadeType.PERSIST)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @OneToMany(mappedBy = "team")
    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "team_match",
    joinColumns = {@JoinColumn(name =" team_id", nullable = false, updatable = false)},
    inverseJoinColumns =  {@JoinColumn(name="match_id", nullable = false, updatable = false)})
    public Set<Match> getMatches() {
        return matches;
    }

    public void setMatches(Set<Match> matches) {
        this.matches = matches;
    }

    public void addPlayerToTeam(Player player){
        this.players.add(player);
    }

    public int countPlayers() {
        return this.players.size();
    }

}
