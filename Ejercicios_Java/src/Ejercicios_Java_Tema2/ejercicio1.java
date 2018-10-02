package Ejercicios_Java_Tema2;

import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("Introduzca un numero: ");
		int val1=Integer.parseInt(num1);
		
		num1=JOptionPane.showInputDialog("Introduzca el segundo numero: ");
		int val2=Integer.parseInt(num1);
		
		
		
		System.out.println("Los numeros son: " + val1 + " y " + val2);
		
		if(val1>val2) {
			System.out.println("El mayor es " + val1);
			
			
		}
		else {
			System.out.println("El mayor es " + val2);
		}

	}

}
