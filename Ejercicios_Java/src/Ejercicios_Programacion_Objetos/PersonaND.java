package Ejercicios_Programacion_Objetos;

public class PersonaND extends Persona {

	
	private String descripcion;

	public PersonaND() {
		super();
	
	}

	public PersonaND(String nombre, String apellidos, String fechanac,String descripcion) {
		super(nombre, apellidos, fechanac);
		this.descripcion=descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "descripcion:" + descripcion + ", nombre:" + getNombre() + ", Apellidos:"
				+ getApellidos() + ",FechaNacimiento" + getFechanac();
	}

	
	
	
}
