package Ejercicios_Java_Tema3;

import javax.swing.JOptionPane;

public class JuegoParesoNones {

	public static void main(String[] args) {
		int contadorUsuario=0,contadorOrdenador=0;
		int numeroAleatoriomanDerecha,numeroAleatoriomanIzquierda;
		int pedirnumeromanDerecha,pedirnumeromanIzquierda,suma=0;
		int elegir;
		int resultado;
		for(int i=0;i<5 && (contadorUsuario<3 && contadorOrdenador<3);i++){
			
			numeroAleatoriomanDerecha=(int) Math.round(Math.random()*5);
			//System.out.println(numeroAleatoriomanDerecha);
			numeroAleatoriomanIzquierda=(int) Math.round(Math.random()*5);
			//System.out.println(numeroAleatoriomanIzquierda);
			elegir=Integer.parseInt(JOptionPane.showInputDialog("Elige pares(0) o nones(1): "));
			pedirnumeromanDerecha=Integer.parseInt(JOptionPane.showInputDialog(" Introduce un numero del 0 al 5:"));
			pedirnumeromanIzquierda=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero del 0 al 5: "));
			suma=pedirnumeromanDerecha+pedirnumeromanIzquierda+numeroAleatoriomanDerecha+numeroAleatoriomanIzquierda;
				if(suma%2==0) {
				resultado=0;
				
					}else {
						resultado=1;
					}
		
		if (resultado==elegir) {
			JOptionPane.showMessageDialog(null, "Has ganado esta mano");
			contadorUsuario++;
			
		}else {
			JOptionPane.showMessageDialog(null, "Has perdido esta mano");
			contadorOrdenador++;
		}
		
		
	}

		if(contadorUsuario==3) {
			JOptionPane.showMessageDialog(null, "Has ganado esta partida");
			
		}else {
			JOptionPane.showMessageDialog(null, "Has perdido esta partida");
		}

	}

}
