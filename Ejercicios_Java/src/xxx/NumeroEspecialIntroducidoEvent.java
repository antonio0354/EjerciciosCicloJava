package xxx;

public class NumeroEspecialIntroducidoEvent {
	
	private String palabraIntroducido;

	/**
	 * @param numeroIntroducido
	 */
	public NumeroEspecialIntroducidoEvent(String palabraIntroducido) {
		super();
		this.palabraIntroducido = palabraIntroducido;
	}

	/**
	 * @return the palabraIntroducido
	 */
	public String getPalabraIntroducido() {
		return palabraIntroducido;
	}

	/**
	 * @param palabraIntroducido the palabraIntroducido to set
	 */
	public void setPalabraIntroducido(String palabraIntroducido) {
		this.palabraIntroducido = palabraIntroducido;
	}

	
	
}
