/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staffetta;

/**
 *
 * @author paolucci.sara
 */
public class Staffetta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Testimone t = new Testimone();
        
        Runner r1 = new Runner("Angelica",t);
        Runner r2 = new Runner("Elena",t);
        Runner r3 = new Runner("Daniela",t);
        Runner r4 = new Runner("Annalisa",t);
        
        r1.start();
        r2.start();
        r3.start();
        r4.start();
    }
    
}
