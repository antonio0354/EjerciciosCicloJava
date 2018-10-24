package Practica_Examen;

import javax.swing.JOptionPane;

public class Ejercicio_1_Examen2017 {
	
	public static void main(String[] args) {
	int num,num1,num2;
	float resultado;
	
	String menu="MENU: \n"
			+ "1.Area de un triangulo rectangulo \n"
			+ "2.Perímetro de una circunferencia \n"
			+ "3.Generar numeros al azar(hasta 47) \n"
			+ "0.Salir de la aplicacion";
	

    
    
    do {
    	num=Integer.parseInt(JOptionPane.showInputDialog(menu));
    	
    	
    	if(num==1) {
    		num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de un cateto: "));
    		num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor del segundo cateto: "));
    		resultado=(float)(num1*num2)/2;
    		JOptionPane.showMessageDialog(null, "El resultado es: "+ resultado);
    	
    	}else {
    		if(num==2) {
    			num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el radio: "));
        		resultado= (float) (2*Math.PI*num1);
        		JOptionPane.showMessageDialog(null, "El resultado es: "+ resultado);
    		}else {
    			if(num==3) {
    				do {
    					num1=(int) Math.round(Math.random()*100);
    					System.out.println(num1);
    				}while(num1 != 47);
    				JOptionPane.showMessageDialog(null, "Se ha encontrado el numero 47.");
    	    	
    			}else {
    				if(num==0) {
    					System.exit(0);
    					
    				}else {
    					JOptionPane.showMessageDialog(null, "Se ha producido un error");
    	    	    	
    				}
    			}
    			
    		}
    	}
    }while(num!=0);
	}
}
