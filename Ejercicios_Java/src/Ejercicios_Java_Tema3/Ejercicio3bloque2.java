package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio3bloque2 {

	public static void main(String[] args) {
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		int multiplo;
		
		
		for(int i=1;i<100;i++) {
		multiplo=num1*i;
		
		if (multiplo>=100) {
			i=200;
			
		}else {
		System.out.println(num1+" x " + i +" = "+multiplo);
			
			
		}
	}

}
}
