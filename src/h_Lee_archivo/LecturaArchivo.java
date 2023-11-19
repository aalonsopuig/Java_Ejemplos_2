package h_Lee_archivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Programa que resuelve este ejercicio:
 * Escriba un programa Java para leer el contenido del archivo línea por línea y lo muestre en pantalla.
 *  
 * Basado en https://www.w3resource.com/java-exercises/io/java-io-exercise-11.php
 * @version 1.0 (Octubre 2023)
 */
public class LecturaArchivo {
 
	/**
	 * Main es el método al que se llama por defecto
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
   public static void main(String[] args){
	   
	    //Utilizamos un buffer para optimizar las lecturas
        BufferedReader buffer = null;
        String linea = "";
        
        //Estructura try..catch para leer y actuar en caso de error en la operación de lectura
        try {
        	buffer = new BufferedReader( new FileReader("src//h_Lee_archivo//fichero.txt"));
            while( (linea = buffer.readLine()) != null){
                System.out.println(linea);
            }
            buffer.close();
        } catch (FileNotFoundException e) {
            System.err.println("Fichero no encontrado");
        } catch (IOException e) {
            System.err.println("No se puede leer el fichero");
        }
     }
}

