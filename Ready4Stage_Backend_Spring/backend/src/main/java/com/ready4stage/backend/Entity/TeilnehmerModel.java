package com.ready4stage.backend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teilnehmer")
public class TeilnehmerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")    
    private Integer id;

    @Column(name = "Namen")
    private String Namen;

    @Column(name = "Vorname")
    private String Vorname;

    @Column(name = "Bankverbindung")
    private String Bankverbindung;

    @Column(name = "Kurse")
    private String Kurse;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Telefon")
    private String Telefon;

    @Column(name = "Adresse")
    private String Adresse;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamen() {
        return this.Namen;
    }

    public void setNamen(String Namen) {
        this.Namen = Namen;
    }

    public String getVorname() {
        return this.Vorname;
    }

    public void setVorname(String Vorname) {
        this.Vorname = Vorname;
    }

    public String getBankverbindung() {
        return this.Bankverbindung;
    }

    public void setBankverbindung(String Bankverbindung) {
        this.Bankverbindung = Bankverbindung;
    }

    public String getKurse() {
        return this.Kurse;
    }

    public void setKurse(String Kurse) {
        this.Kurse = Kurse;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefon() {
        return this.Telefon;
    }

    public void setTelefon(String Telefon) {
        this.Telefon = Telefon;
    }

    public String getAdresse() {
        return this.Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    

}