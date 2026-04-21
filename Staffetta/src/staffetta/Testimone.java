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
    private boolean inCorsa;
    
    public synchronized void corri() throws InterruptedException{
        while(inCorsa){
            try{
                System.out.println("aspetto testimone...");
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Ho il testimone");
            inCorsa = true;
        }
    }
    
    public synchronized void esci(){
        inCorsa = false;
        System.out.println("Lascio il testimone");
        notifyAll();
    }
    
}
