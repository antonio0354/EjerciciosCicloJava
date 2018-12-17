package Practica_Examen;

public class Main {

	public static void main(String[] args) {
		Baraja baraja=new Baraja();
		
		baraja.crearBaraja();
		baraja.imprimir();
		
		//baraja.mezclar();
		//baraja.imprimir();
		//baraja.ordenar();
		//baraja.arribahaciaAbajo();
		//baraja.abajohaciaArriba();
		baraja.imprimir();
		
		Poker poker=new Poker();
		poker.reparto(baraja);
		

	}

}
