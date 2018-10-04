package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio1bloque2 {

	public static void main(String[] args) {
		
	int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca las veces que quieres que se pida un numero: "));
	int suma=0,cont=0,media=0;
	
	for(int i=0;i<num2;i++) {
	int	num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero "+ (i+1)));
		suma=suma+num1;
		cont++;
	}
	
	media=suma/cont;
	
	JOptionPane.showMessageDialog(null, "La media es :"+ media);
	
	
	}

}
