package Ejercicios_Java_Tema2;

import javax.swing.JOptionPane;

public class ejercicio6 {

	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("Introduzca un numero: ");
		int val1=Integer.parseInt(num1);
		
		System.out.println("El numero introducido es "+val1);
		
		if(val1%2==0) {
			System.out.println("El numero es par");
			
		}
		else {
			System.out.println("El numero es impar");
			
		}
		

	}

}
