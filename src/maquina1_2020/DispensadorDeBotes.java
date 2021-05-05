/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina1_2020;

import java.util.Scanner;

/**
 * 
 *@author Jenifer Benavent Zapata
 *@version 1.0
 * 
 */
public class DispensadorDeBotes {
 
     Scanner tec=new Scanner (System.in);

    private int botes; //Numero actual de botes.

   
    /**
     * 
     * @param i
     * 
     */
    public DispensadorDeBotes (int i) {

        this.botes=i;

    }
    
    /**
     * 
     * @param b 
     */
    public void setBotes(int b) {
        
	this.botes=b;
        
    }

   /**
    * 
    * @return boolean
    */
    public boolean pulsarBoton () {
            boolean hayBotes=false;

            if (botesDisponibles()>0) {
        hayBotes= true;
        botes--;

            }
            return hayBotes;

    }

    /**
     * 
     * @return int
     * 
     */
    public int botesDisponibles () {
        int botesDisp=botes;
        System.out.println("---Num de botes disponibles---");
        return botesDisp;

        }

    
    
}
