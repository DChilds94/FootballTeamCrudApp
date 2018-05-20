package models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "competition")
public class Competition {

    private int id;
    private String name;
    private Set<Match> matches;

    public Competition() {
    }

    public Competition(String name) {
        this.name = name;
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

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "competition")
    public Set<Match> getMatches() {
        return matches;
    }

    public void setMatches(Set<Match> matches) {
        this.matches = matches;
    }

    public void addMatchToComp(Match match){
        this.matches.add(match);
    }
}

