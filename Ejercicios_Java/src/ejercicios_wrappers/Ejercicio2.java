package ejercicios_wrappers;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {

		boolean estaMayus=false;
		boolean estaMinus=false;
		boolean estaDigito=false;
		boolean estaAlfa=false;
		boolean contraseñaUp=false;
		
		String contraseña=" ";
		
		do {
			estaMayus=false;
			estaMinus=false;
			estaDigito=false;
			estaAlfa=false;
			
			contraseña=JOptionPane.showInputDialog("Introduce la contraseña:");
			char cadenaTexto[] = new char[contraseña.length()];
			
			
			for(int i=0;i<contraseña.length();i++) {
				cadenaTexto[i]=contraseña.charAt(i);
				if(Character.isDigit(cadenaTexto[i])) {
					estaDigito=true;
				}
				if(Character.isLowerCase(cadenaTexto[i])) {
					estaMinus=true;
				}
				if(Character.isUpperCase(cadenaTexto[i])) {
					estaMayus=true;
				}
				if(!Character.isWhitespace(cadenaTexto[i]) && !Character.isLetterOrDigit(cadenaTexto[i])) {
					estaAlfa=true;
				}
				
			}
			
			if(estaMayus || estaMinus || estaDigito || estaAlfa) {
				System.out.println("Contraseña incorrecta");
				
			}
			
		}while(!(estaMayus && estaMinus && estaDigito && estaAlfa));
		
			 System.out.println("La contraseña es: "+contraseña);
		 
		
		
		
	}

}
