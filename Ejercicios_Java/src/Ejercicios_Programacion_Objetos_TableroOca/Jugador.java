package Ejercicios_Programacion_Objetos_TableroOca;


public class Jugador {  
	private String nombre;
	private int posicion = 0;

	/**
	 * import tutorialJava.capitulo4_OO.ejercicios.ejercicioExtra02_La_Oca.version06.Casilla;
import tutorialJava.capitulo4_OO.ejercicios.ejercicioExtra02_La_Oca.version06.Tablero;

	 */
	public Jugador() {
		super();
	}
	
	/**
	 * @param nombre
	 * @param posicion
	 */
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	/**
	 * 
	 */
	public void tirarDado () {
		int dado = (int) Math.round(Math.random()*(6-1)+1);
		this.posicion += dado;
		
		if( Tablero.getTablero().getCasillas()[this.posicion].getDestino() !=null) {
			this.posicion=Tablero.getTablero().getCasillas()
			
		}
		
		if (this.posicion > Tablero.getTablero().getCasillas().length) {
			this.posicion = Tablero.getTablero().getCasillas().length - 
					(this.posicion - Tablero.getTablero().getCasillas().length);
		}
		
	}
	
	
	public void imprimir() {
		System.out.println(this.nombre + " - pos: " + this.posicion);
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}
	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	
}

