package Examen_Java_2018;

import javax.swing.JOptionPane;

public class Ejerciciob {

	public static void main(String[] args) {
		int num;
		boolean esprimo=true;
		num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero para ver si es primo: "));
		//Introducimos el numero y para ver si es primo creamos la variable boolean esprimo
		for(int i=2;i<num;i++) {
			//Si se encuentra un numero entre el 2 y el numero dado que al dividirle entre el numero dado, el resto es 0,no es primo
			if(num%i==0 && esprimo==true) {
				System.out.println(num+" no es primo");
				esprimo=false;
			}
			
		}
		
		//si al salir del bucle, la boolean sigue en true,el numero es primo
		if(esprimo==true)
			System.out.println(num+" es primo");
			
			
		}

	}


