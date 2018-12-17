package examen_programacion_recuperacion;


public class CampoBatalla {

	Malvado malvados[]=new Malvado[20];
	Humano humanos[]=new Humano[20];
	private String nombre;
	
	// Singleton
	private static CampoBatalla campo = null;
	
	public static CampoBatalla getCampo () {
		if (campo == null) {
			campo = new CampoBatalla();
		}
		return campo;
	}
	
	/*
	 * 
	 *
	 */
	public CampoBatalla() {
		//Inicializa el campo con los  humanos y malvados
		nombre="La Batalla por la Tierra";
		System.out.println(nombre);
		int ptosVida;
		for(int i=0;i<malvados.length-1;i++) {
			ptosVida=(int) Math.round(Math.random()*50+50);
			malvados[i]=new Malvado(ptosVida,"Malvado"+(i+1),true,0);
		}
		int ptosVidax2=(int) Math.round(Math.random()*50+50);
		malvados[malvados.length-1]=new Malvado(ptosVidax2*2,"Malvado"+malvados.length,true,0);
		
		for(int i=0;i<malvados.length-1;i++) {
			ptosVida=(int) Math.round(Math.random()*50+50);
			humanos[i]=new Humano(ptosVida,"Humano"+(i+1),true,0);
			
		}
		int ptosVidax2Humano=(int) Math.round(Math.random()*50+50);
		humanos[humanos.length-1]=new Humano(ptosVidax2Humano*2,"Humano"+humanos.length,true,0);
		
		
		
	}
	
	/*
	 * 
	 *
	 */
	public void mezclarMalvados() {
		//metodo que mezcla malvados
		for (int i = 0; i < 100; i++) {
			int indice1 = (int) Math.round(Math.random() * (malvados.length-1));
			int indice2 = (int) Math.round(Math.random() * (malvados.length-1));
			
			Malvado aux = malvados[indice1];
			malvados[indice1] = malvados[indice2];
			malvados[indice2] = aux;
		}
		
		
	}
	/*
	 * 
	 *
	 */
	public void imprimirMalvados() {
		//metodo que imprime malvados
		System.out.println("Malvados:");
		for(int i=0;i<malvados.length;i++) {
			System.out.println(malvados[i]);
			
		}
		
	}
	
	/*
	 * 
	 *
	 */
	public void mezclarHumanos() {
		//metodo que mezcla humanos
		for (int i = 0; i < 100; i++) {
			int indice1 = (int) Math.round(Math.random() * (humanos.length-1));
			int indice2 = (int) Math.round(Math.random() * (humanos.length-1));
			
			Humano aux = humanos[indice1];
			humanos[indice1] = humanos[indice2];
			humanos[indice2] = aux;
		}
		
		
	}
	
	/*
	 * 
	 *
	 */
	public void imprimirHumanos() {
		//metodo que imprime humanos
		System.out.println("Humanos:");
		for(int i=0;i<humanos.length;i++) {
			System.out.println(humanos[i]);
			
		}
		
	}
	/*
	 * 
	 *
	 */
	public void accionDisparar() {
		//metodo que organiza todos los disparos de la pelea
		System.out.println("Comienza la pelea");
		int contadorMuertosHumanos=0;
		int contadorMuertosMalvados=0;
		do {
			//bucle en la que el humano dispara
			boolean tocaHumano=true;
			System.out.println(" ");
			for(int i=0;i<humanos.length && tocaHumano==true;i++) {
				if(humanos[i].isVivo()==true) {
					boolean haDisparado=false;
					int disparoHumano=(int) Math.round(Math.random()*20+5);
					for(int j=0;j<malvados.length && haDisparado==false;j++) {
						if(malvados[j].isVivo()==true) {
							haDisparado=true;
							malvados[j].setPtosVida(malvados[j].getPtosVida()-disparoHumano);
							System.out.println("El "+humanos[i].getNombre()+" ha disparado a "+malvados[j].getNombre());
							malvados[j].setDisparos(malvados[j].getDisparos()+1);
							if(malvados[j].getPtosVida()<=0) {
								malvados[j].setVivo(false);
								contadorMuertosMalvados++;
								System.out.println("--Ha muerto el "+malvados[j].getNombre()+"--");
							}
							tocaHumano=false;;
							
						}
						
					}
					
				}
				
			}
			
			//bucle en la que el malvado dispara
			boolean tocaMalvado=true;
			System.out.println(" ");
			for(int i=0;i<malvados.length && tocaMalvado==true;i++) {
				if(malvados[i].isVivo()==true) {
					boolean haDisparado=false;
					int disparoMalvado=(int) Math.round(Math.random()*20+5);
					for(int j=0;j<humanos.length && haDisparado==false;j++) {
						if(humanos[j].isVivo()==true) {
							haDisparado=true;
							humanos[j].setPtosVida(humanos[j].getPtosVida()-disparoMalvado);
							System.out.println("El "+malvados[i].getNombre()+" ha disparado a "+humanos[j].getNombre());
							humanos[j].setDisparos(humanos[j].getDisparos()+1);
							if(humanos[j].getPtosVida()<=0) {
								humanos[j].setVivo(false);
								contadorMuertosHumanos++;
								System.out.println("--Ha muerto el "+humanos[j].getNombre()+"--");
							}
							tocaMalvado=false;
						}
						
					}
					
				}
				
			}
			
			
		}while(!(contadorMuertosHumanos==humanos.length || contadorMuertosMalvados==malvados.length));
		
		//cuando termina la pelea, imprimir el ganador
		System.out.println(" ");
		if(contadorMuertosHumanos==humanos.length) {
			System.out.println("Han ganado los malvados");
			
		}else {
			if(contadorMuertosMalvados==malvados.length)
			System.out.println("Han ganado los humanos");
			
		}
		
		
		
	}
	
	public void contarDisparos(){
		//metodo que cuenta disparos
		System.out.println("\n"+"Recuento");
		//contar todos los disparos que ha recibido cada humano
		for(int i=0;i<humanos.length;i++) {
			System.out.println("El "+humanos[i].getNombre()+" ha recibido "+humanos[i].getDisparos()+"disparos");
			System.out.println(" ");
			
		}
		//contar todos los disparos que ha recibido cada malvado
		for(int i=0;i<malvados.length;i++) {
			System.out.println("El "+malvados[i].getNombre()+" ha recibido "+malvados[i].getDisparos()+"disparos");
			System.out.println(" ");
			
		}
		
		//ordenación del array humanos segun los disparos 
		for (int i = humanos.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (humanos[j].getDisparos() > humanos[j+1].getDisparos()) {
					Humano aux = humanos[j];
					humanos[j] = humanos[j+1];
					humanos [j+1] = aux;
				}
			}
		}
		System.out.println("Recuento (el mas facil de abatir y el mas dificil de abatir):");
		//impresión del humano que mas disparos ha recibido y el que menos ha recibido
		System.out.println("El humano que mas disparos ha recibido es "+humanos[humanos.length-1].getNombre()
				+" con "+humanos[humanos.length-1].getDisparos()+"\n");
		System.out.println("El humano que menos disparos ha recibido es "+humanos[0].getNombre()
				+" con "+humanos[0].getDisparos()+"\n");
		
		//ordenación del array malvados segun los disparos
		for (int i = malvados.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (malvados[j].getDisparos() > malvados[j+1].getDisparos()) {
					Malvado aux = malvados[j];
					malvados[j] = malvados[j+1];
					malvados [j+1] = aux;
				}
			}
		}
		//impresión del malvado que mas disparos ha recibido y el que menos ha recibido
		System.out.println("El malvado que mas disparos ha recibido es "+malvados[humanos.length-1].getNombre()
				+" con "+malvados[humanos.length-1].getDisparos()+"\n");
		System.out.println("El malvado que menos disparos ha recibido es "+malvados[0].getNombre()
				+" con "+malvados[0].getDisparos());
		
		
	}
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
}
