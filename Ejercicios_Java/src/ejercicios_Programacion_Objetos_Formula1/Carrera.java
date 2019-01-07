package ejercicios_Programacion_Objetos_Formula1;

public class Carrera {
	
	// Necesito un array de elementos de tipo "Vehiculo", deben ser 5
	private Vehiculo vehiculos[] = new Vehiculo[5];

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
	}
	
	public void turnos () {
		int longitud=500;
		boolean terminado = false;
		int contadorPodium=0;
		do {
			for (int i=0;i<vehiculos.length ;i++) {
				vehiculos[i].avanza();
				System.out.println(vehiculos[i].nombre + " avanza a la posicion: "+ vehiculos[i].x);
				if(vehiculos[i].x >= longitud) {
					
					vehiculos[i].ganador = true;
					terminado = true;
					contadorPodium++;
					vehiculos[i].podium=contadorPodium;
					
				}
			}
			System.out.println(" ");
		}while(!terminado);
		
		for(int i=0; i< vehiculos.length;i++) {
			if(vehiculos[i].ganador==true) {
				System.out.println("\n"+vehiculos[i].nombre +" ha ganado la carrera en el "+vehiculos[i].podium+ " lugar");
			}
			
		}
		
		
		
	}
	
	
}
