package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class JuegoCaraoCruz {

	public static void main(String[] args) {
		int contadorUsuario=0,contadorOrdenador=0;
		int numeroAleatorio;
		int pedirnumero;
		for(int i=0;i<5;i++){
			
			numeroAleatorio=(int) Math.round(Math.random());
			pedirnumero=Integer.parseInt(JOptionPane.showInputDialog("Elige cara(0) o cruz(1): "));
			if(pedirnumero==numeroAleatorio) {
				contadorUsuario++;
				JOptionPane.showMessageDialog(null, "Has ganado esta tirada");
			}else {
				contadorOrdenador++;
				JOptionPane.showMessageDialog(null, "Has perdido tirada");
			}
			
			
			
		}
		
		if(contadorUsuario>=3) {
			JOptionPane.showMessageDialog(null, "Has ganado el juego");
			
		}else {
			JOptionPane.showMessageDialog(null, "Has perdido el juego");
		}
		
		
	}

}
