package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class Ejercicio4bloque3DoWhile {

	public static void main(String[] args) {
		int num ,menor;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero(0 para acabar): "));
		menor=num;
		do {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero(0 para acabar): "));
			
			
			if(num<menor && num!=0) {
				menor=num;
				
			}
			
		}while(num!=0 ); 
	    
			
			
			if(menor==0){
				System.exit(0);
			}else {
				JOptionPane.showMessageDialog(null, "El menor es: "+ menor);

			}
				
			
			
			
		
		
		
	}

}
