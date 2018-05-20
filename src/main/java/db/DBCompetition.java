package db;

import models.Competition;
import models.Match;
import models.Player;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBCompetition {

    private static Session session;
    private static Transaction transaction;

    public static List<Match> showMatchesInAComp(Competition competition){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Match> fixtures = null;
        try {
            Criteria cr = session.createCriteria(Match.class);
            cr.add(Restrictions.eq("competition", competition));
            fixtures = cr.list();

        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
        }session.close();
        return fixtures;
    }


}
