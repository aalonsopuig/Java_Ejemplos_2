package e_Excepciones_comunes;

/**
 * Programa que resuelve este ejercicio:
 * [Excepciones comunes] Escriba un programa Java para crear un método que tome un número entero 
 * como parámetro y genere una excepción si el número es impar.
 * Basado en: https://www.w3resource.com/java-exercises/exception/java-exception-exercise-2.php 
 * @version 1.0 (Octubre 2023)
 */
public class MainClass {

	/**
	 * Método Main
	 * @param args argumentos no utilizados en este caso
	 **/
	public static void main(String[] args) {
		int n = 13;         //valor que evaluaremos si es par o impar
		pruebaNumero(n);
		n = 7;
		pruebaNumero(n);
	}

	/**
	 * Aqui hace una prueba
	 * @param n valor que evaluareos si es par o impar
	 **/
	public static void pruebaNumero(int n) {
		try {
			verificaPar(n);
			System.out.println(n + " es par.");
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void verificaPar(int number) throws IllegalArgumentException {
		if (number % 2 != 0) {
			throw new IllegalArgumentException(number + " es impar.");
		}
	}
}
