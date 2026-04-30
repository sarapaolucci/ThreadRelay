/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staffetta;

import java.util.ArrayList;


/**
 *
 * @author paolucci.sara
 */
public class Gestore implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();
    private ArrayList<Runner> runners = new ArrayList<>();

    public Gestore() {
        Testimone t = new Testimone();

        for (int i = 0; i < 4; i++) {
            runners.add(new Runner(i, t, this));
        }
    }

    public void startRace() {
        for (Runner r : runners) {
            r.start();
        }
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObservers(int runnerId, int progress) {
        for (Observer o : observers) {
            o.update(runnerId, progress);
        }
    }

}
