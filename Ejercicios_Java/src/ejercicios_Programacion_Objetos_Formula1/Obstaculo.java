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
	 * M�todo abstracto para que el obstaculo se pinte a s� mismo en la consola
	 */
	public abstract String paint();
	
	
	
	
	
	
}
