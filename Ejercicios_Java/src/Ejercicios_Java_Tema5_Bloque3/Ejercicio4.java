package Ejercicios_Java_Tema5_Bloque3;

public class Ejercicio4 {

	public static void main(String[] args) {
		int array[]=new int[7];
		int auxiliar,pivote;
		
		for(int i=0;i<array.length;i++) {
			array[i]=(int) Math.round(Math.random()*10);
			System.out.print(array[i]+" ");
			
		}
		pivote=array[array.length-1];
		System.out.println("Pivote: "+pivote);
		for(int i=0,j=(array.length-2);i!=j;) {
			if(array[i]>pivote && array[j]<pivote) {
				auxiliar=array[i];
				array[i]=array[j];
				array[j]=auxiliar;
				
				i++;
				j--;
			}
			
			
			while(array[i]<pivote && array[j]<pivote) {
				i++;
				
			}
			
			while(array[j]>pivote && array[i]<pivote) {
				j--;
				
			}
			
			if(i==j) {
				auxiliar=array[array.length-1];
				array[array.length-1]=array[i];
				array[i]=auxiliar;
				
				for(int k=0;k<i;k++) {
					for(int x=k+1;x<i;x++){
						if(array[x]<array[k]) {
							auxiliar=array[k];
							array[k]=array[x];
							array[x]=auxiliar;
							
						}
						
					}
					
					
				}
				
				for(int l=i+1;l<array.length;l++) {
					for(int x=l+1;l<array.length;l++) {
						if(array[x]<array[l]) {
							auxiliar=array[l];
							array[l]=array[x];
							array[x]=auxiliar;
							
						}
						
					}
					
					
				}
				
			}
			
		}
		
		
		
		
		
		
		for(int i=0;i<array.length;i++) {
			
			System.out.print(array[i]+" ");
			
		}
		
		

	}
}


