package Ejercicios_Java_Tema5_Bloque2;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		int multiplicacion;
		int numeropedido=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero que multiplicará a los demás: "));
		int numeros[]= new int[150];
	
	
		for(int i=0;i<numeros.length;i++) {
			multiplicacion=0;
			numeros[i]=(int) Math.round(Math.random()*100);
			System.out.println("El numero sin multiplicar es: "+numeros[i]);
			multiplicacion=numeros[i]*numeropedido;
			System.out.println("El numero multiplicado es: "+multiplicacion);
			
		}
	}

}
