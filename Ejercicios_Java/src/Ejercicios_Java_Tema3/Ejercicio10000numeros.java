package Ejercicios_Java_Tema3;

public class Ejercicio10000numeros {

	public static void main(String[] args) {
	int suma=0,media=0,numAleatorio;
	float desviacionTipica=0;
	
	for(int i=0;i<10000;i++) {
		numAleatorio=(int) Math.round(Math.random()*1000);
		suma+=numAleatorio;
		
		
	}
	media=suma/10000;
	System.out.println("La suma es "+suma+"\nLa media es "+media);
	

	}

}
