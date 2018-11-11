package Ejercicios_Programacion_Objetos;

public class FP extends Matricula {

	private boolean dual;

	public FP() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FP(String fecha, String codigo,boolean dual) {
		super(fecha, codigo);
		this.dual=dual;
	}

	public boolean isDual() {
		return dual;
	}

	public void setDual(boolean dual) {
		this.dual = dual;
	}

	@Override
	public String toString() {
		return "dual=" + dual + ", Fecha=" + getFecha() + ", Codigo=" + getCodigo();
	}

	
	
	
}
