package models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "match")
public class Match {

    private int id;
    private Competition competition;
    private Set<Team> team;

    public Match() {
    }

    public Match(Competition competition) {
        this.competition = competition;
        this.team = new HashSet<Team>();
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

    @ManyToOne
    @JoinColumn(name = "competition_id", nullable = false)
    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "team_match",
            joinColumns = {@JoinColumn(name = "match_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "team_id", nullable = false, updatable = false)})
    public Set<Team> getTeam() {
        return team;
    }

    public void setTeam(Set<Team> team) {
        this.team = team;
    }

    public void addTeam(Team team){
        this.team.add(team);
    }
}
