/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staffetta;

import javax.swing.JProgressBar;

/**
 *
 * @author paolucci.sara
 */
public class Runner extends Thread{
    private Testimone t;
    private String nome;
    private JProgressBar pbr;
    
    public Runner(String n,Testimone t, JProgressBar p){
        this.nome = n;
        this.t = t;
        this.pbr = p;
    }
    
    @Override
    public void run(){
        for (int i = 0; i <= 100; i++) {

        int v = i;

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                pbr.setValue(v);
            }
        });
        try{
            t.corri(nome);
            System.out.println(nome + " in corsa");
            Thread.sleep(50);
            t.esci(nome);
        } catch (InterruptedException ex) {
            System.getLogger(Runner.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
    }
    
    }
}
