package a_Herencia;

/**
 * Programa que resuelve este ejercicio:
 * Escriba un programa Java para crear una clase llamada Vehicle con un método llamado drive(). 
 * Cree una subclase llamada Coche que anule el método drive() para imprimir "Reparando un coche".
 * Basado en https://www.w3resource.com/java-exercises/java-inheritance-exercise-2.php
 * @version 1.0 (Octubre 2023)
 */
public class ClaseMain {

	/**
	 * Main es el método al que se llama por defecto
	 * Ejecutamos el ejemplo de Herencia.
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
	public static void main(String[] args) {

		Vehicle vehiculo = new Vehicle();
		Coche auto =new Coche();
		vehiculo.drive();
		auto.drive();
	}

}
