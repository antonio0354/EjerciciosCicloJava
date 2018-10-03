package Ejercicios_Java_Tema2;

import javax.swing.JOptionPane;

public class ejercicio3bloque3 {

	public static void main(String[] args) {
	String Menu="Menu:\n"
			+ "1.- Calculo de la hipotenusa de un triangulo\n"
			+ "2.- Calculo de la superficie de una circunferencia\n"
			+ "3.- Calculo del perimetro de una circunferencia\n"
			+ "4.- Calculo del area de un rectangulo\n"
			+ "5.- Calculo del area de un triangulo\n"
			+ "0.- Salir de la aplicacion";
	
	int opcion=Integer.parseInt(JOptionPane.showInputDialog(Menu));
	
	float num1,num2,num3;
	
	switch(opcion) {
	case 0:
	System.exit(0);
		
	case 1:
		num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer cateto"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo cateto"));
		JOptionPane.showMessageDialog(null,Math.sqrt((Math.pow(num1, 2)+ Math.pow(num2, 2))) );
		break;
    case 2:
    	num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la longitud del radio"));
		JOptionPane.showMessageDialog(null,(Math.PI*Math.pow(num1, 2)) );
		break;
	case 3:
		num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la longitud del radio"));
		JOptionPane.showMessageDialog(null,(2*Math.PI*num1) );
		break;
    case 4:
    	num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base del rectangulo"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura del rectangulo"));
		JOptionPane.showMessageDialog(null,  (num1*num2) );
		break;
	case 5:
		num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base del triangulo"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura del triangulo"));
		JOptionPane.showMessageDialog(null,  ((num1*num2)/2) );
	break;
	default:
		JOptionPane.showMessageDialog(null,"Comando erroneo, vuelve a intentarlo");
	break;
	}

	

}
}
