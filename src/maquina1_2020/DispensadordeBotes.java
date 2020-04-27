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
public class DispensadordeBotes {
   
	private int botes; // Numero actual de botes.
	/* Inicializa el dispensador y pone i botes en él */
	/* Entrada: int i, numero de botes en el dispensador */
	/* Salidas: Ninguna */

	public void iniciarDispensador(int i) {
		this.botes = i;
	}

	/*
	 * Intenta dar un bote, devuelve true si es posible y falso si no hay botes
	 */
	/* Entrada: Ninguna */
	/* Salidas: bool, true si entrega el bote */
	public boolean PulsarBoton() {
		boolean ok = false;
		if (this.botes > 0) {
			this.botes--;
			ok = true;
		}
		return ok;
	}

	/* Muestra el numero de botes disponibles en el dispensador */
	/* Entrada: Ninguna */
	/* Salidas: int, el numero de  botes */
	public int BotesDisponibles() {
		return this.botes;
	}
}
    
    



