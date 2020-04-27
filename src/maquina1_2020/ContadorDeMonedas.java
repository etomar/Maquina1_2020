public class ContadorDeMonedas {

    private float cantidad; //Dinero introducido por el usuario actual.
    private float disponible; //Dinero almacenado en la maquina, se utiliza para dar cambio.

/* Inicializa el objeto y fija el cambio inicialmente
disponible. */
/* Entradas: float i, saldo inicialmente disponible para
cambios */
/* Salidas: Ninguna*/

    public ContadorDeMonedas(float i) {
        iniciarContadorDeMonedas(i);
    }
    public void iniciarContadorDeMonedas (float i) {

        this.disponible = i;
        this.cantidad = 0;
    }
/* Informa sobre el saldo actual del cliente */
/* Entradas: Ninguna */
/* Salidas: float, el saldo del cliente */
    public float saldo () {
        
        return this.cantidad;
    }
/* Insertar la moneda m */
/* Entrada: float m, la cantidad de dinero introducida */
/* Salidas: Ninguna */
    public void insertarMoneda (float m) {

        this.cantidad = m;
    }
/* Devuelve el cambio, si es posible */
/* Una vez entregado el cambio, el dinero introducido por el
cliente */
/* pasa a engrosar el disponible de la maquina
/* Entradas: float c, el precio del producto*/
/* Salidas: el cambio, negativo si falta dinero */
    public float darCambioDe (float c) {

        float cambio = 0;

        if (this.cantidad < c) {
            cambio = -1;
        } else {
            cambio = this.cantidad - c;
            this.disponible += c;
        }

        this.cantidad = 0;
        return cambio;
    }
/* El cliente recupera el dinero introducido si todavia */
/* no se ha realizado la venta */
/* Entradas: Ninguna */
/* Salidas: float, la cantidad devuelta */
    public float retornar () {

        return this.cantidad;
    }

    public float getDisponible() {
        return this.disponible;
    }

    public void setDisponible(float d) {
        this.disponible = d;
    }

    public float getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(float d) {
        this.cantidad = d;
    }

    public void sumarCantidad(float d) {
        this.cantidad += d;
    }
}