package Ejercicios_Programacion_Objetos;

public class Bach extends Matricula {

	private String modalidad;

	public Bach() {
		super();
		
	}

	public Bach(String fecha, String codigo,String modalidad) {
		super(fecha, codigo);
		this.modalidad=modalidad;
		
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	@Override
	public String toString() {
		return "modalidad=" + modalidad + ", Fech)=" + getFecha() + ", Codigo=" + getCodigo();
	}
	
	

	
	
	
	
	
}
