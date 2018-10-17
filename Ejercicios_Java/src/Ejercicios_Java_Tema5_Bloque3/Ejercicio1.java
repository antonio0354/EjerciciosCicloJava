package Ejercicios_Java_Tema5_Bloque3;

public class Ejercicio1 {

	public static void main(String[] args) {
		int array[]=new int[150];
		int auxiliar;
		
		for(int i=0;i<array.length;i++) {
			array[i]=(int) Math.round(Math.random()*1000);
			System.out.println("Sin ordenar: "+array[i]);
			
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j = i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					auxiliar=array[i];
					array[i]=array[j];
					array[j]=auxiliar;
					
				}
				
			}
			System.out.println("Ordenado: "+array[i]);
		}

	}

}
