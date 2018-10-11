package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class JuegoCartaMasAlta {

	public static void main(String[] args) {
		int cartaOrdenador=1,cartaJugador,paloOrdenador,paloJugador;
		JOptionPane.showInputDialog(null, "Quieres Jugar?");
		
		
		cartaOrdenador=(int) (Math.round((Math.random()*11+2)));
		
		paloOrdenador=(int) Math.round(Math.random()*3+1);
		
		
		cartaJugador=(int) (Math.round((Math.random()*11+2)));
		
		paloJugador=(int) Math.round(Math.random()*3+1);
		
		
		
		
		JOptionPane.showMessageDialog(null, "Tu carta es: "+cartaJugador);
		JOptionPane.showMessageDialog(null, "La carta es: "+cartaOrdenador);
		
		if(cartaJugador>cartaOrdenador) {
			JOptionPane.showMessageDialog(null, "Has ganado");
			}else {
				if(cartaJugador<cartaOrdenador) {
					JOptionPane.showMessageDialog(null, "Has perdido");
				}else {
					if(paloJugador>paloOrdenador) {
						JOptionPane.showMessageDialog(null, "Has ganado");
					}else {
					if(paloJugador<paloOrdenador) {
						JOptionPane.showMessageDialog(null, "Has perdido");
					}
					}
				}
			}
		
	}

}
