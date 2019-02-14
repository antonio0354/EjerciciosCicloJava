package arkanoid2;
public class Ladrillo extends Objeto {
	private boolean destruido =false;
	
	public Ladrillo(Stage stage) {
		super(stage);
		
	
	}
	
	
	//metodo que cambia la imagen del ladrillo
	public void Color(int i) {
		
		setSpriteNames( new String[] {"ladrillo"+i+".png","ladrillo"+2+".png"});
		setFrameSpeed(35);
		
	}
	
	public void Color2(int i) {
		
		setSpriteNames( new String[] {"ladrillo2"+(i+1)+".png","ladrillo"+2+".png"});
		setFrameSpeed(35);
		
	}
	


	/**
	 * @return the destruido
	 */
	public boolean isDestruido() {
		return destruido;
	}


	/**
	 * @param destruido the destruido to set
	 */
	public void setDestruido(boolean destruido) {
		this.destruido = destruido;
	}
	
}
