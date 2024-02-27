package paquete_1;

import java.util.Scanner;

public class Persona {
	int edad;
		
		public Persona () {
			this.edad = edad;
		}
		
		public void CalcularAñosHastaJubilación() {
			System.out.println("Introduzca su edad:");
			Scanner entrada = new Scanner(System.in);
			this.edad = entrada.nextInt();
			if (edad > 57) {
				int aniosRestantes = 67 - edad;
				System.out.println("Sólo te quedan " + aniosRestantes + " años. ¡Vamos que ya queda poco!");
			}
			else {
				int aniosRestantes = 67 - edad;
				System.out.println("Te quedan " + aniosRestantes + " años. ¡A seguir trabajando gandul!");
			}			
		}
	
	
	
	
	
}
