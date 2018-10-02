package Ejercicios_Java_Tema2;

import javax.swing.JOptionPane;

public class ejercicio1bloque3 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca una nota"));

		String mensaje = " ";
		
		switch(num) {
		case 0:
		case 1:
			mensaje ="Muy deficiente";
			break;
		case 2:
		case 3:
		case 4:
			mensaje ="Insuficiente";
			break;
		case 5:
			mensaje ="Suficiente";
			break;
		case 6:
			mensaje ="Bien";
			break;
		case 7:
		case 8:
			mensaje ="Notable";
			break;
		
		case 9:
		case 10:
			mensaje ="Sobresaliente";
			break;
		default:
			System.out.println("La nota no es correcta");
			break;
			
		

		}
		
JOptionPane.showConfirmDialog(null, "Nota: "+mensaje);
		}

}
