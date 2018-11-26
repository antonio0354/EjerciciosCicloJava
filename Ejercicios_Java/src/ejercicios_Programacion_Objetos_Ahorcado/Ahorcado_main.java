package ejercicios_Programacion_Objetos_Ahorcado;

import javax.swing.JOptionPane;

public class Ahorcado_main {

	public static void main(String[] args) {
		String palabras[]=new String[]{"padre","madre","hijo","hija","hojo"};
		String fallos[]=new String[] {"cabeza","cuerpo","piernaDer","piernaIzq","brazoDer","brazoIzq"};
		int intentosfallidos=0;
		int numAleatoria = (int) Math.round(Math.random()*(palabras.length-1));
		String palabrabuscada = palabras[numAleatoria];
		System.out.println(palabras[numAleatoria]);
		int cont=0;
		
		char coincidencias[]=new char[palabras.length];
		
		for(int i=0;i<coincidencias.length-1;i++) {
			coincidencias[i]='_';
			System.out.print(coincidencias[i]+ " ");
		}
		
		
		String busqueda=" ";
		
		busqueda=JOptionPane.showInputDialog("Prueba con una palabra o con una letra");
		
		
		System.out.println("\n");
		if(busqueda.equals(palabrabuscada)) {for(int i=0;i<palabras[numAleatoria].length();i++) {
			palabras[numAleatoria].replace("_ ", busqueda);
			
		
		}
			System.out.println("Enhorabuena, la palabra era: "+palabras[numAleatoria]);
			
		}else {
			
				
					
					for(int i=0;i<palabrabuscada.length();i++) {
						char letraUsu = busqueda.charAt(0);
						boolean esta=false;
						if(letraUsu == palabrabuscada.charAt(i)) {
							
							esta=true;
							coincidencias[i]=letraUsu;
							cont++;
							
						}else if(esta==false){
							intentosfallidos++;
							
						}
						
					}
				
					
					
				
				
				
				
				
			
			
			
		}
		
		for(int i=0;i<coincidencias.length;i++) {
			System.out.print(coincidencias[i]+ " ");
		}
		
	}
	
	
	

}
