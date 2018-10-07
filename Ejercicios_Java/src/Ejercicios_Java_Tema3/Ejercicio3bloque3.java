package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio3bloque3 {

	public static void main(String[] args) {
		int num = 1,mayor=0;
		
		
		
		for(int i=0; num!=0 ;i++) {
			if(i==0) {
				mayor=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar):" ));
				num=mayor;
			}else {
				num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar):" ));
				if(num>mayor && num!=0) {
					mayor=num;
					
					
				}
				
				
			}
			
		}
		
		
		JOptionPane.showMessageDialog(null, "El mayor es: "+ mayor);

	}

}
