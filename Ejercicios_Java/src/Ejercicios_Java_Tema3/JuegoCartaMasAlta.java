package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class JuegoCartaMasAlta {

	public static void main(String[] args) {
		int cartaOrdenador=1,cartaJugador,paloOrdenador,paloJugador;
		String numeromayor10jugador=" ";
		String numeromayor10ordenador=" ";
		String palonombrejugador=" ";
		String palonombreordenador=" ";
		
		JOptionPane.showMessageDialog(null, "Quieres Jugar?");
		
		
		cartaOrdenador=(int) (Math.round((Math.random()*12+2)));
		
		paloOrdenador=(int) Math.round(Math.random()*3+1);
		
		
		cartaJugador=(int) (Math.round((Math.random()*12+2)));
		
		paloJugador=(int) Math.round(Math.random()*3+1);
		
		
		if(paloJugador==4) {
			palonombrejugador="Picas";
		}else {
			if(paloJugador==3) {
				palonombrejugador="Diamantes";
				
			}else {
				if(paloJugador==2) {
					palonombrejugador="Treboles";
				}else {
					if(paloJugador==1) {
						palonombrejugador="Corazones";
					}
				}
			}
		}
		
		if(paloOrdenador==4) {
			palonombreordenador="Picas";
		}else {
			if(paloOrdenador==3) {
				palonombreordenador="Diamantes";
				
			}else {
				if(paloOrdenador==2) {
					palonombreordenador="Treboles";
				}else {
					if(paloOrdenador==1) {
						palonombreordenador="Corazones";
					}
				}
			}
		}
		
		
		if(cartaJugador==11) {
			numeromayor10jugador="J";
			JOptionPane.showMessageDialog(null, "Tu carta es: "+numeromayor10jugador+"\nEl palo es: "+palonombrejugador);
		}else {
			if(cartaJugador==12) {
				numeromayor10jugador="Q";
				JOptionPane.showMessageDialog(null, "Tu carta es: "+numeromayor10jugador+"\nEl palo es: "+palonombrejugador);
			}else {
				if(cartaJugador==13) {
					numeromayor10jugador="K";
					JOptionPane.showMessageDialog(null, "Tu carta es: "+numeromayor10jugador+"\nEl palo es: "+palonombrejugador);
				}else {
					if(cartaJugador==14) {
						numeromayor10jugador="As";
						JOptionPane.showMessageDialog(null, "Tu carta es: "+numeromayor10jugador+"\nEl palo es: "+palonombrejugador);
					}else {
						JOptionPane.showMessageDialog(null, "Tu carta es: "+cartaJugador+"\nEl palo es: "+palonombrejugador);
					}
				}
			}
		}
		
		
		if(cartaOrdenador==11) {
			numeromayor10ordenador="J";
			JOptionPane.showMessageDialog(null, "La carta del ordenador es: "+numeromayor10ordenador+"\nEl palo es: "+palonombreordenador);
		}else {
			if(cartaOrdenador==12) {
				numeromayor10ordenador="Q";
				JOptionPane.showMessageDialog(null, "La carta del ordenador es: "+numeromayor10ordenador+"\nEl palo es: "+palonombreordenador);
			}else {
				if(cartaOrdenador==13) {
					numeromayor10ordenador="K";
					JOptionPane.showMessageDialog(null, "La carta del ordenador es: "+numeromayor10ordenador+"\nEl palo es: "+palonombreordenador);
				}else {
					if(cartaOrdenador==14) {
						numeromayor10ordenador="As";
						JOptionPane.showMessageDialog(null, "La carta del ordenador es: "+numeromayor10ordenador+"\nEl palo es: "+palonombreordenador);
					}else {
						JOptionPane.showMessageDialog(null, "La carta del ordenador es: "+cartaOrdenador+"\nEl palo es: "+palonombreordenador);
					}
				}
			}
		}
		
		
		
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
