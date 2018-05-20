package db;

import models.Match;
import models.Player;
import models.Team;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBMatch {

    private static Session session;
    private static Transaction transaction;


    public static List<Team> showTeamsInAMatch(Match match){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Team> result = null;
        try {
            Criteria cr = session.createCriteria(Team.class);
            cr.createAlias("matches", "unique_match");
            cr.add(Restrictions.eq("unique_match", match.getId()));
            result = cr.list();

        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
        }session.close();
        return result;
    }
}
//    public static List<Lesson> getStudentsLessons(Student student){
//        session = HibernateUtil.getSessionFactory().openSession();
//        List<Lesson> lessons = null;
//        try {
//            Criteria cr = session.createCriteria(Lesson.class);
//            cr.createAlias("students", "individual_student");
//            cr.add(Restrictions.eq("individual_student.id", student.getId()));
//            lessons = cr.list();
//        } catch (HibernateException e) {
//            e.printStackTrace();
//        } finally {
//        } session.close();
//        return lessons;
//    }