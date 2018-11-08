package Ejercicios_Programacion_Objetos;

public class PersonaD extends Persona {

	private String dni;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public PersonaD() {
		super();

	}

	public PersonaD(String dni) {
		super();
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "PersonaD [dni=" + dni + ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos()
				+ ", getFechanac()=" + getFechanac() + "]";
	}

	
	
}
