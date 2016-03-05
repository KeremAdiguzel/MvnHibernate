/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnhibernate.service;

import com.mycompany.mvnhibernate.framework.DbException;
import com.mycompany.mvnhibernate.hibernate.KHibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author vektorel
 */
public class BaseService {

    public List getAll(Class cls) {
        Session session = KHibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(cls);
        return criteria.list();
    }

    public Object getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object save(Object obj) throws DbException {
        Session session = KHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(obj);
        transaction.commit();
        session.close();
        return obj;
    }

    public Boolean delete(Object obj) throws DbException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object update(Object obj) throws DbException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
