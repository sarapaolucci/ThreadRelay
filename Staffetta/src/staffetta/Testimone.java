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
    private int turno = 0;

    public synchronized void attendiTurno(int id, String nome) throws InterruptedException {
        while (id != turno) {
            System.out.println(nome + " aspetta...");
            wait();
        }
        System.out.println(nome + " parte!");
    }

    public synchronized void passaTestimone(String nome) {
        turno++;
        System.out.println(nome + " passa il testimone (90%)");
        notifyAll();
    }
}
