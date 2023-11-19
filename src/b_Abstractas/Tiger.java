package b_Abstractas;

/**
 * Clase que implementa la especie de animal "Tiger"
 */
class Tiger extends Animal {
    @Override
	/**
	 * Método que come
	 */
    public void eat() {
        System.out.println("Tiger eats meat and occasionally hunts in water.");
    }

    @Override
	/**
	 * Método que duerme
	 */
    public void sleep() {
        System.out.println("Tiger sleeps in a hidden spot.");
    }
}
