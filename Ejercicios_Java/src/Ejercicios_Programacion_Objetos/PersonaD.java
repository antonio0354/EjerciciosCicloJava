package Ejercicios_Programacion_Objetos;

public class PersonaD extends Persona {

	private String dni;

	public PersonaD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonaD(String nombre, String apellidos, String fechanac,String dni) {
		super(nombre, apellidos, fechanac);
		this.dni=dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "dni=" + dni + ", Nombre=" + getNombre() + ", Apellidos=" + getApellidos()
				+ ", Fechanac=" + getFechanac();
	}


}
