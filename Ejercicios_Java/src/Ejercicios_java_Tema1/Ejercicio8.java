package Ejercicios_java_Tema1;

import javax.swing.JOptionPane;

public class Ejercicio8 {

	public static void main(String[] args) {
	String num1=JOptionPane.showInputDialog("Introduzca un numero entero: ");
	int val1=Integer.parseInt(num1);
	
	 num1=JOptionPane.showInputDialog("Introduzca un numero entero: ");
	int val2=Integer.parseInt(num1);
	
	 num1=JOptionPane.showInputDialog("Introduzca un numero entero: ");
	int val3=Integer.parseInt(num1);
	
	
	if((val1==val2) && (val2==val3)){
		System.out.println("Los tres numeros son iguales");
	}
	else {
		if((val1==val2)||(val1==val3)||(val2==val3)) {
			System.out.println("Hay dos numeros iguales");
		}
		else {
		if((val1>val2) && (val1>val3)) {
			System.out.println("El numero mayor es: " + val1);
		}else {
			if((val2>val1)&&(val2>val3)){
				System.out.println("El numero mayor es: "+val2);
			}
			else {
				System.out.println("El numero mayor es: " + val3);
			}
		}
		if((val1<val2) && (val1<val3)) {
			System.out.println("El numero menor es: " + val1);
		}else {
			if((val2<val1)&&(val2<val3)){
				System.out.println("El numero menor es: "+val2);
			}
			else {
				System.out.println("El numero menor es: " + val3);
			}
		}
	}
	
	}

	}

}
