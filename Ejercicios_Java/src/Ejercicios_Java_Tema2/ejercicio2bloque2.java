package Ejercicios_Java_Tema2;

import javax.swing.JOptionPane;

public class ejercicio2bloque2 {

	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("Introduzca un numero: ");
		int val1=Integer.parseInt(num1);
		
		num1=JOptionPane.showInputDialog("Introduzca el segundo numero: ");
		int val2=Integer.parseInt(num1);
		
		num1=JOptionPane.showInputDialog("Introduzca el tercer numero: ");
		int val3=Integer.parseInt(num1);
		
		num1=JOptionPane.showInputDialog("Introduzca el cuarto numero: ");
		int val4=Integer.parseInt(num1);
		
		num1=JOptionPane.showInputDialog("Introduzca el quinto numero: ");
		int val5=Integer.parseInt(num1);
		
		int cont1=0,cont2=0,cont3=0;
		
		if(val1>0 && val2>0 && val3>0 && val4>0 && val5>0){
			if(val1>=0 && val1<=25) {
				cont1=cont1+1;
			}else {
				if(val1>25 && val1<=250) {
					cont2=cont2+1;
				}else {
					if(val1>250) {
						cont3=cont3+1;	
	}
						 	
					}
		}
			if(val2>=0 && val2<=25) {
				cont1=cont1+1;
			}else {
				if(val2>25 && val2<=250) {
					cont2=cont2+1;
				}else {
					if(val2>250) {
						cont3=cont3+1;	
	}
						 	
					}
		}
			if(val3>=0 && val3<=25) {
				cont1=cont1+1;
			}else {
				if(val3>25 && val3<=250) {
					cont2=cont2+1;
				}else {
					if(val3>250) {
						cont3=cont3+1;	
	}
						 	
					}
		}
			if(val4>=0 && val4<=25) {
				cont1=cont1+1;
			}else {
				if(val4>25 && val4<=250) {
					cont2=cont2+1;
				}else {
					if(val4>250) {
						cont3=cont3+1;	
	}
						 	
					}
		}
			if(val5>=0 && val5<=25) {
				cont1=cont1+1;
			}else {
				if(val5>25 && val5<=250) {
					cont2=cont2+1;
				}else {
					if(val5>250) {
						cont3=cont3+1;	
	}
						 	
					}
		}
			
		
				}else {
					System.out.println("El programa se ha terminado") ;
			}
			
		System.out.println("Contador1:"+cont1+
				"\nContador2:"+cont2+
				"\nContador3:"+cont3);	
		}
			
	}


