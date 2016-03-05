/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnhibernate.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vektorel
 */
public class Kullanici {
    private Long id;
    private String ad;
    private String soyad;
    private Date tarih;
@Id
        @Column(name="kullanici_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
@Column(name="İsim",length=50,nullable=false)
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
@Column(name="soyisim",length=50,nullable=false)
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
@Column(name="tarih")
@Temporal(TemporalType.DATE)
    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }
@Column(name="email",length=60,nullable=true)

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private String email;
    
    
    
    
    
}
