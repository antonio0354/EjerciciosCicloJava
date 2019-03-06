package ejercicio_excepciones;

import java.util.Scanner;

public class PeticionNumero {

	public static void main(String[] args) {
		System.out.println("Introduzca numero:");
		
		int num;
		try {
			num = pedirNumeroPar();
			System.out.println("El numero del usuario: "+num);

		} catch (NumeroImparException e) {
			System.out.println("Numero impar introducido");
		}
		

	}
	
	public static int pedirNumeroPar() throws NumeroImparException{
		Scanner sc = new Scanner(System.in);
		
		int numUsuario =sc.nextInt();
		
		if(numUsuario % 2==1) {
			throw new NumeroImparException();
		}
		
		return numUsuario;
	}

}
