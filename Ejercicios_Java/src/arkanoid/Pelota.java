package arkanoid;
public class Pelota extends Objeto {
	protected float vx;
	protected float vy;
	
	public Pelota(Stage stage) {
		super(stage);
		setSpriteNames( new String[] {"bola.png"});
		setFrameSpeed(35);
	}
	
	public void act() {
		super.act();
		x+=vx;
		y+=vy;
		//rebote de la pelota
		if (x < 0 || x > Stage.WIDTH-22)
		  vx = -vx;
		
		if (y < 0 || y > Stage.HEIGHT-45)
			  vy = -vy;
	}

	public float getVx() { return vx; }
	public void setVx(int i) {vx = i;	}
	public float getVy() { return vy; }
	public void setVy(int j) {vy = j;	}
	
	public void collision(Objeto a) {
		if(a instanceof Ladrillo) {
			vy=-vy;
			stage.getSoundCache().playSound("disparo_1.wav");
		}
		if(a instanceof Player) {
			vy= -vy;
		}
		
	}
}
