
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

