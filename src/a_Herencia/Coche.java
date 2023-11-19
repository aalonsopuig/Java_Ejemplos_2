package a_Herencia;

/**
 * Clase Coche que hereda de Vehicle
 */
public class Coche extends Vehicle{

	@Override
	/**
	 * Método que conduce
	 */
	public void drive() {
		System.out.println("Reparando el coche");
	}
}
