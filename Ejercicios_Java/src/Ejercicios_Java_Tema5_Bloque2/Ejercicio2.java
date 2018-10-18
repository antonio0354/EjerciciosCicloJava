package Ejercicios_Java_Tema5_Bloque2;

import java.lang.reflect.Array;

public class Ejercicio2 {

	public static void main(String[] args) {
		int array1[]= new int[5];
		int array2[]=new int[5];
		int array3[]=new int[5];
		
		for(int i=0;i<array1.length;i++) {
			array1[i]=(int) Math.round(Math.random()*100);
			System.out.println("Array1 puesto "+i+"="+array1[i]);
			if(i%2!=0) {
				array3[i]=array1[i];
				
			}
		}
		for(int i=0;i<array2.length;i++) {
			array2[i]=(int) Math.round(Math.random()*100);
			System.out.println("Array2 puesto "+i+"="+array2[i]);
			if(i%2==0) {
				array3[i]=array2[i];
				
			}
		}
		for(int i=0;i<array3.length;i++) {
			System.out.println("Array3 puesto "+i+"="+array3[i]);
			
		}
	
	}

}
