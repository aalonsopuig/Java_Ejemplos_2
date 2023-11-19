package c_Interfaces;

/**
 * Programa que resuelve este ejercicio:
 * Escriba un programa Java para crear una interfaz “Jugable” con un método “play()” 
 * que no acepte argumentos y devuelva void. Cree tres clases “Futbol”, ​​”Voleibol” y “Baloncesto” 
 * que implementen la interfaz “Jugable” y anulen el método “play()” para jugar los deportes respectivos.
 * Basado en https://www.w3resource.com/java-exercises/java-interface-exercise-8.php
 * @version 1.0 (Octubre 2023)
 */
public class Main {
	
	/**
	 * Main es el método al que se llama por defecto
	 * Ejecutamos ejemplo de Interfaces.
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
	  public static void main(String[] args) {
	    Jugable futbol = new Futbol();
	    Jugable voleibol = new Voleibol();
	    Jugable baloncesto = new Baloncesto();
	
	    futbol.play();
	    voleibol.play();
	    baloncesto.play();
	  }
}
