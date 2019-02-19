package arkanoid;

import java.util.Date;

public class Marciano extends Objeto {

	
	protected int vy=0;
	protected int vx=0;
	/**
	 * @return the vy
	 */
	public int getVy() {
		return vy;
	}
	/**
	 * @param vy the vy to set
	 */
	public void setVy(int vy) {
		this.vy = vy;
	}
	/**
	 * @return the vx
	 */
	public int getVx() {
		return vx;
	}
	/**
	 * @param vx the vx to set
	 */
	public void setVx(int vx) {
		this.vx = vx;
	}
	/**
	 * @param stage
	 */
	public Marciano(Stage stage) {
		super(stage);
		// TODO Auto-generated constructor stub
	
		
	}
	
	
	public void act() {
		super.act();
		
		x+=vx;
		y+=vy;
		
		if (x < 0 || x > Stage.WIDTH-22)
			  vx = -vx;
		
	}
	
	public void imagen() {
		
		setSpriteNames( new String[] {"bicho.gif"});
		setFrameSpeed(35);
		
	}

}
