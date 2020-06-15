package com.ready4stage.backend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ls_ready4stage_belegung_raum_2")
public class RaumBelegung2Model {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "Raum_2")
    private String Raum_2;
    
    @Column(name = "Montag")
    private String Montag;

    @Column(name = "Dienstag")
    private String Dienstag;

    @Column(name = "Mittwoch")
    private String Mittwoch;

    @Column(name = "Donnerstag")
    private String Donnerstag;

    @Column(name = "Freitag")
    private String Freitag;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRaum_2() {
        return this.Raum_2;
    }

    public void setRaum_2(String Raum_2) {
        this.Raum_2 = Raum_2;
    }

    public String getMontag() {
        return this.Montag;
    }

    public void setMontag(String Montag) {
        this.Montag = Montag;
    }

    public String getDienstag() {
        return this.Dienstag;
    }

    public void setDienstag(String Dienstag) {
        this.Dienstag = Dienstag;
    }

    public String getMittwoch() {
        return this.Mittwoch;
    }

    public void setMittwoch(String Mittwoch) {
        this.Mittwoch = Mittwoch;
    }

    public String getDonnerstag() {
        return this.Donnerstag;
    }

    public void setDonnerstag(String Donnerstag) {
        this.Donnerstag = Donnerstag;
    }

    public String getFreitag() {
        return this.Freitag;
    }

    public void setFreitag(String Freitag) {
        this.Freitag = Freitag;
    }

}