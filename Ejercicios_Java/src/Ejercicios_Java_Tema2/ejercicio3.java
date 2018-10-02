package Ejercicios_Java_Tema2;

import javax.swing.JOptionPane;

public class ejercicio3 {

	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("Introduzca un numero: ");
		int val1=Integer.parseInt(num1);
		
		num1=JOptionPane.showInputDialog("Introduzca el segundo numero: ");
		int val2=Integer.parseInt(num1);
		
		num1=JOptionPane.showInputDialog("Introduzca el tercer numero: ");
		int val3=Integer.parseInt(num1);
		
		num1=JOptionPane.showInputDialog("Introduzca el cuarto numero: ");
		int val4=Integer.parseInt(num1);
		
		num1=JOptionPane.showInputDialog("Introduzca el quinto numero: ");
		int val5=Integer.parseInt(num1);
		
		
		
		System.out.println("Los numeros son: " + val1 + " " + val2+" "+val3+" "+val4+" "+val5);
		
		if((val1>=val2)&&(val1>=val3)&&(val1>=val4)&&(val1>=val5)) {
			
			System.out.println("El numero mayor es "+val1);
			
		}
		else {
			if((val2>=val1)&&(val2>=val3)&&(val2>=val4)&&(val2>=val5)) {
				System.out.println("El numero mayor es "+val2);
				
			}
			else {
				if((val3>=val1)&&(val3>=val2)&&(val3>=val4)&&(val3>=val5)) {
					System.out.println("El numero mayor es "+val3);
				}
				else {
					if((val4>=val1)&&(val4>=val2)&&(val4>=val3)&&(val4>=val5)) {
						System.out.println("El numero mayor es "+val4);
					}
					else {
						if((val5>=val1)&&(val5>=val2)&&(val5>=val3)&&(val5>=val4)) {
							System.out.println("El numero mayor es "+val5);
						}
						
					}
				}
				
			}
			
			
		}
		
		

	}

}
