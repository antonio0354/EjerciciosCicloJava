package Practica_Examen;

public class Poker {
	
	private Jugador jugadores[]=new Jugador[5];
	private Baraja baraja=new Baraja();
	
	public void reparto(Baraja baraja) {
		this.baraja=baraja;
		
		jugadores[0]=new Jugador("Antonio");
		jugadores[1]=new Jugador("Pedro");
		jugadores[2]=new Jugador("Juan");
		jugadores[3]=new Jugador("Luis");
		jugadores[4]=new Jugador("Javier");
		
		
		
		for(int i=0;i<jugadores.length;i++) {
			baraja.darMano(jugadores[i]);
			
		System.out.println("Jugador: "+jugadores[i].getNombre());
		for(int j=0;j<jugadores[i].getMano().length;j++) {
			System.out.println(jugadores[i].getMano()[j].toString());
			
		}
		jugadores[i].comprobar();
		}
		
		
		
	}
	

}
