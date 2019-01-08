package ejercicios_Programacion_Objetos_Formula1;

public class Pista {

	private Obstaculo obstaculos[] = new Obstaculo[4];
	private int longitud = 500;
	
	
	
	
	/**
	 * @param obstaculos
	 * @param longitud
	 */
	public Pista(int longitud) {
		super();
		this.longitud = longitud;
		
		for(int i=0;i<obstaculos.length;i++) {
			int numAzar=(int) Math.round(Math.random());
			if(numAzar==0) {
				obstaculos[i] = new Rampa();
				
			}else {
				obstaculos[i] = new Mancha();
			}
			
		}
		
		
		for(int i=0;i<obstaculos.length;i++) {
			int num=(int) Math.round(Math.random()*500);
			obstaculos[i].x=num;
			
			
		}
		
		
	}

	
	/**
	 * @param obstaculos
	 */
	public Pista() {
		super();
		
	}
		
		
		
		
}
