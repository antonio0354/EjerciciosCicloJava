package Ejercicios_Programacion_Objetos;

public class ESO extends Matricula {

	private boolean pmar;

	public ESO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ESO(String fecha, String codigo,boolean pmar) {
		super(fecha, codigo);
		this.pmar=pmar;
	}


	public boolean isPmar() {
		return pmar;
	}

	public void setPmar(boolean pmar) {
		this.pmar = pmar;
	}

	@Override
	public String toString() {
		return "pmar=" + pmar + ", Fecha=" + getFecha() + ", Codigo=" + getCodigo();
	}

	
	
	
	
}
