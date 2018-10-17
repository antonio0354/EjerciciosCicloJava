package Ejercicios_Java_Tema5_Bloque2;

public class Ejercicio4 {

	public static void main(String[] args) {
	int numeros[]= new int[5];
	int auxiliar=0;
	
	for(int i=0;i<numeros.length;i++) {
		numeros[i]=(int) Math.round(Math.random()*100);
		System.out.println("Posicion: "+i+"="+numeros[i]);
		
	}
	auxiliar=numeros[numeros.length-1];
	for(int i=numeros.length-1;i>0;i--) {
		numeros[i]=numeros[i-1];
			
			
	
		
	}
	numeros[0]=auxiliar;
	System.out.println("\nCambiados: ");
	for(int i=0;i<numeros.length;i++) {
		System.out.println("\nPosicion: "+i+"="+numeros[i]);
	}
	}

}
