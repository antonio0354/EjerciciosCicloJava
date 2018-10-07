package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio5bloque3 {

	public static void main(String[] args) {
		int num = 1,mayor=0,menor=0;
		
		
		
		for(int i=0; num!=0 ;i++) {
			if(i==0) {
				mayor=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar):" ));
				menor=mayor;
				num=mayor;
			}else {
				num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar):" ));
				if(num>mayor && num!=0) {
					mayor=num;
					
					
				}
				if(num<menor && num!=0) {
					menor=num;
					
					
				}
				
				
			}
			
		}
		
		
		JOptionPane.showMessageDialog(null, "El mayor es: "+ mayor);
		JOptionPane.showMessageDialog(null, "El menor es: "+ menor);
	}

}
