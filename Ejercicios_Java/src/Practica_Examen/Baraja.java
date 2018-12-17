package Practica_Examen;

public class Baraja {
	
	Carta baraja[]=new Carta[52];
	
	public void crearBaraja() {
		int j=0;
		for(int i=0;i<13;i++) {
			baraja[j]=new Carta(i+1,"Picas",j+1);
			j++;
			
		}
		for(int i=0;i<13;i++) {
			baraja[j]=new Carta(i+1,"Diamantes",j+1);
			j++;
			
		}
		for(int i=0;i<13;i++) {
			baraja[j]=new Carta(i+1,"Treboles",j+1);
			j++;
			
		}
		for(int i=0;i<13;i++) {
			baraja[j]=new Carta(i+1,"Corazones",j+1);
			j++;
			
		}
		
		
	}
	
	public void abajohaciaArriba() {
		Carta aux = baraja[baraja.length-1];
		for (int i = (baraja.length - 1); i > 0; i--) {
			baraja[i] = baraja[i-1];
		}
		baraja[0] = aux;
		
		
	}
	
	public void arribahaciaAbajo() {
		Carta aux = baraja[0];
		for (int i = 1; i < (baraja.length); i++) {
			baraja[i-1] = baraja[i];
		}
		baraja[baraja.length-1] = aux;
		
		
	}
	
	public void ordenar() {
		for (int i = baraja.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (baraja[j].getId() > baraja[j+1].getId()) {
					Carta aux = baraja[j];
					baraja[j] = baraja[j+1];
					baraja [j+1] = aux;
				}
			}
		}
		
	}
	
	public void mezclar() {
		for(int i=0;i<100;i++) {
			int num1=(int) Math.round(Math.random()*(baraja.length-1));
			int num2=(int) Math.round(Math.random()*(baraja.length-1));
				
			Carta aux =baraja[num1];
			baraja[num1]=baraja[num2];
			baraja[num2]=aux;
		}
		
		
	}
	
	public void darMano(Jugador jugador) {
		Carta mano[]=new Carta[5];
		
		for(int i=0;i<mano.length;i++) {
			int azar;
			do {
				azar=(int) Math.round(Math.random()*(baraja.length-1));
				
			}while(baraja[azar]==null);
			mano[i]=baraja[azar];
			baraja[azar]=null;
			
		}
		
		jugador.setMano(mano);
		
	}
	
	public void imprimir() {
		System.out.println("Baraja");
		for(int i=0;i<baraja.length;i++) {
			System.out.println(baraja[i]);
			
		}
		
		
	}

}
