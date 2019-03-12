package ejercicios_listener;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;





public class Ejercicio1Digitos {

	public static List<Ejercicio1Listener> BusquedaDigitosListener = new ArrayList<Ejercicio1Listener>();
	
	public static void main(String[] args) {
		
		String frase;
		int contador=0;
		
		do {
	
			contador=0;
			
			 frase=JOptionPane.showInputDialog("Introduzca un mensaje: ");
			 char cadenaTexto[] = new char[frase.length()];
			 
			 for(int i=0;i<frase.length();i++) {
				 cadenaTexto[i]=frase.charAt(i);
				 if(Character.isDigit(cadenaTexto[i])) {
					 contador++;
				 }
				 
			 }
			 
			 
		}while((contador<3));
		
		System.out.println("has introducido 3 digitos");
		
		
	}
	
	public void addEjercicio1Listener(Ejercicio1Listener event) {
		BusquedaDigitosListener.add(event);
	}
	
	public void removeEjercicio1Listener(Ejercicio1Listener event) {
		BusquedaDigitosListener.remove(event);
	}
	
	public void fireEjercicio1Listener(String frase) {
//	for (int i = 0; i < Ejercicio1Listener.size(); i++) {
//		Ejercicio1Listener.get(i).nuevoNumeroImparIntroducido(new Ejercicio1Listener(frase));
//	}	
	}

}
