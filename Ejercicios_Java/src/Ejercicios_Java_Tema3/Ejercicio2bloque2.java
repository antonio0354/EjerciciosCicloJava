package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio2bloque2 {

	public static void main(String[] args) {
		
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca las veces que quieres que se pida un numero: "));
		
	
		if(num2>0) {
			int mayor=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero 1: "));
			int menor=mayor;
			for(int i=0;i<num2-1;i++) {
				int	num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero "+ (i+2) + ":"));
			
				if(num1>mayor) {
					mayor=num1;
					
				}else {
					if(num1<menor) {
					menor=num1;
				}
			
				}
			}
		JOptionPane.showMessageDialog(null, "el menor numero es "+ menor);
		JOptionPane.showMessageDialog(null, "el mayor numero es "+ mayor);
	}
	
	
	
	}
		
}
	
	
	
	
	
	


