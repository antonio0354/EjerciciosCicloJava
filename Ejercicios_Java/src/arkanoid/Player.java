package arkanoid;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Player extends Objeto {
	protected static final int PLAYER_SPEED = 4;
	protected int vx;
	protected int vy;
	private boolean up,down,left,right;
	
	

	public static int score=0;
		
	
	public Player(Stage stage) {
		super(stage);
		setSpriteNames( new String[] {"plataforma.png"});
	}
	
	public void act() {
		super.act();
		x+=vx;
		
		//modificacion para que no se pase de los bordes
		if(x<0) {
			x=0;
		}
		 if(x > stage.WIDTH - getWidth()) {
			 x = stage.WIDTH - getWidth();
			 
		 }
		
	}

	public int getVx() { return vx; }
	public void setVx(int i) {vx = i;	}
 	public int getVy() { return vy; }
  public void setVy(int i) {vy = i;	}
  
  
  protected void updateSpeed() {
  	vx=0;vy=0;
  	if (down) vy = PLAYER_SPEED;
  	if (up) vy = -PLAYER_SPEED;
  	if (left) vx = -PLAYER_SPEED;
  	if (right) vx = PLAYER_SPEED;
  	
  	
  }
  
  public void keyReleased(KeyEvent e) {
   	switch (e.getKeyCode()) {
  		case KeyEvent.VK_DOWN : down = false;break;
		  case KeyEvent.VK_UP : up = false; break;
		  case KeyEvent.VK_LEFT : left = false; break; 
		  case KeyEvent.VK_RIGHT : right = false;break;
   	}
   	updateSpeed();
  }
  
  public void keyPressed(KeyEvent e) {
  	switch (e.getKeyCode()) {
		  case KeyEvent.VK_UP : up = true; break;
		  case KeyEvent.VK_LEFT : left = true; break;
		  case KeyEvent.VK_RIGHT : right = true; break;
		  case KeyEvent.VK_DOWN : down = true;break;
  	}
  	updateSpeed();
  }
  
  public void mouseMoved(MouseEvent e) {
	  
	  setX(e.getX());
  }
  
}
