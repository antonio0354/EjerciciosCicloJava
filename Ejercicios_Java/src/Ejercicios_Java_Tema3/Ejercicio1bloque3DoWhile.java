package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio1bloque3DoWhile {

	public static void main(String[] args) {
		int suma=0;
		int num;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar): "));
		
		do {
			suma+=num;
			
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar): "));
			

			
			
		}while(num!=0);
		
		JOptionPane.showMessageDialog(null, "La suma es: "+suma);

	}

}
