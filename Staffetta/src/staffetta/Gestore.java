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
public class Gestore {
    private ArrayList<Runner> runners;
    
    public Gestore(){
        this.runners = new ArrayList();
    }
    
    public ArrayList<Runner> getRunners(){
        return this.runners;
    }
    
}
