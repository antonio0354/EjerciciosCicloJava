package ejercicios_Programacion_Objetos_Ahorcado;

import javax.swing.JOptionPane;

public class Ahorcado_juego {

	int intentosfallidos=0;
	/**
	 * @return the intentosfallidos
	 */
	public int getIntentosfallidos() {
		return intentosfallidos;
	}

	/**
	 * @param intentosfallidos the intentosfallidos to set
	 */
	public void setIntentosfallidos(int intentosfallidos) {
		this.intentosfallidos = intentosfallidos;
	}

	/**
	 * @param juego the juego to set
	 */
	public static void setJuego(Ahorcado_juego juego) {
		Ahorcado_juego.juego = juego;
	}
	private static Ahorcado_juego juego=null;

	public static Ahorcado_juego getJuego() {
		if(juego==null) {
			juego=new Ahorcado_juego();
		}
		return juego;
	}
	
	public void comenzarJuego() {
		
		Ahorcado_palabras palabra =new Ahorcado_palabras();
		
	
	
	for(int i=0;i<palabra.getCoincidencias().length;i++) {
		palabra.getCoincidencias()[i]='_';
		System.out.print(palabra.getCoincidencias()[i]+" " );
	}
	
	
	String busqueda=" ";
	
	do {
	busqueda=JOptionPane.showInputDialog("Prueba con una palabra o con una letra");
	
	
		System.out.println("\n");
	if(busqueda.equals(palabra.getPalabrabuscada())) {

		
	
	
		System.out.println("Enhorabuena, la palabra era: "+palabra.getPalabrabuscada());
		
	}else {
		
			if(palabra.getPalabrabuscada().contains(busqueda)) {
				for(int i=0;i<palabra.getPalabrabuscada().length();i++) {
					
					
					if(palabra.getPalabrabuscada().charAt(i) == busqueda.charAt(0)) {
						
						
						palabra.getCoincidencias()[i]=busqueda.charAt(0);
					
						
					}
					System.out.print(palabra.getCoincidencias()[i]+" ");
					
				}
				
			}else {
				intentosfallidos++;
				System.out.println("Error");
				System.out.println("nºErrores= "+intentosfallidos);
			}
				
	}
	}while(!(intentosfallidos>=6 || palabra.getPalabrabuscada().equals(busqueda) || coincidenciasRecorridas(palabra.getCoincidencias())==true));
				

			if(coincidenciasRecorridas(palabra.getCoincidencias())== true || palabra.getPalabrabuscada().equals(busqueda) ) {
				System.out.println("Has ganado");
				
			}else {
				System.out.println("Has perdido");
				System.out.println(palabra.getPalabrabuscada());
			}
			
	}
			public static boolean coincidenciasRecorridas (char coincidencias[]) {
				for(int i=0;i<coincidencias.length-1;i++) {
					if(coincidencias[i]=='_') {
						return false;
					}
				}
				return true;
			}
				

}



