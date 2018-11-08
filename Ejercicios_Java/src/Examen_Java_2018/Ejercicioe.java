package Examen_Java_2018;

public class Ejercicioe {

	public static void main(String[] args) {
		int array[]=new int[20];
		//Introducimos el valor 1 en los dos primeros puestos de la serie
		array[0]=1;
		array[1]=1;
		
		//Imprimimos los dos primeros valores de la serie
		System.out.print("Serie de Fibonacci: "+array[0]+" "+array[1]+" ");
		
		//Introducimos los demas valores de la serie teniendo en cuenta siempre los dos ultimos al numero requerido
		for(int i=2;i<array.length;i++) {
			array[i]=array[i-2]+array[i-1];
			System.out.print(array[i]+" ");
			
			
		}

	}

}
