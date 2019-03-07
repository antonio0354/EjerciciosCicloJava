package ejercicios_Hashmap;

import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;





public class Ejercicio1 {

	public static void main(String[] args) {
		
		String key;
		String codigo,estante,descripcion;
		
		HashMap<String, Articulo> almacen = new HashMap<String, Articulo>();
		
		String mensaje="MENU: \n"
				+ "1.Insertar articulo \n"
				+ "2.Eliminar articulo \n"
				+ "3.Actualizar articulo \n"
				+ "4.Imprimir lista de articulos";
		
		int opcion=0;
		
		do {
			 opcion=Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
			
			switch(opcion) {
			case 1:
				
				codigo= JOptionPane.showInputDialog(null, "Introduzca el codigo:");
				estante= JOptionPane.showInputDialog(null, "Introduzca el estante:");
				descripcion= JOptionPane.showInputDialog(null, "Introduzca la descripcion:");
				Articulo articulo = new Articulo(codigo,estante,descripcion);
				
				almacen.put(articulo.getCodigo(),articulo);
				
				break;
			case 2:
				System.out.println(" ");

				Object objetos[] = almacen.keySet().toArray();
				for (int i = 0; i < objetos.length; i++) {
					System.out.println("Articulo: "+almacen.get(objetos[i]));
				}
				
				String borrado = JOptionPane.showInputDialog("Introduzca el codigo del articulo a borrar: ");
				almacen.remove(borrado);
				
				break;
			case 3:
				System.out.println(" ");
				String articuloacambiar= JOptionPane.showInputDialog("Introduzca el codigo del articulo a actualizar: ");
				
				Object actualiza[] = almacen.keySet().toArray();
				for (int i = 0; i < actualiza.length; i++) {
					System.out.println("Articulo: "+almacen.get(actualiza[i]));
				}
				
				
				
				String actualizacion = JOptionPane.showInputDialog("Introduzca el valor del nuevo estante: ");
				String actualizacion2 = JOptionPane.showInputDialog("Introduzca el valor de la nueva descripcion: ");
				
				Articulo articulo2 = new Articulo(articuloacambiar,actualizacion,actualizacion2);
				
				almacen.replace(articuloacambiar,articulo2);
				
				
				
				
				break;
			case 4:
				System.out.println(" ");

				Object claves[] = almacen.keySet().toArray();
				for (int i = 0; i < claves.length; i++) {
					System.out.println("Articulo: "+almacen.get(claves[i]));
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Error");
				break;
		
		
		}
		}while(opcion!=0);
			
		
		
		
	}

}
