package d_Polimorfismo;

/**
 * Clase para implementar objetos Bicicleta heredando de Vehiculo
 */
public class Bicicleta extends Vehiculo {
	 @Override
	 /**
	  * Incrementa velocidad de bicicleta
	  */
	 public void speedUp() {
		 super.speed += 5;
	 }
}
