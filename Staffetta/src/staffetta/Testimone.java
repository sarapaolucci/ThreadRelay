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
    private boolean inCorsa = false;
    
    public synchronized void corri(String nome) throws InterruptedException{
        while(inCorsa){
            System.out.println(nome + " aspetta testimone...");
            wait();
        }
        System.out.println(nome + " ha il testimone");
        inCorsa = true;
        
    }
    
    public synchronized void esci(String nome){
        inCorsa = false;
        System.out.println(nome + " passa il testimone");
        notifyAll();
    }
    
}
