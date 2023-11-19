package b_Abstractas;

/**
 * Programa que resuelve este ejercicio:
 * Escriba un programa Java para crear una clase abstracta Animal con métodos abstractos eat() y sleep(). 
 * Cree subclases Lion, Tiger y Deer que amplíen la clase Animal e implementen los métodos eat() y sleep() 
 * de manera diferente en función de su comportamiento específico.
 * Basado en https://www.w3resource.com/java-exercises/java-abstract-class-exercise-4.php
 * @version 1.0 (Octubre 2023)
 */
public class Main {
	
	/**
	 * Main es el método al que se llama por defecto
	 * Ejecutamos ejemplo de clases abstractas.
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.sleep();

        System.out.println();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();

        System.out.println();

        Deer deer = new Deer();
        deer.eat();
        deer.sleep();
    }
}
