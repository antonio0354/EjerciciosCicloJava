package ejercicios_math;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {

		ejercicio1();
		
		
	}
	
	public static void ejercicio1() {
		
		int num;
	
		int a=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor a: "));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor b: "));
		int c=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor c: "));

		
		float x1,x2;
		
		x1= (int) ((-b + Math.sqrt(b*b-(4*(a*c))))/2*a);
		x2= (int) ((-b - Math.sqrt(b*b-(4*(a*c))))/2*a);
		
		num=b*b-(4*(a*c));
		
		if(num<0) {
			
			System.out.println("No tiene solucion");
		}else {
			System.out.println("Las soluciones son: "+x1+" y "+x2);

		}
	}
	
	public static void ejercicio2() {
		
	}

}
