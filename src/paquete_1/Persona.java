package paquete_1;

import java.util.Scanner;

/**
 * Esta clase representa a una persona y permite calcular los años que faltan hasta su jubilación.
 * La edad de jubilación se asume como 67 años para el propósito de este cálculo.
 */
public class Persona {
	int edad;	
	
		/**
	     * Constructor de la clase persona. Vacío porque le pediremos al usuario que ingrese
	     * la edad por consola.
	     */	
		public Persona () {
			this.edad = edad;
		}
		
		/**
		 * Método que muestra la diferencia en años que le quedan a la persona para jubilarse,
		 * es decir, para cumplir los 67 años. Si tiene más de 57, imprimirá un mensaje motivador, 
		 * y si tiene menos de 57, imprimirá otro con un tono más irónico.
		 */
		public void CalcularAniosHastaJubilacion() {
			
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
		
} //Fin de la clase persona
