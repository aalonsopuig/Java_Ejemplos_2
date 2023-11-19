package d_Polimorfismo;

/**
 * Programa que resuelve este ejercicio:
 * Escriba un programa Java para crear una clase Vehículo con un método llamado speedUp(). 
 * Crea dos subclases Coche y Bicicleta. 
 * Anule el método speedUp() en cada subclase para aumentar la velocidad del vehículo de manera diferente.
 *  
 * @author Alejandro Alonso
 * @version 1.0 (Octubre 2023)
 */
public class MainClass {

	/**
	 * Main es el m�todo al que se llama por defecto
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
	public static void main(String[] args) {
	     Coche coche = new Coche();
	     Bicicleta bici = new Bicicleta();
	     System.out.println("Velocidad inicial coche: " + coche.getSpeed());
	     System.out.println("Velocidad inicial bici: " + bici.getSpeed());
	     coche.speedUp();
	     bici.speedUp();
	     System.out.println("\nVelocidad del coche tras acelerar: " + coche.getSpeed());
	     System.out.println("Velocidad de la bici tras acelerar: " + bici.getSpeed());
	 }
}

