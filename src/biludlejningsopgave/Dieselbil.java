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
public class Dieselbil extends Bil {
    private boolean harPartikelfilter;
    private double kmPrL;

    // constructor
    public Dieselbil(String regNr, String maerke, String model, int aargang, int antalDoere, boolean harPartikelfilter,
            Double kmPrL) {
        super(regNr, maerke, model, aargang, antalDoere);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }

    // getter
    public boolean harPartikelfilter() {
        return harPartikelfilter;
    }

    public double kmPrl() {
        return kmPrL;
    }

    // setter
    public void harPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public void kmPrL(Double kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        String filter = "nej";
        if (harPartikelfilter) {
            filter = "ja";
        }

        return maerke + " " + model + ", Aargang " + aargang + " med " + antalDoere + " doere.\nKoerer " + kmPrL
                + " km paa en liter diesel.\nPartikefilter: " + filter + "\nHar registreringsnummer: " + regNr
                + "\nGroen ejerafgift: " + String.format("%,.2f", beregnGroenEjerafgift()) + " kr.\n";
    }

    @Override
    public double beregnGroenEjerafgift() {
        double groenEjerafgift = 0;
        double partikelfilter = 0;

        // afgift + udligningsafgift
        if (kmPrL >= 20 && kmPrL <= 50) {
            groenEjerafgift = 330 + 130;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            groenEjerafgift = 1050 + 1390;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            groenEjerafgift = 2340 + 1850;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            groenEjerafgift = 5500 + 2770;
        } else if (kmPrL < 5) {
            groenEjerafgift = 10470 + 15260;
        }

        // har ikke partikelfilter
        if (!harPartikelfilter)
            partikelfilter = 1000;

        return groenEjerafgift + partikelfilter;
    }
}
