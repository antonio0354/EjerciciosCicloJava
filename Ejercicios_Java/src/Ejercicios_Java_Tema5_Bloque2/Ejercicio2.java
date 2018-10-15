package Ejercicios_Java_Tema5_Bloque2;

public class Ejercicio2 {

	public static void main(String[] args) {
	int numeros[]= new int[3];
	int orden[]= new int[3];
	int auxiliar;
	
	for(int j=0;j<numeros.length;j++) {
		numeros[j]=(int) Math.round(Math.random()*100);
		System.out.println(numeros[j]);
		for(int i=j+1;i<orden.length;i++) {
			if(orden[i]<numeros[j]) {
				auxiliar=numeros[j];
				numeros[j]=orden[i];
				orden[i]=auxiliar;
			}
			System.out.println(orden[i]);
		}
		
			
		
		
		
	}
	
	
	}

}
