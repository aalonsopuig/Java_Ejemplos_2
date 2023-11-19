package g_Metodo_generico_matrices;
import java.util.Arrays;


/**
 * Programa que resuelve este ejercicio:
 * Escriba un programa Java para crear un método genérico que tome dos matrices del mismo tipo y 
 * verifique si tienen los mismos elementos en el mismo orden.
 *  
 * Basado en https://www.w3resource.com/java-exercises/generic/java-generic-exercise-1.php
 * @version 1.0 (Octubre 2023)
 */
public class Main {

	/**
	 * Compara dos arrays
	 * @param <T> arrays de cualquier topo
	 * @param array1 uno de los arrays a comparar
	 * @param array2 otro de los arrays a comparar
	 * @return Devuelve true o false dependiendo de si son o no iguales
	 */
	public static < T > boolean comparaArrays(T[] array1, T[] array2) {
	  	int items = array1.length;
	    if (array1.length != array2.length) {
	      return false;
	    }

	    for (int i = 0; i < items; i++) {
	      if (!array1[i].equals(array2[i])) {
	        return false;
	      }
	    }
	    return true;
	  }

	/**
	 * Main es el método al que se llama por defecto
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
	public static void main(String[] args) {
		
		//Arrays de ejemplo para verificar funcionamiento del programa
	    Integer[] array1 = {1, 2, 3, 4};
	    Integer[] array2 = {1, 3, 3, 4};
	    String[]  array3 = {"Javier", "Marta"};
	    String[]  array4 = {"Javier", "Marta"};
	    
	    //Mostramos valores iniciales de arrays
	    System.out.println("Arrays iniciales:");
	    System.out.println("array1: " + Arrays.toString(array1));
	    System.out.println("array2: " + Arrays.toString(array2));
	    System.out.println("array3: " + Arrays.toString(array3));
	    System.out.println("array4: " + Arrays.toString(array4));
	    
	    //Comparamos arrays
	    System.out.println("\nCompara array1 y array2: " + comparaArrays(array1, array2)); //false
	    System.out.println("Compare array3 and array4: " + comparaArrays(array3, array4)); //true
	  }
}
