package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio3bloque3While {

	public static void main(String[] args) {
		int num ,mayor;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		mayor=num;
		while(num!=0) {
	    num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
			
		if(num>mayor && num!=0) {
			mayor=num;
			
		}
			
			
			
			
		}
		
		JOptionPane.showMessageDialog(null, "El mayor es: "+ mayor);

	}

}
