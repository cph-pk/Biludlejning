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
public class Benzinbil extends Bil {
    private int oktantal;
    private double kmPrL;

    // constructor
    public Benzinbil(String regNr, String maerke, String model, int aargang, int antalDoere, int oktantal,
            Double kmPrL) {
        super(regNr, maerke, model, aargang, antalDoere);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }

    // getter
    public double getOktantal() {
        return oktantal;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    // setter
    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public void setKmPrL(Double kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return maerke + " " + model + ", Aargang " + aargang + " med " + antalDoere + " doere.\nKoerer " + kmPrL
                + " km paa en liter benzin, oktan " + oktantal + ".\nHar registreringsnummer: " + regNr
                + "\nGroen ejerafgift: " + String.format("%,.2f", beregnGroenEjerafgift()) + " kr.\n";
    }

    @Override
    public double beregnGroenEjerafgift() {
        double groenEjerafgift = 0;

        if (kmPrL >= 20 && kmPrL <= 50) {
            groenEjerafgift = 330;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            groenEjerafgift = 1050;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            groenEjerafgift = 2340;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            groenEjerafgift = 5500;
        } else if (kmPrL < 5) {
            groenEjerafgift = 10470;
        }
        return groenEjerafgift;
    }
}
