package Ejercicios_Java_Tema5_Bloque1;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
	int numeros[]= new int[150];
	int valorBuscado;
	boolean esta=false;
	
	valorBuscado=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor a buscar: "));
	for(int i=0;i<numeros.length;i++) {
		numeros[i]=(int) Math.round(Math.random()*100);
		
		if(valorBuscado==numeros[i]) {
			System.out.println("Valor encontrado: "+numeros[i]+" cuyo indice es: "+i);
			esta=true;
		}else {
			if(i==149 && esta==false) {
				System.out.println(-1);
			}
		}
	}
	
	}

}
