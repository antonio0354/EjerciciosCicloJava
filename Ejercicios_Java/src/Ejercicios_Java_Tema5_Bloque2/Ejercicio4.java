package Ejercicios_Java_Tema5_Bloque2;

public class Ejercicio4 {

	public static void main(String[] args) {
	int numeros[]= new int[5];
	int auxiliar=0;
	
	for(int i=0;i<numeros.length;i++) {
		numeros[i]=(int) Math.round(Math.random()*100);
		System.out.println("Posicion: "+i+"="+numeros[i]);
		
	}
	for(int i=0;i<numeros.length;i++) {
			numeros[i]=auxiliar;
			auxiliar=numeros[i+1];
			numeros[i+1]=numeros[i];
			
			System.out.println("Posicion: "+i+"="+numeros[i]);
		
		
	}
	
	
	}

}
