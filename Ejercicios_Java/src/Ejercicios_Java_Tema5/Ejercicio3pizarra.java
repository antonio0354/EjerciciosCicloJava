package Ejercicios_Java_Tema5;

import javax.swing.JOptionPane;

public class Ejercicio3pizarra {

	public static void main(String[] args) {
	int limiteinf,limitesup,diferencia,suma=0,media;
	
	limiteinf=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el limite inferior: "));
	limitesup=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el limite superior: "));
	diferencia=limitesup-limiteinf;
	int numeros[]=new int[100];
	
	for(int i=0;i<numeros.length;i++) {
		numeros[i]=(int) Math.round((Math.random()*diferencia+limiteinf));
		System.out.println(numeros[i]);
		suma=suma+numeros[i];
	}

	media=suma/numeros.length;
	System.out.println("La media es: "+media);
	}

}
