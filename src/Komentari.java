/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zmaj9
 */
public class Komentari {

    public Komentari(String komentar, String datum) {
        this.komentar = komentar;
        this.datum = datum;
    }

    public Komentari(String komentar) {
        this.komentar = komentar;
    }

    private String komentar;
    private String datum;

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

//Geteri i seteri
    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }
    //

}
