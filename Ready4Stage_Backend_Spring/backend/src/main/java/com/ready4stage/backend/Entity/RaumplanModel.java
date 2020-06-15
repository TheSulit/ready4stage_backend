package com.ready4stage.backend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "raumplan")
public class RaumplanModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "Raum_Nr")
    private String Raum_Nr;

    @Column(name = "Gesang")
    private String Gesang;

    @Column(name = "Gitarre")
    private String Gitarre;

    @Column(name = "Klavier")
    private String Klavier;

    @Column(name = "Keyboard")
    private String Keyboard;

    @Column(name = "Bass")
    private String Bass;

    @Column(name = "Geigen")
    private String Geigen;

    @Column(name = "Trompete")
    private String Trompete;

    @Column(name = "Saxophone")
    private String Saxophone;

    @Column(name = "Querfloete")
    private String Querfloete;

    @Column(name = "Klarinette")
    private String Klarinette;

    @Column(name = "Ukulele")
    private String Ukulele;

    @Column(name = "Band")
    private String Band;

    @Column(name = "Schlagzeug")
    private String Schlagzeug;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRaum_Nr() {
        return this.Raum_Nr;
    }

    public void setRaum_Nr(String Raum_Nr) {
        this.Raum_Nr = Raum_Nr;
    }

    public String getGesang() {
        return this.Gesang;
    }

    public void setGesang(String Gesang) {
        this.Gesang = Gesang;
    }

    public String getGitarre() {
        return this.Gitarre;
    }

    public void setGitarre(String Gitarre) {
        this.Gitarre = Gitarre;
    }

    public String getKlavier() {
        return this.Klavier;
    }

    public void setKlavier(String Klavier) {
        this.Klavier = Klavier;
    }

    public String getKeyboard() {
        return this.Keyboard;
    }

    public void setKeyboard(String Keyboard) {
        this.Keyboard = Keyboard;
    }

    public String getBass() {
        return this.Bass;
    }

    public void setBass(String Bass) {
        this.Bass = Bass;
    }

    public String getGeigen() {
        return this.Geigen;
    }

    public void setGeigen(String Geigen) {
        this.Geigen = Geigen;
    }

    public String getTrompete() {
        return this.Trompete;
    }

    public void setTrompete(String Trompete) {
        this.Trompete = Trompete;
    }

    public String getSaxophone() {
        return this.Saxophone;
    }

    public void setSaxophone(String Saxophone) {
        this.Saxophone = Saxophone;
    }

    public String getQuerfloete() {
        return this.Querfloete;
    }

    public void setQuerfloete(String Querfloete) {
        this.Querfloete = Querfloete;
    }

    public String getKlarinette() {
        return this.Klarinette;
    }

    public void setKlarinette(String Klarinette) {
        this.Klarinette = Klarinette;
    }

    public String getUkulele() {
        return this.Ukulele;
    }

    public void setUkulele(String Ukulele) {
        this.Ukulele = Ukulele;
    }

    public String getBand() {
        return this.Band;
    }

    public void setBand(String Band) {
        this.Band = Band;
    }

    public String getSchlagzeug() {
        return this.Schlagzeug;
    }

    public void setSchlagzeug(String Schlagzeug) {
        this.Schlagzeug = Schlagzeug;
    }

}