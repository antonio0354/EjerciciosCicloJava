package arkanoid;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Pelota extends Objeto {
	protected float vx;
	protected float vy;
	private boolean space;
	private boolean pulsada = false;
	
	private boolean desactivar=false;
	
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
		if(space == true && pulsada==false) {
			vx=2;
			vy=3;
			pulsada=true;
			desactivar=true;
		}else
		 {
			
		}
		
		if (x < 0 || x > Stage.WIDTH-22)
		  vx = -vx;
		
		if (y < 0 || y > Stage.HEIGHT-45)
			  vy = -vy;
	}

	public float getVx() { return vx; }
	public void setVx(int i) {vx = i;	}
	public float getVy() { return vy; }
	public void setVy(int j) {vy = j;	}
	
	
	public void keyReleased(KeyEvent e) {
	   	switch (e.getKeyCode()) {
	  		case KeyEvent.VK_SPACE : space = false;break;
			 
	   	}
	   act();
	  }
	  
	  public void keyPressed(KeyEvent e) {
	  	switch (e.getKeyCode()) {
			  case KeyEvent.VK_SPACE : space = true; break;
			 
	  	}
	  	act();
	  }
	  
	 public void MouseClicked() {
		
		space=true;
		
		 
		 act();
		 
	 }
	 
	 public void mouseMoved(MouseEvent e) {
		  if(desactivar==false) {
			  setX(e.getX());
		  }
		 
	  }
	  
	public void collision(Objeto a) {
		if(a instanceof Ladrillo) {
			vy= -vy;
			stage.getSoundCache().playSound("disparo_1.wav");
			
		}
		if(a instanceof Player) {
			vy=-vy;
		}
		
	}
}
