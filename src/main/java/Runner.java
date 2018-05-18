import db.DBHelper;
import db.DBTeam;
import models.Manager;
import models.Player;
import models.Team;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Manager manager1 = new Manager("Poch");
        Manager manager2 = new Manager("Dyche");
        DBHelper.save(manager1);
        DBHelper.save(manager2);
        Team team1 = new Team("Spurs", manager1);
        DBHelper.save(team1);
        Player player1 = new Player("Harry Kane", team1);
        DBHelper.save(player1);

        team1.addPlayerToTeam(player1);
        List<Player> playersInTeam = DBTeam.showPlayersInATeam(team1);

    }
}
