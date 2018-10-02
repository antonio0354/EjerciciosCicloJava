package Ejercicios_java_Tema1;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("Introduzca un valor de tipo entero: ");
		int val1=Integer.parseInt(num1);
		System.out.println("El valor entero es: " + val1);
		
		num1=JOptionPane.showInputDialog("Introduzca un valor de tipo flotante: ");
		float val2 =Float.parseFloat(num1);
		System.out.println("El valor flotante es: " + val2);
		
		num1=JOptionPane.showInputDialog("Introduzca un valor de tipo double: ");
		double val3=Double.parseDouble(num1);
		System.out.println("El valor double es: " + val3);
		
		
		

	}

}
