package arkanoid;
public class Pelota extends Actor {
	protected int vx;
	protected int vy;
	
	public Pelota(Stage stage) {
		super(stage);
		setSpriteNames( new String[] {"bola.png"});
		setFrameSpeed(35);
	}
	
	public void act() {
		super.act();
		x+=vx;
		y+=vy;
		if (x < 0 || x > Stage.WIDTH-22)
		  vx = -vx;
		
		if (y < 0 || y > Stage.HEIGHT-45)
			  vy = -vy;
	}

	public int getVx() { return vx; }
	public void setVx(int i) {vx = i;	}
	public int getVy() { return vy; }
	public void setVy(int j) {vy = j;	}
}
