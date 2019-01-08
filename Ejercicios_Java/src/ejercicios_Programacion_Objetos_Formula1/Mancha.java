package ejercicios_Programacion_Objetos_Formula1;

public class Mancha extends Obstaculo {
	
	/**
	 * @param x
	 */
	public Mancha() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void inicializa() {
		int numAzar = (int) Math.round(Math.random()*40 -50);
		
	}
	
	

	/**
	 * Implementación del método abstracto que pinta la mancha
	 */
	@Override
	public String paint() {
		return "Mancha: " +this.x;
	}

}
