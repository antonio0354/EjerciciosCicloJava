package Ejercicios_Programacion_Objetos;

import javax.swing.JOptionPane;



public class Principal {

	public static void main(String[] args) {
		
		
		String menu="Tipo de persona\n"
				+ "1.-No Identificada \n"
				+ "2.-Identificada";
		
		
		int opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		String menu2="Tipo de persona\n"
				+ "1.-ESO \n"
				+ "2.-Bach \n"
				+ "3.-FP";
		
		
		int opcion2=Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		
		if (opcion >= 1 && opcion <= 2) {
			Persona alumno = null;
			
		switch(opcion) {
		case 1:
				
				break;
		case 2:
		
		break;
		
		}
		
		}
		
		Persona persona = null;
		
		persona = new Persona();
		Persona alumno=(Persona)persona;
		
		
		
	}

}
