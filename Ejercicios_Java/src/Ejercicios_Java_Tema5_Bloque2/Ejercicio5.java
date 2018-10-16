package Ejercicios_Java_Tema5_Bloque2;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
	int numeros[]= new int[5];
	int auxiliar=0;
	int posiciones;
	
	posiciones=Integer.parseInt(JOptionPane.showInputDialog("Introduzca las posiciones que quieres que se desplacen: "));
	
	for(int i=0;i<numeros.length;i++) {
		numeros[i]=(int) Math.round(Math.random()*100);
		System.out.println("Posicion: "+i+"="+numeros[i]);
		
	}
	auxiliar=numeros[numeros.length-posiciones];
	for(int i=numeros.length-1;i>0;i--) {
		numeros[i]=numeros[i-posiciones];
			
			
	
		
	}
	numeros[0]=auxiliar;
	
	for(int i=0;i<numeros.length;i++) {
		System.out.println("Posicion: "+i+"="+numeros[i]);
	}
	}

}
