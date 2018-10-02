package Ejercicios_java_Tema1;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Introduzca un numero: ");
        int valor1= Integer.parseInt(num1);
        
         num1 = JOptionPane.showInputDialog("Introduzca un numero: ");
        int valor2= Integer.parseInt(num1);
        
         num1 = JOptionPane.showInputDialog("Introduzca un numero: ");
        int valor3= Integer.parseInt(num1);
        
        
        float suma=valor1+valor2+valor3;
        
        float media=suma/3;
        
        System.out.println("La media de "  + valor1 + " " + valor2 + " " + valor3 +
         " es " + media);

	}

}
