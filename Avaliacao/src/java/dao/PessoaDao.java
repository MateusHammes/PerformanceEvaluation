/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Pessoa;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Mateus
 */
public class PessoaDao {

    private Session session;

    public PessoaDao() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void insert(Pessoa pessoa) {
        Transaction t = session.beginTransaction();
        session.save(pessoa);
        t.commit();
    }

    public void update(Pessoa pessoa) {
        Transaction t = session.beginTransaction();
        session.merge(pessoa);
        t.commit();
    }

    public void delete(Pessoa pessoa) {
        Transaction t = session.beginTransaction();
        session.delete(pessoa);
        t.commit();
    }

    public Pessoa findById(int id) {
        return (Pessoa) session.load(Pessoa.class, id);
    }

    public List<Pessoa> findAll() {
        Query query = session.createQuery("from Pessoa");
        return query.list();
    }
}
