package practica6EDE;

public class ContadorDeMonedas {
	private float cantidad;
	private float disponible;
	
	public ContadorDeMonedas(float i) {
		this.disponible=i;
	}
	
	public float saldo() {
		float monedas=cantidad;
		return monedas;
	}
	
	public void insertarMoneda(float m) {
		this.cantidad+=m;
	}
	
	public float darCambioDe(float c) {
		float cambio=cantidad-c;
		if (cambio>=0){
			disponible+=cantidad;
			cantidad=0;
		}
		return cambio;
	}
	
	public float retornar() {
		float devolucion=cantidad;
		if (devolucion>0)
			cantidad=0;
		return devolucion;
	}

}
