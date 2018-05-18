import db.DBHelper;
import models.Manager;
import models.Player;
import models.Team;

public class Runner {

    public static void main(String[] args) {
        Manager manager1 = new Manager("Poch");
        Manager manager2 = new Manager("Dyche");
        DBHelper.save(manager1);
        DBHelper.save(manager2);
        Team team1 = new Team("Spurs");
        DBHelper.save(team1);
        Player player1 = new Player("Harry Kane", manager1, team1);
        DBHelper.save(player1);



    }
}
