package ejercicios_Programacion_Objetos_Formula1;

public class Vehiculos {
	
	
	public void avanza(int num) {
		num=(int) Math.round(Math.random()*47+3);
		
		
	}
	
	

	/**
	 * @return the movimiento
	 */
	public int getMovimiento() {
		return num;
	}

	/**
	 * @param movimiento the movimiento to set
	 */
	public void setMovimiento(int movimiento) {
		this.movimiento = movimiento;
	}
}
