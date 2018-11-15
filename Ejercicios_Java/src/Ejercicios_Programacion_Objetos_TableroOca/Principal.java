package Ejercicios_Programacion_Objetos_TableroOca;


public class Principal {  

	/**
	 * 
	 */
	public static void main (String args[]) {
		
		Tablero.getTablero().imprimeTablero();		
		
		// Prueba de uso del primer jugador
		Jugador jugador = new Jugador("Rojo");
		do {
			jugador.tirarDado();
			jugador.imprimir();
		} while(jugador.getPosicion() < 62);
	}
	
	
}