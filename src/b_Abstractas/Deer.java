package b_Abstractas;

/**
 * Clase que implementa la especie de animal "Deer"
 */
class Deer extends Animal {
    @Override
	/**
	 * Método que come
	 */
    public void eat() {
        System.out.println("Deer grazes on grass and leaves.");
    }

    @Override
	/**
	 * Método que duerme
	 */
    public void sleep() {
        System.out.println("Deer sleeps in open fields.");
    }
}
