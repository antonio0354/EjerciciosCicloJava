package ejercicios_arrays;

import javax.swing.JOptionPane;

public class Ejercicio_4 {

	
	public static final int COLUMNAS = 5;
	public static final int FILAS = 5;
	public static boolean estanegativo = false;
	public static int Matriz[][]= new int[FILAS][COLUMNAS];
	
	public static void main(String[] args) {
	    
		rellena();
		imprimir();
		positivos();
		diagonal();
		diagonalTriangular();
		dispersa();
		unidimensional();
		simetrica();
		traspuesta();
		//opuesta();
		//eliminarFila();
		imprimir();
	}

	public static void rellena() {
		
		for(int i=0;i<FILAS;i++) {
			for(int j=0;j<COLUMNAS;j++) {
				if(i==j) {
					Matriz[i][j]=(int) Math.round(Math.random()*100 -50 );
					
				}else {
					Matriz[i][j]=(int) Math.round(Math.random()*100 -50 );
					
				}
				
				
				
				
				}
			
		}
		
		/*for(int i=0;i<FILAS ;i++) {
			for(int j=0;j<i ;j++) {
				Matriz[i][j]=1;
			}
			
		}
		*/
	}
	
	public static void imprimir() {
		
		for(int i=0;i<FILAS;i++) {
			for(int j=0;j<COLUMNAS;j++) {
				if(Matriz[i][j]>0 ) {
					System.out.print(Matriz[i][j]+"	");
				}else {
					System.out.print(Matriz[i][j]+"	");
				}
					
				
				
				
			}
			System.out.println(" ");
			
		}
		
		
	}
	
	public static void positivos() {
		for(int i=0;i<FILAS;i++) {
			for(int j=0;j<COLUMNAS;j++) {
				if(Matriz[i][j]<0) {
				estanegativo=true;
					
				}
			}
			
		}

		if(estanegativo==false) {
			System.out.println("La matriz es positiva");
			
		}
	}
	
	public static void diagonal() {
		boolean esDiagonal = true;
		
		for(int i=0;i<FILAS && esDiagonal==true;i++) {
			for(int j=0;j<COLUMNAS && esDiagonal==true;j++) {
				if(i==j) {
					if(Matriz[i][j]==0) {
						esDiagonal=false;
						
					}
					
					
				}else {
					if(Matriz[i][j]!=0) {
						esDiagonal = false;
						
					}
					
				}
			}
			
		}
		
		if(esDiagonal == true) {
			System.out.println("La matriz es Diagonal");
		}else {
			System.out.println("La matriz no es diagonal");
		}
		
	}
	
	public static void diagonalTriangular() {
		boolean esDiagonal = true;

		for(int i=0;i<FILAS && esDiagonal==true;i++) {
			for(int j=0;j<i && esDiagonal==true;j++) {
				if(Matriz[i][j]!=0) {
					esDiagonal = false;
					
				}
			}
			
		}
		
		if(esDiagonal == true) {
			System.out.println("Si es triangular superior");
			
		}else {
			System.out.println("No es triangular superior");
			
		}
		
		
		
	}
	
	public static void dispersa() {
		boolean esdispersa=false;
		for(int i=0;i<FILAS;i++) {
			for(int j=0;j<COLUMNAS && esdispersa==false;j++) {
				if(Matriz[i][j]==0) {
					esdispersa=true;
					
				}
			}
			
		}
		
		for(int i=0;i<COLUMNAS;i++) {
			for(int j=0;j<FILAS && esdispersa==false;j++) {
				if(Matriz[j][i]==0) {
					esdispersa=true;
					
				}
			}
			
		}
		
		if(esdispersa==true) {
			System.out.println("La matriz es dispersa");
		}else {
			System.out.println("La matriz no es dispersa");
		}
		
	}
	
	public static void unidimensional() {
		int ArrayUni[]= new int[FILAS*COLUMNAS];
		
		int i=0;
		for(int k=0;k<FILAS;k++) {
			for(int j=0;j<COLUMNAS;j++) {
				
					ArrayUni[i]=Matriz[k][j];
					
				i++;
				
			}
			
		}
		
		for(int k=0;k<ArrayUni.length;k++) {
			System.out.print(ArrayUni[k]+" ");
			
		}
		
	}
	
	
	public static void simetrica() {
		System.out.println(" ");
		boolean simetrica = true;
		
		for (int i = 0; i < Matriz.length; i++) {
			for (int j = 0; j < Matriz[i].length; j++) {
				if (Matriz[i][j] != Matriz[j][i])
					simetrica = false;
			}
		}
		
		if(simetrica==true) {
			System.out.println("la matriz es simetrica");
			
		}else {
			System.out.println("la matriz no es simetrica");
		}
	}
	
	public static void traspuesta() {
		int aux;

			for(int i=0;i<FILAS;i++) {
				for(int j=0;j<i;j++) {
					aux=Matriz[j][i];
					Matriz[j][i]=Matriz[i][j];
					Matriz[i][j]=aux;
				}
				
				
				
				
				
			}
			System.out.println(" ");
			
		
	}
	
	
	public static void opuesta() {
		
			for(int i=0;i<FILAS;i++) {
				for(int j=0;j<COLUMNAS;j++) {
					if(i==j) {
						Matriz[i][j]=Matriz[i][j]-2*Matriz[i][j];
						
					}else {
						Matriz[i][j]=Matriz[i][j]-2*Matriz[i][j];
					}
					
					
					
					
					}
				
			}
	}
		
		public static void eliminarFila() {
			int num=0;
			int filaBorrada=Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero de la fila a borrar: "));
			
			int Matriz2[][]=new int[FILAS-1][COLUMNAS];
			
			for(int i=0;i<FILAS-1;i++) {
				for(int j=0;j<COLUMNAS;j++) {
					
					if(i==filaBorrada) {
						num=1;
						Matriz2[i][j]=Matriz[i+num][j];
					}
					
						Matriz2[i][j]=Matriz[i+num][j];
					
					

					
					}
				
			}
			
			for(int i=0;i<FILAS-1;i++) {
				for(int j=0;j<COLUMNAS;j++) {
		
				  System.out.print(Matriz2[i][j]+"	");
		
				}
				System.out.println(" ");
				
			}
			
			
			
	}
	
	
	
}
