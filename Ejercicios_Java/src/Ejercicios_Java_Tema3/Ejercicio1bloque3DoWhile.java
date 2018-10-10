package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio1bloque3DoWhile {

	public static void main(String[] args) {
		int suma=0;
		int num;
		
		do {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar): "));
				
			suma+=num;
			
		}while(num!=0);
		
		if(num==0) {
			
			System.exit(0);
		}else {
			JOptionPane.showMessageDialog(null, "La suma es: "+suma);

		}
		
	}

}
