package Ejercicios_Java_Tema2;

import javax.swing.JOptionPane;

public class ejercicio3Optimizado {

	public static void main(String[] args) {
		
		int mayor=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		
		num1=JOptionPane.showInputDialog("Introduzca el segundo numero: ");
		int val=Integer.parseInt(num1);
		
		if(val>mayor) {
			mayor=val;
			
		}
		
		mayor=(val>mayor)? val:mayor;
		
		num1=JOptionPane.showInputDialog("Introduzca el segundo numero: ");
		val=Integer.parseInt(num1);
		
		if(val>mayor) {
			mayor=val;
			
		}
		num1=JOptionPane.showInputDialog("Introduzca el segundo numero: ");
		val=Integer.parseInt(num1);
		
		if(val>mayor) {
			mayor=val;
			
		}
		num1=JOptionPane.showInputDialog("Introduzca el segundo numero: ");
		val=Integer.parseInt(num1);
		
		if(val>mayor) {
			mayor=val;
			
		}
		System.out.println(mayor);
		

	}

}
