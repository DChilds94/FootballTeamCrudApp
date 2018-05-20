import db.DBCompetition;
import db.DBHelper;
import db.DBMatch;
import db.DBTeam;
import models.*;


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
        Team team2 = new Team("Scotland", manager1);
        DBHelper.save(team1);
        DBHelper.save(team2);

        Player player1 = new Player("Harry Kane", team1);
        DBHelper.save(player1);
        Player player2 = new Player("Jon", team1);
        DBHelper.save(player2);

        Match match2 = new Match();
        DBHelper.save(match2);

        team1.addPlayerToTeam(player1);
        team1.addPlayerToTeam(player2);


        List<Player> teamSheet = DBTeam.showPlayersInATeam(team1);
        competition.addMatchToComp(match1);
        competition.addMatchToComp(match2);
        DBHelper.addTeamToMatch(team1, match1);
        DBHelper.addTeamToMatch(team2, match1);
        List<Match> fixtures = DBCompetition.showMatchesInAComp(competition);
        List<Team> fixture = DBMatch.showTeamsInAMatch(match1);

    }
}
