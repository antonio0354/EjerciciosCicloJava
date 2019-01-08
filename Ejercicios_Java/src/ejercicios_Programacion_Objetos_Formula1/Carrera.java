package ejercicios_Programacion_Objetos_Formula1;

public class Carrera {
	
	// Necesito un array de elementos de tipo "Vehiculo", deben ser 5
	private Vehiculo vehiculos[] = new Vehiculo[5];
	private Pista pistas[] = new Pista[4];

	/**
	 * Constructor
	 */
	public Carrera() {
		super();
		// Inicialización de los vehículos
		vehiculos[0] = new Coche("Bertha Benz", "ff7c7c");
		vehiculos[1] = new Moto("Dani Pedrosa", "ffe97c");
		vehiculos[2] = new Coche("Fernando Alonso", "82ff7c");
		vehiculos[3] = new Coche("María de Villota", "8effd9");
		vehiculos[4] = new Moto("Ana Carrasco", "d18eff");
		
		//inicializacion de las pistas
		for(int i=0;i<pistas.length;i++) {
			pistas[i]= new Pista();
			
		}
		
	}
	
	public void turnos () {
		int longitud=500;
		boolean terminado = false;
		int contadorPodium=0;
		
		//generar la carrera por turnos
		do {
			for (int i=0;i<vehiculos.length ;i++) {
				
				if(vehiculos[i].ganador==false) {
					vehiculos[i].avanza();
					System.out.println(vehiculos[i].nombre + " avanza a la posicion: "+ vehiculos[i].x);
				
					
					//si el vehiculo ha llegado a la meta
					if(vehiculos[i].x >= longitud) {
						
						vehiculos[i].ganador = true;
						
						contadorPodium++;
						vehiculos[i].podium=contadorPodium;
						
					}
					
					
					
				}
				
				
				// si todos han terminado la carrera
				
				if((vehiculos[0].ganador==true && vehiculos[1].ganador==true && vehiculos[2].ganador==true && vehiculos[3].ganador==true && vehiculos[4].ganador==true)) {
					terminado = true;
					
				}
			}
			System.out.println(" ");
		}while(!terminado);
		
		
		//imprimir el podium
		for(int i=0; i< vehiculos.length;i++) {
			if(vehiculos[i].ganador==true) {
				System.out.println("\n"+vehiculos[i].nombre +" ha terminado la carrera en el "+vehiculos[i].podium+ " lugar");
			}
			
		}
		
		
		
	}
	
	
}
