package Ejercicios_java_Tema1;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("Introduzca el primer valor: ");
		int val1=Integer.parseInt(num1);
		
		
		num1=JOptionPane.showInputDialog("Introduzca el segundo valor: ");
		int val2=Integer.parseInt(num1);
		
		System.out.println("El primer valor es: " + val1);
		System.out.println("El segundo valor es: " + val2);
		
		int cambio = 0;
		
		cambio=val1;
		val1=val2;
		val2=cambio;
	
	
		System.out.println("El primer valor ahora es: "+ val1 +
				"\nEl segundo valor ahora es: "+ val2);
		

	}

}
