/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnhibernate.framework;

/**
 *
 * @author vektorel
 */
public class DbException extends Exception{

    public DbException(String mesaj) {
         super(mesaj);
    }
    
}
