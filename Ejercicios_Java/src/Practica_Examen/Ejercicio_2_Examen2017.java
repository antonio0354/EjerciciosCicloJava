package Practica_Examen;

import javax.swing.JOptionPane;

public class Ejercicio_2_Examen2017 {

	public static void main(String[] args) {
	int num1,num2,multiplo;
	
	num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de multiplos que quiere que se imprima: "));

	num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero seleccionado para calcular sus multiplos: "));
	
	for(int i=1;i<=num1;i++) {
		multiplo=(i*num2);
		
		System.out.println(num2+ " x "+ i+" = "+multiplo);
		
		
	}
	
	}

}
