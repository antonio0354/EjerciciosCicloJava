package ejercicios_listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;



public class Ejercicio_1 {

	private static List<String> linea = new ArrayList<String>();
	private static List<String> list2 = new ArrayList<String>();
	private static int num;
	private static int  num2;
	public static void main(String[] args) {
	
		añadir();
		añadir();
		añadir();
		añadir();
		añadir();
		//añadir_en_indice();
		//imprimir();
		//sobreescribir();
		//borrar();
		imprimir();
		cortar();
		imprimir();
		pegar();
		imprimir();
	}
	
	private static void añadir() {
		
		linea.add(JOptionPane.showInputDialog("Introduce una linea al editor: "));
		
		
	}
	
	private static void imprimir() {
		System.out.println("Lista 1");
		int contador=0;
		for (String linea : linea) {
			System.out.println(contador+"."+" "+linea);
		contador++;	
		}
		
	}
	
	private static void añadir_en_indice() {
		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posicion a añadir un elemento: "));
		String elemento=JOptionPane.showInputDialog("Introduce el String: ");
		
		linea.add(num, elemento);
		
		
	}
	
	private static void sobreescribir() {
		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posicion a sobreescribir un elemento: "));
		String elemento=JOptionPane.showInputDialog("Introduce el String: ");
		
		linea.set(num, elemento);
		
		
	}
	
	private static void borrar() {
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posicion a eliminar un elemento: "));
		
		
		linea.remove(num);
		
		
	}
	
	private static void cortar() {
		num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer indice a cortar: "));
		num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el ultimo indice a cortar(el numero indicado no entra): "));
		int contador=0;
		
		list2.addAll(linea.subList(num, num2));
		
		
		 
		/*for (String list2 : list2) {
			System.out.println(contador+"."+" "+list2);
			
		}
		*/
		for(int i=num;i<num2;i++) {
			linea.remove(num);
		}
		
	}
	
	private static void pegar() {
		int num3= Integer.parseInt(JOptionPane.showInputDialog("Donde quieres pegarla? "));
		
			linea.addAll(num3,list2);
		
		
	}

}
