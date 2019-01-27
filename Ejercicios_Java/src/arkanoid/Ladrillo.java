package arkanoid;
public class Ladrillo extends Actor {
	
	public int contador =0;
	
	public Ladrillo(Stage stage) {
		super(stage);
		
	
	}
	
	public void act() {
		super.act();
		
	
	}
	
	public void Color(int i) {
		
		setSpriteNames( new String[] {"ladrillo"+i+".png"});
		setFrameSpeed(35);
		
	}
}
