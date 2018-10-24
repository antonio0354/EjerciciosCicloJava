package Practica_Examen;

import java.util.Date;

import javax.swing.JOptionPane;

public class Ejercicio_3_Examen2017 {

	public static void main(String[] args) {
		int num1,num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero para calcular sus divisores: "));
		
		long millisAntes = new Date().getTime();
		
		if(num1!=0) {
			do {
				for(int i=1;i<num1;i++) {
					if((num1 % i )==0) {
						System.out.println("El numero "+ i +" es divisor de "+num1);
						
					}
					
					
				}
				System.out.println(" ");
				num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero para calcular sus divisores: "));
				
			}while(num1!=0);
		}
		
		
		long millisDespues = new Date().getTime();
		System.out.print("\nTiempo transcurrido (en segundos): " + ((float) (millisDespues - millisAntes) / 1000 ));
		
	}

}
