/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.CampanhaAvaliacao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Mateus
 */
public class CampanhaDao {

    private Session session;

    public CampanhaDao() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void insert(CampanhaAvaliacao campanha) {
        Transaction t = session.beginTransaction();
        session.save(campanha);
        t.commit();
    }

    public void update(CampanhaAvaliacao campanha) {
        Transaction t = session.beginTransaction();
        session.merge(campanha);
        t.commit();
    }

    public void delete(CampanhaAvaliacao campanha) {
        Transaction t = session.beginTransaction();
        session.delete(campanha);
        t.commit();
    }

    public CampanhaAvaliacao findById(int id) {
        return (CampanhaAvaliacao) session.load(CampanhaAvaliacao.class, id);
    }

    public List<CampanhaAvaliacao> findAll() {
        Query query = session.createQuery("from CampanhaAvaliacao");
        return query.list();
    }
}
