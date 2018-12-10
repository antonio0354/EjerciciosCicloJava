package ejercicios_Programacion_Objetos_Ahorcado;

import javax.swing.JOptionPane;

public class Ahorcado_juego {

	//intentosfallidos para los fallos y el contador para el modo navidad
	int intentosfallidos=0;
	int cont=0;
	
	//getters y setters
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

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
			System.out.print(palabra.getCoincidencias()[i]+" ");
			
			
		}
	
		for(int i=0;i<palabra.getCoincidenciasNavidad().length;i++) {
			palabra.getCoincidenciasNavidad()[i]='_';
			
			
		}
	
	
	
	//pedimos al usuario que tipo de modo quiere
	String modo=" ";
	String busqueda=" ";
	modo=JOptionPane.showInputDialog("Introduce si quieres el modo inmortal o el modo navidad(por defecto ser� el modo normal)");
	
	//modo inmortal, no hay fallos
	if(modo.equals("inmortal")) {
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
						
						System.out.println("Prueba de nuevo");
						
						}
					
				}
			
			
			
		Ahorcado_ventana.getventana().repaint();
		}while(!(intentosfallidos>=6 || palabra.getPalabrabuscada().equals(busqueda) || coincidenciasRecorridas(palabra.getCoincidencias())==true));
		
		if(coincidenciasRecorridas(palabra.getCoincidencias())== true || palabra.getPalabrabuscada().equals(busqueda) ) {
			System.out.println("Has ganado");
			
		}else {
			System.out.println("Has perdido");
			System.out.println(palabra.getPalabrabuscada());
		}
		
	}else {
		//modo de navidad, cambia las palabras a la estetica de navidad y el fondo de la imagen
		if(modo.equals("navidad")) {
			//contador para que se cambie la foto de fondo
			cont=1;
			
			
			Ahorcado_ventana.getventana().repaint();
			do {
				
				busqueda=JOptionPane.showInputDialog("Prueba con una palabra o con una letra");
			
			
				System.out.println("\n");
				
				if(busqueda.equals("navidad")) {
					intentosfallidos=0;
					cont=1;
					
				}else {
					
					if(busqueda.equals(palabra.getPalabrabuscadanavidad())) {

				
			
			
				System.out.println("Enhorabuena, la palabra era: "+palabra.getPalabrabuscadanavidad());
				
					}else {
						
						if(palabra.getPalabrabuscadanavidad().contains(busqueda)) {
							for(int i=0;i<palabra.getPalabrabuscadanavidad().length();i++) {
							
							
								if(palabra.getPalabrabuscadanavidad().charAt(i) == busqueda.charAt(0)) {
								
								
								palabra.getCoincidenciasNavidad()[i]=busqueda.charAt(0);
							
								
							}
							System.out.print(palabra.getCoincidenciasNavidad()[i]+" ");
							
						}
						
						}else {
						intentosfallidos++;
						System.out.println("Error");
						System.out.println("nºErrores= "+intentosfallidos);
						}
						
					}
				
				}
				
			Ahorcado_ventana.getventana().repaint();
			}while(!(intentosfallidos>=6 || palabra.getPalabrabuscadanavidad().equals(busqueda) || coincidenciasRecorridas(palabra.getCoincidenciasNavidad())==true));
			
			if(coincidenciasRecorridasNavidad (palabra.getCoincidenciasNavidad())== true || palabra.getPalabrabuscadanavidad().equals(busqueda)) {
				System.out.println("Has ganado");
				
			
			
		}else {
			if(coincidenciasRecorridasNavidad (palabra.getCoincidenciasNavidad())== false || !palabra.getPalabrabuscadanavidad().equals(busqueda)) {
			System.out.println("Has perdido");
			System.out.println(palabra.getPalabrabuscadanavidad());
			}
		}
		}else {
	//si no se introduce ni navidad ni inmortal, se inicia el modo normal
	do {
		
		
		busqueda=JOptionPane.showInputDialog("Prueba con una palabra o con una letra");
	
	
		System.out.println("\n");
		
		if(busqueda.equals("navidad")) {
			intentosfallidos=0;
			cont=1;
			
		}else {
			
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
		
		}
		
	Ahorcado_ventana.getventana().repaint();
	}while(!(intentosfallidos>=6 || palabra.getPalabrabuscada().equals(busqueda) || coincidenciasRecorridas(palabra.getCoincidencias())==true));
	
	if(coincidenciasRecorridas(palabra.getCoincidencias())== true || palabra.getPalabrabuscada().equals(busqueda) ) {
		System.out.println("Has ganado");
		
	}else {
		System.out.println("Has perdido");
		System.out.println(palabra.getPalabrabuscada());
	}
	
	}
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
			
			public static boolean coincidenciasRecorridasNavidad (char coincidencias[]) {
				for(int i=0;i<coincidencias.length-1;i++) {
					if(coincidencias[i]=='_') {
						return false;
					}
				}
				return true;
			}
				

}



