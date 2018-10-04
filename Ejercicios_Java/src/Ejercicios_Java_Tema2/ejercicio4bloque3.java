package Ejercicios_Java_Tema2;

import javax.swing.JOptionPane;

public class ejercicio4bloque3 {

	public static void main(String[] args) {
		int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad dada: "));
		int importe=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el importe del articulo: "));
		int resultado;
		int monedas;
		int mon100=100,mon50=50,mon25=25,mon5=5;
		
		
		resultado=cantidad-importe;
		System.out.println(resultado);
		
		monedas=(resultado/mon100);
		System.out.println(monedas+" monedas de 100");
		
		monedas=(resultado%mon100)/mon50;
		System.out.println(monedas+" monedas de 50");
		
		monedas=((resultado%mon100)%mon50)/mon25;
		
		System.out.println(monedas+" monedas de 25");
		
		monedas=((((resultado%mon100)%mon50)%mon25)/mon5);
		System.out.println(monedas+" monedas de 5");
		
		monedas=(((((resultado%mon100)%mon50)%mon25)%mon5)/1);
		System.out.println(monedas+" monedas de 1");
		
	}

}
