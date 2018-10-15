package Ejercicios_Java_Tema5_Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
	int numeros[]= new int[150];
	int sumaimpar=0;
	
	for(int i=0;i<numeros.length;i++) {
		numeros[i]=(int) Math.round(Math.random()*100);
		if(i%2!=0) {
			
			sumaimpar+=numeros[i];
		}
		System.out.println(numeros[i]);
		
	}
	System.out.println("La suma es: "+sumaimpar);
	}

}
