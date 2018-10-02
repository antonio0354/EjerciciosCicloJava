package Ejercicios_java_Tema1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("Introduzca un valor de tipo entero: ");
		int val1=Integer.parseInt(num1);
		
		num1=JOptionPane.showInputDialog("Introduzca un valor de tipo flotante: ");
		float val2 =Float.parseFloat(num1);
		
		num1=JOptionPane.showInputDialog("Introduzca un valor de tipo double: ");
		double val3=Double.parseDouble(num1);
		
		System.out.println("Los numeros introducidos son: " + val1 + ", " + val2 + " y "+ val3);
		
		
	}

}
