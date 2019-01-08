package ejercicios_Programacion_Objetos_Formula1;

public abstract class Vehiculo {

	protected int x; // Posición horizontal que ocupa el vehículo
	protected String nombre; // Nombre del conductor o conductora del vehículo
	protected String color; // Color del vehículo, codificado como 6 cifras hexadecimales
	protected boolean ganador = false; // boolean para indicar si el jugador ha terminado la carrera
	protected int podium; // variable para indicar el podium de cada jugador
	
	
	
	
	
	/**
	 * @param x
	 * @param nombre
	 * @param color
	 */
	public Vehiculo(String nombre, String color) {
		super();
		this.x = 0;
		this.nombre = nombre;
		this.color = color;
	}


	/**
	 * Método que permite el avance al azar del vehículo
	 */
	public void avanza () {
		int avance = (int) Math.round(Math.random() * (50-3) + 3);
		this.x += avance;
	}

	
	/**
	 * Método abstracto para que el vehículo se pinte a sí mismo en la consola
	 */
	public abstract String paint();
	
	
}
