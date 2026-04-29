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
public class Runner extends Thread{
    private String nome;
    private ArrayList<Observer> observers = new ArrayList<>();
    private int progresso = 0;

    private Runner prossimo;
    private boolean attivo = false;

    public Runner(String nome) {
        this.nome = nome;
    }

    public void setProssimo(Runner r) {
        this.prossimo = r;
    }


    public void addObserver(Observer o) {
        observers.add(o);
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(progresso);
        }
    }

    @Override
    public void run() {

            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {}

                progresso = i;
                notifyObservers();

                if (progresso >= 90) {
                    prossimo.start();
                }
            }

            attivo = false; // IMPORTANTISSIMO
        }
    
    
 }

