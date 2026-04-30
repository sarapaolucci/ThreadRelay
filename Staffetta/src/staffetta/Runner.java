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
    private String nome;
    private Testimone t;
    private Subject subject;
    private int delay;

    public Runner(int id, String nome, Testimone t, Subject subject, int delay) {
        this.id = id;
        this.nome = nome;
        this.t = t;
        this.subject = subject;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            t.attendiTurno(id, nome);

            boolean passato = false;

            for (int i = 0; i <= 100; i++) {

                Thread.sleep(delay);

                subject.notifyObservers(id, i);

                if (i == 90 && !passato) {
                    t.passaTestimone(nome);
                    passato = true;
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}