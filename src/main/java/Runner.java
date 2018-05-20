import db.DBHelper;
import db.DBTeam;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Manager manager1 = new Manager("Poch");
        Manager manager2 = new Manager("Dyche");
        Team team1 = new Team("Spurs", manager1);
        Player player1 = new Player("Harry Kane", team1);
        Player player2 = new Player("Jon", team1);
        Competition competition = new Competition("Champions League");
        Match match = new Match();
        DBHelper.save(manager1);
        DBHelper.save(manager2);
        DBHelper.save(team1);
        DBHelper.save(player1);
        DBHelper.save(player2);
        DBHelper.save(competition);
        DBHelper.save(match);


        team1.addPlayerToTeam(player1);
        team1.addPlayerToTeam(player2);
        List<Player> playersInTeam = DBTeam.showPlayersInATeam(team1);
        competition.addMatch(match);
        match.addTeam(team1);

    }
}
