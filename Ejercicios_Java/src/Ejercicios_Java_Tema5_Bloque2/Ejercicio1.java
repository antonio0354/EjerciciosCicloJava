package Ejercicios_Java_Tema5_Bloque2;

public class Ejercicio1 {

	public static void main(String[] args) {
	int numeros[]= new int[150];
	
	for(int i=0;i<numeros.length;i++) {
		numeros[i]=(int) Math.round(Math.random()*100);
		
		
		if(numeros[i]%2==0) {
			numeros[i]=numeros[i]-(2*numeros[i]);
			System.out.println(numeros[i]);
		}else {
			System.out.println(numeros[i]);
		}
		
	}
	
	
	}

}
