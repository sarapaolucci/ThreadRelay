/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staffetta;


/**
 *
 * @author paolucci.sara
 */
public class Gestore {
    private Runner r1, r2, r3, r4;

    public Gestore() {

        r1 = new Runner("1");
        r2 = new Runner("2");
        r3 = new Runner("3");
        r4 = new Runner("4");

        // catena
        r1.setProssimo(r2);
        r2.setProssimo(r3);
        r3.setProssimo(r4);

        //
    }

    public void startRace() {
        r1.start();
    }

    // collegamento GUI
    public void bind(Observer o1, Observer o2, Observer o3, Observer o4) {
        r1.addObserver(o1);
        r2.addObserver(o2);
        r3.addObserver(o3);
        r4.addObserver(o4);
    }
    
}
