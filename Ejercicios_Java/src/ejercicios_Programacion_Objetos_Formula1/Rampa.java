package ejercicios_Programacion_Objetos_Formula1;

public class Rampa extends Obstaculo {
	
	

	

	/**
	 * @param x
	 */
	public Rampa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void inicializa() {
		int numAzar = (int) Math.round(Math.random()*50 + 50);
				
				
	}
	
	/**
	 * Implementación del método abstracto que pinta la rampa
	 */
	@Override
	public String paint() {
		return "Rampa: " + this.x;
	}

}
