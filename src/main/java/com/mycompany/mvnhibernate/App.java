package com.mycompany.mvnhibernate;

import com.mycompany.mvnhibernate.entity.Kis;
import com.mycompany.mvnhibernate.framework.DbException;
import com.mycompany.mvnhibernate.service.KisiService;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        KisiService kisiService = new KisiService();
        try {
            kisiService.save(new Kis(Long.MIN_VALUE, "kerm", "ad", new Date(), "4484", "1484", Boolean.TRUE));
        } catch (DbException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        kisiService.getAll();

    }
}
