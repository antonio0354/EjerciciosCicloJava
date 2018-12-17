package examen_programacion_objetos;

public class Baraja {

	public static void setBaraja(Baraja baraja) {
		Baraja.baraja= baraja;
	}
	
	private static Baraja baraja=null;

	public static Baraja getBaraja() {
		if(baraja==null) {
			baraja=new Baraja();
		}
		return baraja;
	}
	
	
	public void crearBaraja() {
		
		Carta baraja[]=new Carta[52];
		
		for(int i=0;i<baraja.length;i++) {
			baraja[i]=crearCarta();

			
		
			
		}
		
		Carta.getCarta().valorcarta();
		
		
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Baraja [crearCarta()=" + crearCarta() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	/*
	 * 
	 * 
	 */
	public Carta crearCarta() {
		Carta carta=new Carta();
		return carta;
		
	}

	public Baraja() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}