package Ejercicios_Programacion_Objetos;

public class FP extends Matricula {

	private boolean dual;

	public boolean isDual() {
		return dual;
	}

	public void setDual(boolean dual) {
		this.dual = dual;
	}

	public FP(boolean dual) {
		super();
		this.dual = dual;
	}

	public FP() {
		super();
		
	}

	@Override
	public String toString() {
		return "FP [dual=" + dual + ", getFecha()=" + getFecha() + ", getCodigo()=" + getCodigo() + "]";
	}
	
	
}
