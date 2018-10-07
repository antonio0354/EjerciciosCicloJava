package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio2bloque3 {

	public static void main(String[] args) {
		int suma=0,media=0,cont=0;;
		int num;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar): "));
		
		for(int i=0; num!=0;i++) {
			suma+=num;
			
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar): "));
			cont++;
		}
		
		media=suma/cont;
		JOptionPane.showMessageDialog(null, "La media es: "+ media);

	}

}
