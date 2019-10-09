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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Benzinbil volvo = new Benzinbil("pop 123", "Volvo", "v70", 2012, 5, 95, 10.2);
        Elbil tesla = new Elbil("pap 321", "Tesla", "Model S", 2017, 5, 515.0, 600.0, 200.0);
        Dieselbil audi = new Dieselbil("pip 765", "Audi", "A4", 2016, 5, true, 16.4);
        Benzinbil ferrari = new Benzinbil("Speeed1", "Ferrari", "488 GTB", 2019, 2, 98, 4.7);
        Dieselbil ford = new Dieselbil("pyt 843", "Ford", "Transit", 1987, 3, false, 4.9);

        // create garage with cars
        Garage garage = new Garage("Kurts Garage");
        garage.addToGarage(volvo);
        garage.addToGarage(tesla);
        garage.addToGarage(audi);
        garage.addToGarage(ferrari);
        garage.addToGarage(ford);

        // write garage to console
        String line = "-----------------------------------------------------------";
        System.out.println(line);
        System.out.println("\t\t" + garage.getNavn());
        System.out.println(line + "\n");

        System.out.print(garage);
        System.out.println("Garagen indeholder " + garage.garageSize() + " biler.");
        System.out.println(line);

        System.out.println("\tGaragens samlede ejerafgift er "
                + String.format("%,.2f", garage.beregnGroenAfgiftForBilpark()) + " kr.");
        System.out.println(line + "\n");

        // remove car from garage
        System.out.println();
        System.out.print("Bil fjernet fra garage\n");
        System.out.println(line);
        garage.removeFromGarage(ford);
        System.out.print(garage);
        System.out.println("Garagen indeholder " + garage.garageSize() + " biler.");
        System.out.println(line);
    }
    
}
