package Ejercicios_java_Tema1;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		String datos=JOptionPane.showInputDialog("Introduzca el euribor: ");
		float euribor = Float.parseFloat(datos);
		
		 datos=JOptionPane.showInputDialog("Introduzca el diferencial: ");
		float diferencial = Float.parseFloat(datos);
		
		datos=JOptionPane.showInputDialog("Introduzca el capital: ");
		int capital = Integer.parseInt(datos);
		
		datos=JOptionPane.showInputDialog("Introduzca los meses: ");
		int meses = Integer.parseInt(datos);
		
		
		float interesAnual,interesMensual,cuotaMensual;
		
		interesAnual=euribor+diferencial;
		
		interesMensual=((interesAnual/12)/100);
		
		float calculo=(float) Math.pow(1+interesMensual, meses);
		
		cuotaMensual= (float) (capital*((interesMensual* calculo)/(calculo-1)));
		
		System.out.println("La cuota mensual es de "+ cuotaMensual +"€");

	}

}
