package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio2bloque1 {

	public static void main(String[] args) {
		
	int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca las veces que quieres que se pida un numero: "));
	int suma=0;
	
	for(int i=0;i<num2;i++) {
	int	num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero "+ (i+1)));
		if(num1>10) {
			suma=suma+num1;
			
		}
		
	}
	
	JOptionPane.showMessageDialog(null, "La suma es:"+ suma);
	
	}

}
