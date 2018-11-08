package Ejercicios_Programacion_Objetos;

public class PersonaND extends Persona {

	
	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public PersonaND(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public PersonaND() {
		super();
		
	}

	@Override
	public String toString() {
		return "PersonaND [descripcion=" + descripcion + ", getNombre()=" + getNombre() + ", getApellidos()="
				+ getApellidos() + ", getFechanac()=" + getFechanac() + "]";
	}
	
}
