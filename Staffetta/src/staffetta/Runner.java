/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staffetta;

/**
 *
 * @author paolucci.sara
 */
public class Runner extends Thread{
    private Testimone t;
    private String nome;
    
    public Runner(String n,Testimone t){
        this.nome = n;
        this.t = t;
    }
    
    @Override
    public void run(){
        try{
            t.corri(nome);
            System.out.println(nome + " in corsa");
            Thread.sleep(2000);
            t.esci(nome);
        } catch (InterruptedException ex) {
            System.getLogger(Runner.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
    }
    
}
