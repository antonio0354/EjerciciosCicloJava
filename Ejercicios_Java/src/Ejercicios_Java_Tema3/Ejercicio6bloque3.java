package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio6bloque3 {

	public static void main(String[] args) {
		int num=1;
		
		
		for(int i=0;num!=0;i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero (0 para terminar): "));
			if(num==0) {
				System.exit(0);
				
			}else {
				for(int j=0;j<=10;j++) {
					System.out.println(num+" x "+  j  +" = "+num*j);
					
					
				}	
				
			}
			
			
			
		}
	}

}
