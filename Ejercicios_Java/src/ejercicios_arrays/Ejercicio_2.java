package ejercicios_arrays;

public class Ejercicio_2 {

	public static void main(String[] args) {
	
		int array[]=new int[20];
		int contadorAprobados=0,contadorSuspensos=0;

		for(int i=0;i<array.length;i++) {
			array[i]=(int) Math.round(Math.random()*10);
			System.out.print(array[i]+" ");
		}
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<5) {
				contadorSuspensos++;
				
			}else {
				contadorAprobados++;
				
			}
			
			
		}
		System.out.println(" ");
		
		System.out.println("el numero de aprobados es: "+ (float)(contadorAprobados *100/array.length)+"% , y el numero de suspensos es: "+
				(float)(contadorSuspensos *100/array.length)+"%");
		
	}

}
