public class MaquinaDeBebidas {

    private ContadorDeMonedas contador; //Contador de monedas de la maquina
    private DispensadorDeBotes cola, limon, naranja, tonica, agua;
    private float precio; //Precio de las bebidas(común para todas)

/* Inicializa la maquina y todos los elementos asociados */
/* Entradas: float m, cantidad inicial de monedas para el
cambio */
/* int b, cantidad inicial de botes en los dispensadores */
/* float pvp, precio de las bebidas */
/* Salidas: Ninguna */

    public MaquinaDeBebidas() {
        
    }

    public void iniciarMaquinaDeBebidas (float m, int b, float pvp) {

        contador.setDisponible(m);
        cola.setBotes(b);
        limon.setBotes(b);
        naranja.setBotes(b);
        tonica.setBotes(b);
        agua.setBotes(b);
        this.precio = pvp;
    }
/* Responder a una acción del usuario. Discrimina el tipo de
accion */
/* y utiliza las operaciones privadas */
/* Entradas: char o, la orden del usuario */
/* Salidas: Ninguna */
    public void darOrden (char o) {

        switch(o) {
            case A:
                contador.sumarCantidad(0.05F);
                System.out.println("Moneda introducida correctamente!");
                break;
            case B:
                contador.sumarCantidad(0.1F);
                System.out.println("Moneda introducida correctamente!");
                break;
            case C:
                contador.sumarCantidad(0.2F);
                System.out.println("Moneda introducida correctamente!");
                break;
            case D:
                contador.sumarCantidad(0.5F);
                System.out.println("Moneda introducida correctamente!");
                break;
            case E:
                contador.sumarCantidad(1F);
                System.out.println("Moneda introducida correctamente!");
                break;
            case R:
                System.out.println("Devolviendo monedas...");
                System.out.println(contador.getCantidad() + " euros");
                contador.setCantidad(0F);
                break;
            case 1:
                System.out.println("Entregando bote de cola");
                if(cola.pulsarBoton()) {
                    cola.setBotes(cola.getBotes() - 1);
                    System.out.println("Este es su cambio: " + contador.darCambioDe(this.precio));
                } else {
                    System.out.println("No quedan botes de cola");
                }
                break;
            case 2:
                System.out.println("Entregando bote de limon");
                if(cola.pulsarBoton()) {
                    cola.setBotes(cola.getBotes() - 1);
                    System.out.println("Este es su cambio: " + contador.darCambioDe(this.precio));
                } else {
                    System.out.println("No quedan botes de limon");
                }
                break;
            case 3:
                System.out.println("Entregando bote de naranja");
                if(cola.pulsarBoton()) {
                    cola.setBotes(cola.getBotes() - 1);
                    System.out.println("Este es su cambio: " + contador.darCambioDe(this.precio));
                } else {
                    System.out.println("No quedan botes de naranja");
                }
                break;
            case 4:
                System.out.println("Entregando bote de tonica");
                if(cola.pulsarBoton()) {
                    cola.setBotes(cola.getBotes() - 1);
                    System.out.println("Este es su cambio: " + contador.darCambioDe(this.precio));
                } else {
                    System.out.println("No quedan botes de tonica");
                }
                break;
            case 5:
                System.out.println("Entregando bote de agua");
                if(cola.pulsarBoton()) {
                    cola.setBotes(cola.getBotes() - 1);
                    System.out.println("Este es su cambio: " + contador.darCambioDe(this.precio));
                } else {
                    System.out.println("No quedan botes de agua");
                }
                break;
            case f:
                System.out.println("Apagando máquina...");
                System.out.println("ADIOS");
                break;
        }
    }
/* Visualiza la informacion de interes sobre la maquina */
/* Botes en cada dispensador, precio de las bebidas, saldo
del cliente */
/* Entradas: Ninguna */
/* Salidas: Ninguna */
    public void visualizarMaquina () {

        System.out.println("PRECIO UNICO: " + this.precio);
        System.out.println("Cola: " + cola.getBotes() + " unidades");
        System.out.println("Limon: " + limon.getBotes() + " unidades");
        System.out.println("Naranja: " + naranja.getBotes() + " unidades");
        System.out.println("Tonica: " + tonica.getBotes() + " unidades");
        System.out.println("Agua: " + agua.getBotes() + " unidades");
        System.out.println("Saldo: " + contador.getCantidad() + " euros");
    }
/* Realiza las acciones relacionadas con la introducción de
monedas */
/* Entradas: char o, la orden del usuario */
/* Salidas: Ninguna */
    private void ordenMonedas (char o) {


    }
/* Realiza las acciones relacionadas con la selección de una
bebida */
/* Entradas: char o, la orden del usuario */
/* Salidas: Ninguna */
    private void ordenSeleccion (char o) {


    }
}
