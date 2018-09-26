/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zmaj9
 */
public class Toneri {

    private int stampacID;
    private String proizvodjac;
    private String tip;
    private String proizvod;
    private String oznaka;
    private String stampaci;
    private int kolicina;

    public Toneri(int stampacID, String proizvodjac, String tip, String proizvod, String oznaka, String stampaci, int kolicina) {
        this.stampacID = stampacID;
        this.proizvodjac = proizvodjac;
        this.tip = tip;
        this.proizvod = proizvod;
        this.oznaka = oznaka;
        this.stampaci = stampaci;
        this.kolicina = kolicina;
    }

    public int getStampacID() {
        return stampacID;
    }

    public void setStampacID(int stampacID) {
        this.stampacID = stampacID;
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getProizvod() {
        return proizvod;
    }

    public void setProizvod(String proizvod) {
        this.proizvod = proizvod;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public String getStampaci() {
        return stampaci;
    }

    public void setStampaci(String stampaci) {
        this.stampaci = stampaci;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

}
