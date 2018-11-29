package ejercicios_Programacion_Objetos_Ahorcado;

public class Ahorcado_palabras {
	String palabras[]=new String[]{"padre","madre","hijo","hija","hojo"};
	
	int numAleatoria = (int) Math.round(Math.random()*(palabras.length-1));
	
	String palabrabuscada = palabras[numAleatoria];
	
	char coincidencias[]=new char[palabrabuscada.length()];

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
	
	
}
