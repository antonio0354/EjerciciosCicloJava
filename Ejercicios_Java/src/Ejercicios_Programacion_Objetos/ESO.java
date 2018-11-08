package Ejercicios_Programacion_Objetos;

public class ESO extends Matricula {

	private boolean pmar;

	public boolean isPmar() {
		return pmar;
	}

	public void setPmar(boolean pmar) {
		this.pmar = pmar;
	}

	public ESO(boolean pmar) {
		super();
		this.pmar = pmar;
	}

	public ESO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ESO [pmar=" + pmar + ", getFecha()=" + getFecha() + ", getCodigo()=" + getCodigo() + "]";
	}
	
	
	
}
