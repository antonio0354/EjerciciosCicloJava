package xxx;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	static List<NumeroEspecialIntroducidoListener> numeroImparIntroducidoListeners = 
			new ArrayList<NumeroEspecialIntroducidoListener>();

	/**
	 * 
	 * @param listener
	 */
	public static void addNumeroImparIntroducidoListener (NumeroEspecialIntroducidoListener listener) {
		numeroImparIntroducidoListeners.add(listener);
	}
	
	/**
	 * 
	 * @param listener
	 */
	public static void removeNumeroImparIntroducidoListener (NumeroEspecialIntroducidoListener listener) {
		numeroImparIntroducidoListeners.remove(listener);
	}

	/**
	 * 
	 * @param e
	 */
	public static void fireNumeroImparIntroducidoListener (NumeroEspecialIntroducidoEvent e) {
		for (NumeroEspecialIntroducidoListener listener : numeroImparIntroducidoListeners) {
			listener.numeroImparIntroducido(e);
		}
	}

	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean activo = true;
		Respuesta respuesta = new Respuesta();
		addNumeroImparIntroducidoListener(respuesta);
		
		String palBuscar=JOptionPane.showInputDialog("Introduzca la palabra a buscar:");
		
		while (activo) {
			String palIntroducido =JOptionPane.showInputDialog("Introduzca una palabra: ");
			System.out.println("N�mero introducido: " + palIntroducido);
			
			// Notifico a los listeners
			if (palIntroducido == palBuscar) {
				NumeroEspecialIntroducidoEvent event = new NumeroEspecialIntroducidoEvent(palIntroducido);
				fireNumeroImparIntroducidoListener(event);
			}else {
				if(palIntroducido=="hola") {
					activo=false;
				}
			}
			
			
			
		}

	}

}
