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
public class Runner extends Thread {
    private int id;
    private Testimone testimone;
    private Subject subject;

    public Runner(int id, Testimone t, Subject s) {
        this.id = id;
        this.testimone = t;
        this.subject = s;
    }

    @Override
    public void run() {
        try {
            testimone.attendiTurno(id);

            for (int i = 0; i <= 100; i++) {
                Thread.sleep((int)(Math.random() * 100));

                subject.notifyObservers(id, i);
            }

            testimone.passa();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

