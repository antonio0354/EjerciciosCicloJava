package ejercicios_listener;

public class Ejercicio1Event {

	String palabra;

	/**
	 * @return the palabra
	 */
	public String getPalabra() {
		return palabra;
	}

	/**
	 * @param palabra the palabra to set
	 */
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	/**
	 * @param palabra
	 */
	public Ejercicio1Event(String palabra) {
		super();
		this.palabra = palabra;
	}
	
}
