package Ejercicios_Java_Tema2;

import javax.swing.JOptionPane;

public class ejercicio6_ampliacion {

	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("Introduzca un numero: ");
		int val1=Integer.parseInt(num1);
		
		System.out.println("El numero introducido es "+val1);
		
		if((val1 & 1) == 1) {
			System.out.println("El numero es impar");
			
		}
		else {
			
			System.out.println("el numero es par");
		}
	}

}
