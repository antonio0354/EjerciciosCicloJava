package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio6bloque3 {

	public static void main(String[] args) {
		int num=1;
		
		String Tabla="";
		for(;num!=0;) {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar): "));
			if(num==0) {
				System.exit(0);
				
			}else {
				for(int j=0;j<=10;j++) {
					Tabla+=(num+" x "+  j  +" = "+num*j+"\n");
					
					
				}	
				
			}
			
			JOptionPane.showMessageDialog(null, Tabla);
			
		}
	}

}
