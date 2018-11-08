package Ejercicios_Programacion_Objetos;

public class Joya extends Tienda_Antiguedades {
	
	private String material;

	public Joya() {
		super();
		
	}

	public Joya(int anyofabricaion, String origen, float precio, String material) {
		super(anyofabricaion, origen, precio);
		this.material=material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
	
	
	                
	
	
}   
