package ejercicios_arrays;

public class Ejercicio_1 {

	
	
	
	public static void main(String[] args) {
		
		int array[]=new int[5];
		
		creaarray(array);
			
	}
	
	private static void creaarray (int array[]) {
		
		
		
		for(int i=0;i<array.length;i++) {
			array[i]=(int) Math.round(Math.random()*100);
			System.out.print(array[i]+"	");
		}
		
		System.out.println(" ");
		if(array.length % 2 ==0) {
			System.out.println("-1");
			
		}else {
			System.out.print(array[array.length/2]);
			}
		
		}
	
	
		
		
	
		
	}
