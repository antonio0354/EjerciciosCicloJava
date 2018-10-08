package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio1bloque3While {

	public static void main(String[] args) {
		int suma=0;
		int num;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar): "));
		
		while(num!=0) {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar): "));
			
			
			suma+=num;
		}
		
		JOptionPane.showMessageDialog(null, "La suma es: "+suma);

	}

}
