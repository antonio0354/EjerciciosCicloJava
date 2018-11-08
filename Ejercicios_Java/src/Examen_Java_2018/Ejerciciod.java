package Examen_Java_2018;

public class Ejerciciod {

	public static void main(String[] args) {
		int array[]=new int[100];
		 //Rellenamos el array con 0 y lo imprimimos
		for(int i=0;i<array.length;i++) {
			array[i]=0;
			System.out.print(array[i]+" ");
			}
		
		//Metemos 10 veces el valor 1 en el puesto aleatorio desde el 0 hasta el 100
		for(int i=0;i<10;i++) {
			array[(int) Math.round(Math.random()*100)]=1;
			
		}
		
		//Volvemos a imprimir el array
		for(int i=0;i<array.length;i++) {
		
			System.out.print(array[i]+" ");
			}
	}

}
