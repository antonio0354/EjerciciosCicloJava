package Ejercicios_Java_Tema5_Bloque3;

public class Ejercicio1 {

	public static void main(String[] args) {
		int array[]=new int[150];
		int auxiliar;
		
		for(int i=0;i<array.length;i++) {
			array[i]=(int) Math.round(Math.random()*1000);
			System.out.print(array[i]+" ");
			
		}
		//Por seleccion
		System.out.println(" ");
		for(int i=0;i<array.length;i++) {
			for(int j = i;j<array.length;j++) {
				if(array[i]>array[j]) {
					auxiliar=array[i];
					array[i]=array[j];
					array[j]=auxiliar;
					
				}
				
			}
			System.out.print(array[i]+" ");
		}
		
		/*Por burbuja 
		 * for(int i = array.length-1; i > 0; i--){
	        for(int j = i; j <= array.length-1; j++) {
	            if(array[j-1] > array[j]){
	            // Intercambio de numeros
	            	int aux = array[j-1];
	            	array[j-1] = array[j];
	            	array[j] = aux;
	            }
	        }
	    }*/

	}

}
