package Examen_Java_2018;

public class Ejercicioc {

	public static void main(String[] args) {
		int array[]=new int[20];
		int numaleatorio;
		boolean esprimo=true;
		
		
		for(int i=0;i<array.length;i++) {
			//Comprobar al menos una vez si un numero es primo,y si no lo es repetir hasta que salga uno que lo sea
			do{
				esprimo=true;
				numaleatorio=(int) Math.round(Math.random()*1000);
				for(int j=2;j<numaleatorio;j++) {
					
					if(numaleatorio%j==0 && esprimo==true) {
						esprimo=false;
					}
					
		        }
				
			}while(esprimo==false );
			//Si el numero sale del bucle es porque se cumple que es primo, entonces se le mete a la posicion del array que corresponde
				if(esprimo==true) {
				array[i]=numaleatorio;
				}
			}
			
		//Imprimimos el array
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
			
		}

	}

}
