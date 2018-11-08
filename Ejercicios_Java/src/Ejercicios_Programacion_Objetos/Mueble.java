package Ejercicios_Programacion_Objetos;

public class Mueble extends Tienda_Antiguedades {
	 private String epoca;

	public Mueble() {
		super();
		this.epoca="Sin especificar";
	}

	public Mueble(int anyofabricaion, String origen, float precio, String epoca) {
		super(anyofabricaion, origen, precio);
		this.epoca=epoca;
	
	}

	public String getEpoca() {
		return epoca;
	}

	public void setEpoca(String epoca) {
		this.epoca = epoca;
	}

	
	
	
}
