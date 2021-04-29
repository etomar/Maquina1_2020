package practica6EDE;

public class MaquinaDeBebidas {
	private ContadorDeMonedas contador; //Contador de monedas de la maquina 
	private DispensadorDeBotes cola; //Cinco dispensadores de botes: limon, naranja, tonica, agua; 
	private float precio;//Precio de las bebidas(común para todas) 
	
	/* Inicializa la maquina y todos los elementos asociados
	 * Entradas: float m, cantidad inicial de monedas para el cambio
	 * int b, cantidad inicial de botes en los dispensadores
	 * float pvp, precio de las bebidas
	 * Salidas: Ninguna
	 */
	public MaquinaDeBebidas (float m, int b, float pvp) {
		this.contador=new ContadorDeMonedas(m);
		this.cola=new DispensadorDeBotes(b);
		this.precio=pvp;
	}
	
	public MaquinaDeBebidas() {
		
	}
	
	/* Metodo que aparece en el main de Emiliano
	 * Inicializa el constructor
	 * Entradas: float m, cantidad inicial de monedas para el cambio
	 * int b, cantidad inicial de botes en los dispensadores
	 * float pvp, precio de las bebidas
	 * Salidas: Ninguna
	 */
	public void iniciarMaquinaDeBebidas(float m, int b, float pvp) {
		this.contador=new ContadorDeMonedas(m);
		this.cola=new DispensadorDeBotes(b);
		this.precio=pvp;
	}
	
	/* Responder a una acción del usuario. Discrimina el tipo de accion y utiliza las operaciones privadas
	 * Entradas: char o, la orden del usuario
	 * Salidas: Ninguna
	 */
	public void darOrden (char o) {
		switch (o) {
		
		case 'A': case 'a':
		case 'B': case 'b':
		case 'C': case 'c':
		case 'D': case 'd':
		case 'E': case 'e':
			ordenMonedas(o);
			break;
		
		case 'F': case 'f':
			System.out.println("Maquina apagada.");
			break;
		
		case 'R': case 'r':
			System.out.println("Devolucion: "+contador.retornar()+"€");
			break;
			
		case '1': case '2': case '3': case '4': case '5':
			ordenSeleccion(o);
			break;
		default: System.out.println("Esta opcion no esta disponible."); break;
		}
	}
	
	/* Visualiza la informacion de interes sobre la maquina
	 * Botes en cada dispensador, precio de las bebidas, saldo del cliente
	 * Entradas: Ninguna
	 * Salidas: Ninguna
	 */
	public void visualizarMaquina () {
		System.out.printf("Cantidad de botes: "+cola.botesDisponibles()+""
				+ "\nPrecio de las bebidas: "+precio+"€"
				+ "\nSaldo: %.2f", contador.saldo());
		System.out.println("€");
	}
	
	/* Realiza las acciones relacionadas con la introducción de monedas
	 * Entradas: char o, la orden del usuario
	 * Salidas: Ninguna
	 */ 
	private void ordenMonedas (char o) {
		switch (o) {
		case 'A': case 'a':
			contador.insertarMoneda(0.05F);
			break;
		case 'B': case 'b':
			contador.insertarMoneda(0.10F);
			break;
		case 'C': case 'c':
			contador.insertarMoneda(0.20F);
			break;
		case 'D': case 'd': 
			contador.insertarMoneda(0.50F);
			break;
		case 'E': case 'e':
			contador.insertarMoneda(1);
			break;
		}
	}
	
	/* Realiza las acciones relacionadas con la selección de una bebida
	 * Entradas: char o, la orden del usuario
	 * Salidas: Ninguna
	 */ 
	private void ordenSeleccion (char o) {
		int botes=cola.botesDisponibles();
		switch (o) {
		case '1': case '2': case '3': case '4': case '5':
			if(cola.pulsarBoton()==true) {
				if(contador.saldo()>=precio) {
					System.out.printf("DEVOLUCION: %.2f",contador.darCambioDe(precio));
					System.out.println("€");
					cola.setBotes(botes-1);
				}else if (contador.saldo()==0){
					System.out.println("Inserte monedas.");
				}
				else System.out.println("Monedas insuficientes. Faltan: "+Math.abs(contador.darCambioDe(precio))+"€");
			}
			break;
		}
	}

}
