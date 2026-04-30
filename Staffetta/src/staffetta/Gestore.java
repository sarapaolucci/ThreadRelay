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
    private boolean paused = false;
    private boolean stopped = false;
    
    public Gestore(int delay) {
        Testimone t = new Testimone();

        for (int i = 0; i < 4; i++) {
            runners.add(new Runner(i, "Runner " + i, t, this, delay,this));
        }
    }

    public void startRace() {
        for (Runner r : runners) {
            r.start();
        }
    }
    
    public synchronized void sospendi() {
        paused = true;
    }

    
    public synchronized void riprendi() {
        paused = false;
        notifyAll();
    }


    public synchronized void ferma() {
        stopped = true;
        notifyAll();
    }


    public synchronized void checkPausa() throws InterruptedException {
        while (paused && !stopped) {
            wait();
        }
    }

    public boolean isStopped() {
        return stopped;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers(int runnerId, int progress) {
        for (Observer o : observers) {
            o.update(runnerId, progress);
        }
    }
}
