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
public class Elbil extends Bil {
    private double batterikapacitetKWh;
    private double maxKm;
    private double whPrKm;

    // constructor
    public Elbil(String regNr, String maerke, String model, int aargang, int antalDoere, Double batterikapacitetKWh,
            Double maxKm, Double whPrKm) {
        super(regNr, maerke, model, aargang, antalDoere);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    // getter
    public double getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public double getMaxKm() {
        return maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    // setter
    public void setBatterikapacitetKWh(Double batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public void setMaxKm(Double maxKm) {
        this.maxKm = maxKm;
    }

    public void setWhPrKm(Double whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return maerke + " " + model + ", Aargang " + aargang + " med " + antalDoere + " doere.\nBatterikapacitet KWh: "
                + batterikapacitetKWh + ", Range km: " + maxKm + "\n" + "watt pr kilometer: " + whPrKm
                + "\nHar registreringsnummer: " + regNr + "\nGroen ejerafgift: "
                + String.format("%,.2f", beregnGroenEjerafgift()) + " kr.\n";
    }

    @Override
    public double beregnGroenEjerafgift() {
        double groenEjerafgift = 0;
        double kmPrL = 0;

        // whPrKm til kmPrL
        kmPrL = 100 / (whPrKm / 91.25);

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
