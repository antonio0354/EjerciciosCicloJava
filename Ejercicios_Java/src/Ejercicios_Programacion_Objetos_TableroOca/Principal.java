package Ejercicios_Programacion_Objetos_TableroOca;

public class Principal {

	public static void main(String[] args) {
		
		//Inicializacion e impresión del tablero
		Tablero tablero=new Tablero();
		
		tablero.imprimirTablero();
		
		
		//Prueba de uso del primer jugador
		Jugador jugador=new Jugador("Rojo",tablero);
		do {
			jugador.tirarDado();
			jugador.imprimir();
			
		}while(jugador.getPosicion()<62);

		
	}
	
}
