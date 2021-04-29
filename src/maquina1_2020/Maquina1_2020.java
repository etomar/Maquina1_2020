/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina1_2020;

import java.io.*;
import java.util.*;
/**
 *
 * @author Emiliano
 */
public class Maquina1_2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner tec = new Scanner(System.in);
        MaquinaDeBebidas mi_maquina = new MaquinaDeBebidas();
        char c,d;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		//inicializo la maquina con:
		//  50 euros para cambio
		//  25 botes en cada dispensador
		//  Precio de 0.75 euros por bote
		mi_maquina.iniciarMaquinaDeBebidas(50F, 25, 0.75F);
	
		do 
		{
			mi_maquina.visualizarMaquina();
			System.out.println("\nRealice su seleccion (f = apagar maquina) ... ");
			System.out.println("   ('A'=5 cent, 'B'=10 cent, 'C'=20 cent, 'D'=50 cent, 'E'=1 euro,'R'=devolver monedas)");
			System.out.println("   ('1'=cola, '2'=limon, '3'=naranja, '4'=tonica, '5'=agua)");

			String cadena=br.readLine();
			c = cadena.charAt(0);
			//d = tec.next().charAt(1);
			//System.out.println(c);
			mi_maquina.darOrden ( c );
			System.out.println();
		}
		while ( ( c != 'f' ) && ( c != 'F' ) );
    }   
}
