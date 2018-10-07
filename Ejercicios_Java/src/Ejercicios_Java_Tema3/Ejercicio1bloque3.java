package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio1bloque3 {

	public static void main(String[] args) {
		int suma=0;
		int num;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar): "));
		
		for(int i=0; num!=0;i++) {
			suma+=num;
			
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar): "));
			
		}
		
		JOptionPane.showMessageDialog(null, "La suma es: "+suma);

	}

}
