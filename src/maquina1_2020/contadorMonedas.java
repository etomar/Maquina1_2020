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
		
		public float darCambioDe (float c) {

            float cambio = 0;

            if (this.cantidad < c) {
                cambio = -1;
            } else {
                cambio = this.cantidad - c;
                    this.disponible += c;
            }

        return cambio;
        }
		
		public float Retornar (){
			return cantidad;
		}
	}