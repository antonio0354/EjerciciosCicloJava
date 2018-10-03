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
				+ "6.- Raiz n-esima de un numero";
				
		int opcion= Integer.parseInt(JOptionPane.showInputDialog(menu));

	    
		int num1,num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
		String mensaje="";
		
		switch(opcion) {
		case 1://suma
			mensaje="Resultado: "+(num1+num2);
			
		break;
		case 2:
			mensaje="Resultado: "+(num1-num2);
			
		break;
		case 3:
			mensaje="Resultado: "+(num1*num2);
			
		break;
		case 4:
			mensaje="Resultado: "+(num1/num2)+" Resto: "+(num1%num2);
			
		break;
		case 5:
			mensaje="Resultado: "+(Math.pow(num1, num2));
			
		break;
		case 6:
			mensaje="Resultado: "+ Math.pow(num1, (float)1/num2);
			
		break;
		default:
			mensaje="Error, comando erroneo";
			break;
		}
		
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
