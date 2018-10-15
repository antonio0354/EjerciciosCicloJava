package Ejercicios_Java_Tema5_Bloque1;

public class Ejercicio1 {

	public static void main(String[] args) {
	int numeros[]= new int[150];
	
	for(int i=0;i<numeros.length;i++) {
		numeros[i]=(int) Math.round(Math.random()*100);
		System.out.println(numeros[i]);
	}
	
	for(int i=numeros.length-1;i>=0;i--) {
		System.out.println("Inverso: "+numeros[i]);
		
		
	}
	}

}
