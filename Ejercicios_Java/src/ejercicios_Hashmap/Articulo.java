package ejercicios_Hashmap;

public class Articulo {

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", estante=" + estante + ", descripcion=" + descripcion + "]";
	}
	/**
	 * @return the estante
	 */
	public String getEstante() {
		return estante;
	}
	/**
	 * @param estante the estante to set
	 */
	public void setEstante(String estante) {
		this.estante = estante;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * 
	 */
	public Articulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String codigo;
	private String estante;
	private String descripcion;
	/**
	 * @param codigo
	 * @param estante
	 * @param descripcion
	 */
	public Articulo(String codigo, String estante, String descripcion) {
		super();
		this.codigo = codigo;
		this.estante = estante;
		this.descripcion = descripcion;
	}
	
}
