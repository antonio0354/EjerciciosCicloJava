package Ejercicios_Java_Tema5_Bloque3;

public class Ejercicio3 {

	public static void main(String[] args) {
		int array[]=new int[150];
		int auxiliar;
		
		for(int i=0;i<array.length;i++) {
			array[i]=(int) Math.round(Math.random()*1000);
			System.out.print(array[i]+" ");
			
		}
		
		
		
		System.out.println("\n");
		for(int i=0;i<array.length;i++) {
			
			System.out.print(array[i]+" ");
			
		}
		

	}
}


