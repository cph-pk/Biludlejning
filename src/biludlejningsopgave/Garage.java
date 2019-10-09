/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biludlejningsopgave;

import java.util.ArrayList;

/**
 *
 * @author Per
 */
public class Garage {
    private ArrayList<Bil> garage = new ArrayList<Bil>();
    private String navn;

    // constructor
    public Garage(String navn) {
        this.navn = navn;
    }

    // getter
    public String getNavn() {
        return navn;
    }

    // setter
    public void setNavn(String navn) {
        this.navn = navn;
    }

    // add bil to garage
    public void addToGarage(Bil bil) {
        garage.add(bil);
    }

    // remove bil from garage
    public void removeFromGarage(Bil bil) {
        garage.remove(bil);
    }

    // count size of garage
    public int garageSize() {
        int size = garage.size();
        return size;
    }

    public double beregnGroenAfgiftForBilpark() {
        double samletAfgift = 0;
        for (int i = 0; i < garage.size(); i++) {
            samletAfgift += garage.get(i).beregnGroenEjerafgift();
        }
        return samletAfgift;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < garage.size(); i++) {
            result += garage.get(i).toString() + "\n";
        }
        return result;
    }
}
