package PracticaEDE;

	public class contadorMonedas {
		private float cantidad=0; 
		private float disponible=50; 
		
		public void IniciarContadorDeMonedas (float x){
			disponible = x;
		}
		
		public float Saldo (){
			return cantidad;
		}
		
		public void InsertarMoneda (float m){
			cantidad+=m;
		}
		
		public float DarCambioDe (float c){
			float calculo=0;
			calculo=cantidad-c;
			disponible+=c;
			disponible-=0.75;
			return calculo;
		}
		
		public float Retornar (){
			return cantidad;
		}
	}