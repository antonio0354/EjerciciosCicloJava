package Ejercicios_Java_Tema2;

import javax.swing.JOptionPane;

public class ejercicio1bloque2 {

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

		int suma1=0,suma2=0,suma3=0,suma4=0;
		
		
		if(val1<0) {
			suma1=suma1+val1;
			
		}else {
			if(val1<=25) {
				suma2=suma2+val1;
			}else {
				if(val1<=250) {
					suma3=suma3+val1;
				}else {
					
						suma4=suma4+val1;
						
					
					
				}
			}
		}
		
		if(val2<0) {
			suma1=suma1+val2;
			
		}else {
			if(val2<=25) {
				suma2=suma2+val2;
			}else {
				if(val2<=250) {
					suma3=suma3+val2;
				}else {
					
						suma4=suma4+val2;
						
					
					
				}
			}
		}
		
		if(val3<0) {
			suma1=suma1+val3;
			
		}else {
			if(val3<=25) {
				suma2=suma2+val3;
			}else {
				if(val3<=250) {
					suma3=suma3+val3;
				}else {
					
						suma4=suma4+val3;
						
					
					
				}
			}
		}
		
		if(val4<0) {
			suma1=suma1+val4;
			
		}else {
			if(val4<=25) {
				suma2=suma2+val4;
			}else {
				if(val4<=250) {
					suma3=suma3+val4;
				}else {
					
						suma4=suma4+val4;
						
					
					
				}
				
			}
		}
		
		if(val5<0) {
			suma1=suma1+val5;
			
		}else {
			if(val5<=25) {
				suma2=suma2+val5;
			}else {
				if(val5<=250) {
					suma3=suma3+val5;
				}else {
					
						suma4=suma4+val5;
						
					
					
				}
			}
		}
		
		System.out.println("Las sumas son: "+ "\nSuma1:" + suma1 + 
				"\nSuma2:"+ suma2 +
				"\nSuma3:"+ suma3 +
				"\nSuma4:"+ suma4);
	

}
}
