package Ejercicios_Java_Tema2;

import javax.swing.JOptionPane;

public class ejercicio2bloque3 {

	public static void main(String[] args) {
		String menu= "MENU\n"
				+ "1.- Suma de dos números\n"
				+ "2.- Resta de dos números\n";
		
		int opcion= Integer.parseInt(JOptionPane.showInputDialog(menu));

		int num1,num2;
		
		switch(opcion) {
		case 1:
			num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
			num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
			JOptionPane.showMessageDialog(null, "Resultado: "+(num1+num2) );
		break;
		
		case 2:
			num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
			num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
			JOptionPane.showMessageDialog(null, "Resultado: "+(num1-num2) );
		break;
		}
	}

}
