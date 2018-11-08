package Ejercicios_Programacion_Objetos;

public class Tienda_Antiguedades {

	private int anyofabricaion;
	private String origen;
	private float precio;
	
	
	
	
	
	public Tienda_Antiguedades() {
		super();
		System.out.println("Muy antiguo");
		
	}

	public Tienda_Antiguedades(int anyofabricaion, String origen, float precio) {
		super();
		this.anyofabricaion = anyofabricaion;
		this.origen = origen;
		this.precio = precio;
	}

	public int getAnyofabricaion() {
		return anyofabricaion;
	}

	public void setAnyofabricaion(int anyofabricaion) {
		this.anyofabricaion = anyofabricaion;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
