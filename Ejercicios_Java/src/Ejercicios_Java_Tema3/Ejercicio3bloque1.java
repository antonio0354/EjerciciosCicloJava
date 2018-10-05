package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio3bloque1 {

	public static void main(String[] args) {
		
	int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca las veces que quieres que se pida un numero: "));
	int cont=0,cont2=0;
	
	for(int i=0;i<num2;i++) {
	int	num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero "+ (i+1)));
		if(num1>=0) {
			cont=cont+1;
			
		}else {
			cont2=cont2+1;
		}
		
	}
	
	JOptionPane.showMessageDialog(null, "Los positivos son: "+ cont);
	JOptionPane.showMessageDialog(null, "Los negativos son: "+ cont2);
	
	}

}
