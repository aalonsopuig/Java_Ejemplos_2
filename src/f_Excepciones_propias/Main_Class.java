package f_Excepciones_propias;

/**
 * Programa que resuelve este ejercicio:
 * [Excepciones propias] Escriba un programa Java para crear un método que tome una cadena como 
 * entrada y genere una excepción si la cadena no contiene vocales.
 * Basado en: https://www.w3resource.com/java-exercises/exception/java-exception-exercise-7.php 
 * @version 1.0 (Octubre 2023)
 */
public class Main_Class {
  public static void main(String[] args) {
    try {
      //String texto = "Java gestionando excepciones ";
      String texto = "Typy gyps fly.";
      System.out.println("Cadena original: " + texto);
      chequeaVocales(texto);
      System.out.println("La cadena contiene vocales.");
    } catch (SinVocalesException e) {
      System.out.println("Excepción: " + e.getMessage());
    }
  }

  public static void chequeaVocales(String texto) throws SinVocalesException {
    boolean contieneVocales = false;
    String vocales = "aeiouAEIOU";

    for (int i = 0; i < texto.length(); i++) {
      char ch = texto.charAt(i);
      if (vocales.contains(String.valueOf(ch))) {
        contieneVocales = true;
        break;
      }
    }
    if (!contieneVocales) {
      throw new SinVocalesException("La cadena no contiene vocales.");
    }
  }
}
class SinVocalesException extends Exception {
  public SinVocalesException(String message) {
    super(message);
  }
}