/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnhibernate.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vektorel
 */
@Entity
@Table(name = "gnl_kisi")
public class Kis implements Serializable {

    private Long id;
    private String ad;

    @Id
    @Column(name = "kisi_adi")
    @SequenceGenerator(sequenceName="seq_kisi", allocationSize=1,name="seq_kisi")
    @GeneratedValue(generator="seq_kisi",strategy= GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "ad", length = 100, nullable = false)
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Column(name = "soyad", length = 100, nullable = false)
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Column(name = "dogum_tarihi")
    @Temporal(TemporalType.DATE)
    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Boolean cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
    private String soyad;
    private Date tarih;
    private String adres;
    private String email;
    private Boolean cinsiyet;

    public Kis() {
    }

    public Kis(Long id, String ad, String soyad, Date tarih, String adres, String email, Boolean cinsiyet) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.tarih = tarih;
        this.adres = adres;
        this.email = email;
        this.cinsiyet = cinsiyet;
    }

    @Override
    public String toString() {
        return "Kis{" + "id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", tarih=" + tarih + ", adres=" + adres + ", email=" + email + ", cinsiyet=" + cinsiyet + '}';
    }
}
