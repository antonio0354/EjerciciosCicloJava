package Ejercicios_Programacion_Objetos;

public class Persona {

	private String nombre;
	private String apellidos;
	private String fechanac;
	
	
	public Persona() {
		super();
		
	}


	public Persona(String nombre, String apellidos, String fechanac) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechanac = fechanac;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getFechanac() {
		return fechanac;
	}


	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}
	
	
	
	
	
	
}
