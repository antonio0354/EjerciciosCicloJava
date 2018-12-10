package ejercicios_Programacion_Objetos_Formula1;

public class Principal {
	
	public static void main(String[] args) {
		
		Vehiculos vehiculos[]= new Vehiculos[5];
		
		for(int i=0;i<vehiculos.length;i++) {
			int numAleatorio = (int) Math.round(Math.random());
			if(numAleatorio == 0) {
				vehiculos[i]= new Coche();
				
			}else {
				
				vehiculos[i]=new Moto();
			}
			
		}
		
		
		
		
		
	}
	
	
}
