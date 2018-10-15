package Ejercicios_Java_Tema5;

import javax.swing.JOptionPane;

public class Ejercicio2pizarra {

	public static void main(String[] args) {
	int limiteinf,limitesup,diferencia,suma=0;
	
	limiteinf=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el limite inferior: "));
	limitesup=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el limite superior: "));
	diferencia=limitesup-limiteinf;
	int numeros[]=new int[100];
	
	for(int i=0;i<numeros.length;i++) {
		numeros[i]=(int) Math.round((Math.random()*diferencia+limiteinf));
		System.out.println(numeros[i]);
		suma=suma+numeros[i];
	}

	System.out.println("La suma es: "+suma);
	}

}
