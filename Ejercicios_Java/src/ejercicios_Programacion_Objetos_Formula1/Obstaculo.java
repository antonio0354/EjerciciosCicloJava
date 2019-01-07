package ejercicios_Programacion_Objetos_Formula1;

public abstract class Obstaculo {

	protected int x;

	/**
	 * @param x
	 */
	public Obstaculo() {
		super();
		this.x = 0;
	} 
	
	
	/**
	 * Método abstracto para que el obstaculo se pinte a sí mismo en la consola
	 */
	public abstract String paint();
	
	
	
	
	
	
}
