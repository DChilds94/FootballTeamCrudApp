package db;

import models.Manager;
import models.Player;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBTeam {

    private static Session session;
    private static Transaction transaction;


//    in the function I want to return a list of players in a team..
    public static List<Player> showPlayersInATeam(Team team){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Player> playersInTeam = null;
        try {
            Criteria cr = session.createCriteria(Player.class);
            cr.add(Restrictions.eq("team", team));
            playersInTeam = cr.list();

        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
        }session.close();
        return playersInTeam;
    }
    }


