package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio3bloque2 {

	public static void main(String[] args) {
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		int multiplo;
		
		
		for(int i=0;i<100;i++) {
		multiplo=num1*i;
		
		
		
		if (multiplo>=100) {
			i=102;
			
		}else {
		System.out.println(multiplo);
			
			
		}
	}

}
}
