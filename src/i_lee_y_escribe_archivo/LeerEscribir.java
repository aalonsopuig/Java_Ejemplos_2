package i_lee_y_escribe_archivo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
 
/**
 * Programa que resuelve este ejercicio:
 * Escriba un programa Java para leer un archivo de texto y escribir su contenido en otro archivo de texto.
 *  
 * Basado en https://www.w3resource.com/java-exercises/io/java-io-exercise-15.php
 * @version 1.0 (Octubre 2023)
 */
public class LeerEscribir {

	/**
	 * Main es el método al que se llama por defecto Leemos caracter a caracter en
	 * el fichero origen y lo vamos escribiendo en el fichero destino.
	 * 
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
	public static void main(String[] args) {

		// Utilizamos buffers para optimizar las lecturas y escrituras
		BufferedReader ficheroIn = null;
		BufferedWriter ficheroOut = null;

		// Estructura try..catch para leer/escribir y actuar en caso de error en la
		// operación de lectura
		try {
			ficheroIn = new BufferedReader(new FileReader("src//h_Lee_archivo//fichero.txt"));
			ficheroOut = new BufferedWriter(new FileWriter("src//i_lee_y_escribe_archivo//copia.txt"));
			int caracter = ficheroIn.read();
			while (caracter != -1) {
				ficheroOut.write(caracter);
				caracter = ficheroIn.read();
			}
			ficheroIn.close();
			ficheroOut.close();
			System.out.println("Fin de la copia");

		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
		} catch (IOException e) {
			System.err.println("No se puede leer el fichero");
		}
	}

}
