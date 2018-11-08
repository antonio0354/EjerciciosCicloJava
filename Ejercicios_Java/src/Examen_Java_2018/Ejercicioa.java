package Examen_Java_2018;

public class Ejercicioa {

	public static void main(String[] args) {
		int array[]=new int[100];
		int suma=0,media,menor,mayor;
		
		//Introducir el primer elemento del array como el menor y el mayor para comparar
		array[0]=(int) Math.round(Math.random()*1000);
		mayor=array[0];
		menor=array[0];
		
		//Rellenamos el array con numeros aleatorios desde el 0 al 1000
		for(int i=0;i<array.length-1;i++) {
			array[i]=(int) Math.round(Math.random()*1000);
			System.out.print(array[i]+" ");
			//Sumamos cada elemento del array en la variable suma
			suma+=array[i];
			//Comparar el numero del array con el menor para ver si es el menor
			if(array[i]<menor) {
				menor=array[i];
				
				
			}
			//Comparar el numero del array con el mayor para ver si es el mayor
			
			if(array[i]>mayor) {
				mayor=array[i];
				
			}
			
		}
		//Calcular la media
		media=suma/array.length;
		
		//Imprimir los resultados
		System.out.println("\nLa suma es: "+suma);
		System.out.println("\nLa media es: "+media);
		System.out.println("\nEl mayor es: "+mayor);
		System.out.println("\nEl menor es: "+menor);
		
	}

}
