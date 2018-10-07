package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio7bloque3 {

	public static void main(String[] args) {
		int num=1,contPositivos=0,contNegativos=0;
		
		
		for(int i=0;num!=0;i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar): "));
				if(num>0) {
					contPositivos++;
					
				}else {
					if(num<0) {
						contNegativos++;
						
					}
				}
			
			
		}
		JOptionPane.showMessageDialog(null, "Los negativos son: "+contNegativos);
		JOptionPane.showMessageDialog(null, "Los positivos son: "+contPositivos);
		
	}

}
