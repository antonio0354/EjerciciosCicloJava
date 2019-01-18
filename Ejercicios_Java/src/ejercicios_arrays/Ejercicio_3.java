package ejercicios_arrays;

public class Ejercicio_3 {

	public static void main(String[] args) {
		jajaxd();
		

	}
	
	
	
	
	private static void jajaxd () {
		
		int entero,contador=0;
		float decimal;
		float numeroFinal;
		
		float array[]=new float[20];
		
		for(int i=0;i<array.length;i++) {
			entero=(int) Math.round(Math.random()*100);
			decimal=(float) (Math.round(Math.random()*100)*0.01);
			numeroFinal=decimal + entero;
			array[i]=numeroFinal;
			
			if(decimal< 0.49 ) {
				contador++;
				
			}
			
			
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" | ");
			
		}
		System.out.println(" ");
		System.out.println("El numero de decimales entre 0.00 y 0.49 es: "+contador);
		
	}

}
