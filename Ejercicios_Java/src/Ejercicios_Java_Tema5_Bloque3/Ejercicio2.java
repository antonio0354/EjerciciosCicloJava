package Ejercicios_Java_Tema5_Bloque3;

public class Ejercicio2 {

	public static void main(String[] args) {
		int array[]=new int[150];
		int auxiliar;
		
		for(int i=0;i<array.length;i++) {
			array[i]=(int) Math.round(Math.random()*1000);
			System.out.print(array[i]+" ");
			
		}
		
		for(int i=1;i<array.length;i++) {
			if(array[i]<array[i-1]) {
				for(int j=0;j<i;j++) {
					if(array [i]<array[j]) {
						auxiliar=array[j];
						array[j]=array[i];
						array[i]=auxiliar;
						
					}
					
					
					
				}
			}
			
			
			
		}
		
		System.out.println("\n");
		for(int i=0;i<array.length;i++) {
			
			System.out.print(array[i]+" ");
			
		}
		

	}
}


