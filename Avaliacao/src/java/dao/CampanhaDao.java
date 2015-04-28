package dao;

import Model.Campanha;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class CampanhaDao {

    private Session session;

    public CampanhaDao() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void insert(Campanha campanha) {
        Transaction t = session.beginTransaction();
        session.save(campanha);
        t.commit();
    }

    public void update(Campanha campanha) {
        Transaction t = session.beginTransaction();
        session.merge(campanha);
        t.commit();
    }

    public void delete(Campanha campanha) {
        Transaction t = session.beginTransaction();
        session.delete(campanha);
        t.commit();
    }

    public Campanha findById(int id) {
        return (Campanha) session.load(Campanha.class, id);
    }

    public List<Campanha> findAll() {
        Query query = session.createQuery("from Campanha");
        return query.list();
    }
}
