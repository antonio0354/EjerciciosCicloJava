package Ejercicios_Programacion_Objetos;

public class Bach extends Matricula {
 
	private String modalidad;

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public Bach(String modalidad) {
		super();
		this.modalidad = modalidad;
	}

	public Bach() {
		super();
		
	}

	@Override
	public String toString() {
		return "Bach [modalidad=" + modalidad + ", getFecha()=" + getFecha() + ", getCodigo()=" + getCodigo() + "]";
	}
	
	
}
