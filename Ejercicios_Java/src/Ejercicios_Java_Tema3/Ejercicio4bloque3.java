package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio4bloque3 {

	public static void main(String[] args) {
		int num = 1,menor=0;
		
		for(int i=0; num!=0 ;i++) {
			if(i==0) {
				menor=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar):" ));
				num=menor;
			}else {
				num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar):" ));
				if(num<menor && num!=0) {
					menor=num;
					
					
				}
				
				
			}
			
		}
		
		
		JOptionPane.showMessageDialog(null, "El menor es: "+ menor);

	}

}
