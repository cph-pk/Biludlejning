/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biludlejningsopgave;

/**
 *
 * @author Per
 */
public abstract class Bil {
    protected String regNr;
    protected String maerke;
    protected String model;
    protected int aargang;
    protected int antalDoere;

    // constructor
    public Bil(String regNr, String maerke, String model, int aargang, int antalDoere) {
        this.regNr = regNr;
        this.maerke = maerke;
        this.model = model;
        this.aargang = aargang;
        this.antalDoere = antalDoere;
    }

    // getter
    public String getRegNr() {
        return regNr;
    }

    public String getMaerke() {
        return maerke;
    }

    public String getModel() {
        return model;
    }

    public int getAargang() {
        return aargang;
    }

    public int getAntalDoere() {
        return antalDoere;
    }

    // setter
    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public void setMaerke(String maerke) {
        this.maerke = maerke;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAargang(int aargang) {
        this.aargang = aargang;
    }

    public void setAntalDoere(int antalDoere) {
        this.antalDoere = antalDoere;
    }

    public abstract double beregnGroenEjerafgift();
}
