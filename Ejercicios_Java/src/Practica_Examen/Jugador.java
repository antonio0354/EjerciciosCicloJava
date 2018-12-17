package Practica_Examen;

import java.util.Arrays;

public class Jugador {
	
	private String nombre;
	private Carta mano[]=new Carta[5];
	/**
	 * @param nombre
	 */
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
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
	 * @return the mano
	 */
	public Carta[] getMano() {
		return mano;
	}
	/**
	 * @param mano the mano to set
	 */
	public void setMano(Carta[] mano) {
		this.mano = mano;
	}
	
	public void comprobar() {
		for(int i=0;i<this.mano.length;i++) {
			if(mano[i]!=null) {
				Carta comprobarCarta=mano[i];
				int contador=0;
				for(int j=0;j<mano.length;j++) {
					if(mano[j]!=null) {
						if(comprobarCarta.getValor()==mano[j].getValor()) {
							contador++;
							mano[j]=null;
							
						}
						
					}
					
				}
				
				switch(contador) {
				case 2:
					System.out.println("Tengo pareja de "+comprobarCarta.getValor());
					break;
				case 3:
					System.out.println("Tengo trio de "+comprobarCarta.getValor());
					break;
				case 4:
					System.out.println("Tengo poker de "+comprobarCarta.getValor());
					break;
				default:
					break;
				
				}
				
			}
			
			
		}
		
		
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", mano=" + Arrays.toString(mano) + "]";
	}

}
