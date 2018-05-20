import db.DBCompetition;
import db.DBHelper;
import db.DBTeam;
import models.*;
import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateNameHelper;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Competition competition = new Competition("Champions League");
        DBHelper.save(competition);

        Match match1 = new Match(competition);
        DBHelper.save(match1);

        Manager manager1 = new Manager("Poch");
        DBHelper.save(manager1);
        Manager manager2 = new Manager("Dyche");
        DBHelper.save(manager2);

        Team team1 = new Team("Spurs", manager1);
        DBHelper.save(team1);

        Player player1 = new Player("Harry Kane", team1);
        DBHelper.save(player1);
        Player player2 = new Player("Jon", team1);
        DBHelper.save(player2);

        Match match2 = new Match();
        DBHelper.save(match2);

        team1.addPlayerToTeam(player1);
        team1.addPlayerToTeam(player2);
        List<Player> playersInTeam = DBTeam.showPlayersInATeam(team1);
        competition.addMatchToComp(match1);
        competition.addMatchToComp(match2);
        DBHelper.addTeamToMatch(team1, match1);
        List<Match> fixtures = DBCompetition.showMatchesInAComp(competition);


    }
}
