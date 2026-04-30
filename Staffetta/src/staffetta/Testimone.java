/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staffetta;

/**
 *
 * @author paolucci.sara
 */
public class Testimone {
    private int runnerCorrente = 0;

    public synchronized void attendiTurno(int id) throws InterruptedException {
        while (runnerCorrente != id) {
            wait();
        }
    }

    public synchronized void passa() {
        runnerCorrente++;
        notifyAll();
    }
}
