package b_Abstractas;

/**
 * Clase que implementa la especie de animal "Lion"
 */
class Lion extends Animal {
    @Override
	/**
	 * Método que come
	 */
    public void eat() {
        System.out.println("Lion eats meat.");
    }

    @Override
	/**
	 * Método que duerme
	 */
    public void sleep() {
        System.out.println("Lion sleeps on grassland.");
    }
}
