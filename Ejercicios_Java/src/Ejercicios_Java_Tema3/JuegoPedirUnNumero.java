package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class JuegoPedirUnNumero {

	public static void main(String[] args) {
		int numeroPensado=(int) Math.round(Math.random()*100);
		
		int tirada;
		
		do {
		
			tirada=Integer.parseInt(JOptionPane.showInputDialog("Busca el numero pensado(0-100): "));
			if(tirada<numeroPensado) {
				JOptionPane.showMessageDialog(null, "El numero pensado es mayor a "+tirada);
				
			}else {
				if(tirada>numeroPensado) {
					JOptionPane.showMessageDialog(null, "El numero pensado es menor a "+tirada); 
					
				}else {
					JOptionPane.showMessageDialog(null, "El numero pensado es igual a "+tirada+"\nEnhorabuena"); 
					
				}
			}
			
			
			
		}while(tirada!=numeroPensado);
		
		
	}

}
