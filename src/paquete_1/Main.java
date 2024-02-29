package paquete_1;

/**
 * Esta es la clase principal del programa. A partir de aquí se empezará a ejecutar.
 * @see <a href = "https://github.com/isarubio95/Isaias-Rubio-ED.git">Repositorio de GitHub</a>
 * @since 1.0 - 27/02/2024
 * @author isaias
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
		 * Método que imprime un mensaje dependiendo de la edad de la persona
		 * @see persona.CalcularAniosHastaJubilacion();
		 */
		persona.CalcularAniosHastaJubilacion();
		
		System.exit(0); //Cierre del programa
		
	}
	
} //Fin del método main
