package examen_programacion_recuperacion;

public class Malvado {

	private int ptosVida;
	private String nombre;
	private boolean vivo=true;
	private int disparos;
	/**
	 * @param ptosVida
	 * @param nombre
	 * @param vivo
	 */
	public Malvado(int ptosVida, String nombre, boolean vivo,int disparos) {
		super();
		this.ptosVida = ptosVida;
		this.nombre = nombre;
		this.vivo = vivo;
		this.disparos=disparos;
	}
	/**
	 * @return the disparos
	 */
	public int getDisparos() {
		return disparos;
	}
	/**
	 * @param disparos the disparos to set
	 */
	public void setDisparos(int disparos) {
		this.disparos = disparos;
	}
	/**
	 * @return the ptosVida
	 */
	public int getPtosVida() {
		return ptosVida;
	}
	/**
	 * @param ptosVida the ptosVida to set
	 */
	public void setPtosVida(int ptosVida) {
		this.ptosVida = ptosVida;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the vivo
	 */
	public boolean isVivo() {
		return vivo;
	}
	/**
	 * @param vivo the vivo to set
	 */
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Malvado [ptosVida=" + ptosVida + ", nombre=" + nombre + ", vivo=" + vivo + ", disparos=" + disparos
				+ "]";
	}
	
	
	
}
