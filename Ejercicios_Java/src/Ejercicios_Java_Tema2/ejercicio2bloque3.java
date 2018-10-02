package Ejercicios_Java_Tema2;

import javax.swing.JOptionPane;

public class ejercicio2bloque3 {

	public static void main(String[] args) {
		String menu= "MENU\n"
				+ "1.- Suma de dos numeros\n"
				+ "2.- Resta de dos numeros\n"
				+ "3.- Multiplicacion de dos numeros\n"
				+ "4.- Division de dos numeros\n"
				+ "5.- Potencia de un numero elevado a otro\n"
				+ "6.- Raiz cuadrada de un numero";
				
		int opcion= Integer.parseInt(JOptionPane.showInputDialog(menu));

		int num1,num2;
		float num3,num4;
		
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
		case 3:
			num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
			num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
			JOptionPane.showMessageDialog(null, "Resultado: "+(num1*num2) );
		break;
		case 4:
			num3=Float.parseFloat(JOptionPane.showInputDialog("Introduzca un numero"));
			num4=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el segundo numero"));
			JOptionPane.showMessageDialog(null, "Resultado: "+(num3/num4) );
		break;
		case 5:
			num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
			num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
			JOptionPane.showMessageDialog(null, "Resultado: "+ (Math.pow(num1, num2)) );
		break;
		case 6:
			num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
			
			JOptionPane.showMessageDialog(null, "Resultado: "+ (Math.sqrt(num1) ));
		break;
		default:
			JOptionPane.showMessageDialog(null, "Error, comando erroneo");
			break;
		}
	}

}
