/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnhibernate.service;

import com.mycompany.mvnhibernate.entity.Kis;
import com.mycompany.mvnhibernate.framework.DbException;
import java.util.List;

/**
 *
 * @author vektorel
 */
public class KisiService implements IBaseService<Kis> {

    public List<Kis> getAll() {
          return new BaseService().getAll(Kis.class);
        
        
        
        
        
    }

    public Kis getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Kis save(Kis obj) throws DbException {
        if (obj == null) {
            throw new DbException("Nesne Boş OLmamalıdır");
        }
        if (obj.getAd() == null) {
            throw new DbException("iSİM BOŞ olMAMALI");
        }
        if (obj.getSoyad() == null) {
            throw new DbException("Soyisim boş  olmasın");
        }
        return (Kis) new BaseService().save(obj);
    }

    public Boolean delete(Kis obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Kis update(Kis obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
