package ejercicios_Programacion_Objetos_Ahorcado;

public class Ahorcado_palabras {
	String palabras[] = new String[] {"aburrido", "�cido", "alegre", "alto", "amargo", "ancho", "atrevido", "azul", "bajo", "blanco", "blando", "bonito", "buen", "caliente", "capaz", "central", "chungo", "com�n", "conocido", "contento", "corto", "d�bil", "delgado", "derecho", "diferente", "dif�cil", "dulce", "duro", "enfermo", "estrecho", "exterior", "f�cil", "falso", "famoso", "feo", "final", "fresco", "fr�o", "fuerte", "gordo", "grande", "guay", "guapo", "h�medo", "igual", "imposible", "interesante", "interior", "in�til", "izquierdo", "joven", "largo", "lento", "listo", "malo", "masivo", "mayor", "mejor", "menor", "mucho", "muerto", "musical", "nacional", "natural", "negro", "nuevo", "peor", "peque�o", "perfecto", "pobre", "poco", "popular", "posible", "primero", "principal", "pr�ximo", "r�pido", "raro", "real", "recto", "rico", "rojo", "salado", "sano", "seco", "segundo", "simple", "sinverg�enza", "social", "solo", "soso", "t�mido", "tonto", "triste", "�til", "verdadero", "verde", "viejo", "vivo", "crema", "explosi�n", "navaja", "universidad", "llaves", "pap�", "catre", "escuela", "codo", "mapa", "lima", "edificio", "hojas", "granizo", "mano", "m�sica", "habitaci�n", "abuelo", "templo", "plato", "botella", "casa", "planeta", "metal", "mono", "petr�leo", "debate", "ru�do", "herramienta", "anteojos", "zapato", "ojo", "ciente", "diente", "buzo", "puerta", "ensalada", "candidato", "diario", "hierro", "barco", "tecla", "departamento", "hipop�tamo", "�rbol", "discurso", "r�cula", "lentejas", "reloj", "desodorante", "monta�as", "mo�o", "partido", "fiesta", "caf�", "guitarra", "martillo", "lapicera", "letra", "librer�a", "rueda", "camisa", "sill�n", "teclado", "pantalla", "tenedor", "pantalla", "tenedor", "agua", "cohete", "c�sped", "parlante", "pesta�a", "monitor", "hombre", "velero", "palo", "lentes", "nube", "castillo", "libro", "televisor", "tel�fono", "percha", "anillo", "pared", "cartas", "impresora", "luces", "bomba", "bol�grafo", "gobierno", "enano", "persona", "guantes", "proyector", "muela", "remate", "cuaderno", "taladro", "chocolate", "caramelos", "angustia", "lluvia", "corbata", "peri�dico", "planta", "chupete", "oficina", "persiana", "silla", "pradera", "zool�gico", "deporte", "recipiente", "fotograf�a", "ave", "refugio", "pantal�n", "carne", "nieve", "humedad", "pistola", "tristeza", "sof�", "cama", "campera", "coche", "cintur�n", "famoso", "madera", "piso", "malet�n", "diputado", "cuchillo", "candado", "luz", "ordenador", "radio", "cuadro", "calor", "teatro", "bala", "auriculares", "pl�stico", "libro", "aluminio", "agujeta", "sonido", "perro", "pelo", "felicidad", "servilleta", "sol", "estad�stica", "mensaje", "rey", "presidencia", "colegio", "l�mpara", "flor", "tornillo", "abuela", "sat�lite"}; 
	String palabrasnavidad[]=new String[] {"arbol", "turron","nieve","regalos","reyes","frio","polvorones","dulces","belen","burro","pastores"};
	int numAleatoria = (int) Math.round(Math.random()*(palabras.length-1));
	int numAleatorianavidad = (int) Math.round(Math.random()*(palabrasnavidad.length-1));
	
	String palabrabuscada = palabras[numAleatoria];
	
	String palabrabuscadanavidad=palabrasnavidad[numAleatorianavidad];
	
	
	char coincidencias[]=new char[palabrabuscada.length()];
	char coincidenciasNavidad[]=new char[palabrabuscadanavidad.length()];
	public int getNumAleatorianavidad() {
		return numAleatorianavidad;
	}

	public void setNumAleatorianavidad(int numAleatorianavidad) {
		this.numAleatorianavidad = numAleatorianavidad;
	}

	public String getPalabrabuscadanavidad() {
		return palabrabuscadanavidad;
	}

	public void setPalabrabuscadanavidad(String palabrabuscadanavidad) {
		this.palabrabuscadanavidad = palabrabuscadanavidad;
	}

	public char[] getCoincidenciasNavidad() {
		return coincidenciasNavidad;
	}

	public void setCoincidenciasNavidad(char[] coincidenciasNavidad) {
		this.coincidenciasNavidad = coincidenciasNavidad;
	}

	/**
	 * 
	 * @param palabras
	 * @param numAleatoria
	 * @param palabrabuscada
	 * @param coincidencias
	 */
	public Ahorcado_palabras(String[] palabras, int numAleatoria, String palabrabuscada, char[] coincidencias) {
		super();
		this.palabras = palabras;
		this.numAleatoria = numAleatoria;
		this.palabrabuscada = palabrabuscada;
		this.coincidencias = coincidencias;
	}

	/**
	 * 
	 */
	public Ahorcado_palabras() {
		super();
		
	}

	/**
	 * @return the palabras
	 */
	public String[] getPalabras() {
		return palabras;
	}

	/**
	 * @param palabras the palabras to set
	 */
	public void setPalabras(String[] palabras) {
		this.palabras = palabras;
	}

	/**
	 * @return the numAleatoria
	 */
	public int getNumAleatoria() {
		return numAleatoria;
	}

	/**
	 * @param numAleatoria the numAleatoria to set
	 */
	public void setNumAleatoria(int numAleatoria) {
		this.numAleatoria = numAleatoria;
	}

	/**
	 * @return the palabrabuscada
	 */
	public String getPalabrabuscada() {
		return palabrabuscada;
	}

	/**
	 * @param palabrabuscada the palabrabuscada to set
	 */
	public void setPalabrabuscada(String palabrabuscada) {
		this.palabrabuscada = palabrabuscada;
	}

	/**
	 * @return the coincidencias
	 */
	public char[] getCoincidencias() {
		return coincidencias;
	}

	/**
	 * @param coincidencias the coincidencias to set
	 */
	public void setCoincidencias(char[] coincidencias) {
		this.coincidencias = coincidencias;
	}
	
	public String[] getPalabrasnavidad() {
		return palabrasnavidad;
	}

	public void setPalabrasnavidad(String[] palabrasnavidad) {
		this.palabrasnavidad = palabrasnavidad;
	}

	
	
}
