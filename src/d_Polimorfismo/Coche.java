package d_Polimorfismo;

/**
 * Clase para implementar objetos Coche heredando de Vehiculo
 */
public class Coche extends Vehiculo {
    @Override
	/**
	 * Incrementa velocidad de coche
	 */
    public void speedUp() {
    	super.speed += 30;
    }
} 
