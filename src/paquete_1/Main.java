package paquete_1;

/**
 * Esta es la clase principal del programa. A partir de aquí, se empezará a ejecutar.
 * @author Isaías Rubio Hernández
 * @see <a href = "https://github.com/isarubio95/Isaias-Rubio-ED.git">Link al repositorio GitHub</a>
 * @since 1.0 - 27/02/2024
 * @version 1.2 - 28/02/2024
 */
public class Main {
	
	/** 
	 * Este es el método principal
	 * @param args Argumentos de consola del método main
	 */
	public static void main(String[] args) {
		
		//Instanciación de la clase persona. El valor de la edad está vacío porque lo introducirá el usuario					 							 	
		Persona persona = new Persona(); 
		
		/**
		 * Método que imprime un mensaje dependiendo la edad que tenga el usuario
		 * @see persona.CalcularAniosHastaJubilacion();
		 */
		persona.CalcularAniosHastaJubilacion();
		
		System.exit(0); //Cierre del programa
		
	}
	
} //Fin de la clase Main
