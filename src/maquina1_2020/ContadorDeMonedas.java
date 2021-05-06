package maquina1_2020;

/**
 * 
 * @author javier Fabregat
 * @version 1.0
 */
public class ContadorDeMonedas {
    private float cantidad;
    private float disponible;
    
        /**
         * 
         * @param i Dinero disponible de la maquina
         */
    public ContadorDeMonedas(float i) {
        this.disponible=i;
    }
        
    /**
         * 
         * @return Devuelve la cantidad de monedas introducidas
         */
    public float saldo() {
        float monedas=cantidad;
        return monedas;
    }
    
        /**
         * 
         * @param m Cantidad total de monedas introducidas
         */
    public void insertarMoneda(float m) {
        this.cantidad+=m;
    }
    
        /**
         * 
         * @param c Cantidad a restar de la máquina
         * @return Devuelve el cambio de la transaccion
         */
    public float darCambioDe(float c) {
        float cambio=cantidad-c;
        if (cambio>=0){
            disponible+=cantidad;
            cantidad=0;
        }
        return cambio;
    }
    
        /**
         * 
         * @return Devueve el dinero introdicido si no se ha realizado la transacción
         */
    public float retornar() {
        float devolucion=cantidad;
        if (devolucion>0)
            cantidad=0;
        return devolucion;
    }

}
