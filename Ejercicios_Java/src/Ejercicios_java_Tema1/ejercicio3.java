package Ejercicios_java_Tema1;

import javax.swing.JOptionPane;

public class ejercicio3 {

	public static void main(String[] args) {
		Ejercicio();
	}
	
	public static void Ejercicio() {
		String num1 = JOptionPane.showInputDialog("Introduzca un numero: ");
        int valor1= Integer.parseInt(num1);
        
         num1 = JOptionPane.showInputDialog("Introduzca un numero: ");
        int valor2= Integer.parseInt(num1);
        
         num1 = JOptionPane.showInputDialog("Introduzca un numero: ");
        int valor3= Integer.parseInt(num1);
        
        
        System.out.println("Los numeros son "  + valor1 + " " + valor2 + " " + valor3);
        
        
        int suma=valor1+valor2+valor3;
        
        
        
        System.out.println("La suma es " + suma );
        
	}

}
