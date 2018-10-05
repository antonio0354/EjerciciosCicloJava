package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio4bloque2 {

	public static void main(String[] args) {
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero limite de multiplos: "));
		int multiplo;
		
		
		for(int i=0;i<num2;i++) {
		multiplo=num1*i;
		
		
		
		if (multiplo>=num2) {
			i=num2+1;
			
		}else {
		System.out.println(multiplo);
			
			
		}
	}

}
}
