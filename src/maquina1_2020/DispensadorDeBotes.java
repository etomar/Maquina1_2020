/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina1_2020;

/**
 *
 * @author PC-JLCC
 */
public class DispensadorDeBotes {
     private int botes; 
public void iniciarDispensadorDeBotes (int i){
botes=i;
}
public boolean pulsarBoton (){
    boolean si=false;
    if (botes>0){
        si=false;
    }
    else if (botes<=0){
        si=false;
    }
    return si;
}
public int  botesDisoponibles(){

    return botes;
    
}
}

