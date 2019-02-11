package arkanoid;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Date;

public class Pelota extends Objeto {
	protected static final int SPEED = 4;
	protected float vx;
	protected float vy;
	private boolean space;
	private boolean pulsada = false;
	private boolean up,down,left,right;
	private boolean comprueba = false;
	private boolean compruebatiempo=false;
	
	private boolean desactivar=false;
	private long millisDesdeInicio = new Date().getTime();

	
	
	public Pelota(Stage stage) {
		super(stage);
		setSpriteNames( new String[] {"bola.png"});
		setFrameSpeed(35);
		
		
	}

	
	
	public void act() {
		super.act();
		
		long millisActuales = new Date().getTime();
		long millisTranscurridos = millisActuales - millisDesdeInicio;
		
		/*
		if (millisTranscurridos > 5000) {
			vx=2;
			vy=3;
		}
		*/
		
		
		x+=vx;
		y+=vy;
		//rebote de la pelota
		if((space == true && pulsada==false)|| (millisTranscurridos >5000 && compruebatiempo==false)) {
			vx=2;
			vy=3;
			pulsada=true;
			desactivar=true;
			comprueba=true;
			compruebatiempo=true;
		}else{
			
		}
		
		if (x < 0 || x > Stage.WIDTH-22)
		  vx = -vx;
		
		if (y < 0 || y > Stage.HEIGHT-45)
			  vy = -vy;
		
		
	}

	public float getVx() { return vx; }
	public void setVx(float f) {vx = f;	}
	public float getVy() { return vy; }
	public void setVy(float f) {vy = f;	}
	
	
	protected void updateSpeed() {
	  if(comprueba==false) {
	  
	    vx=0;
	  	if (left) vx= -SPEED; 
	  	if (right) vx = SPEED;
	  	if(x<0) {
			x=0;
		}
		 if(x > stage.WIDTH - getWidth()) {
			 x = stage.WIDTH - getWidth();
			 
		 }
	  }
	  	
	  }
	
	public void keyReleased(KeyEvent e) {
	   	switch (e.getKeyCode()) {
	  		case KeyEvent.VK_SPACE : space = false;break;
	  		case KeyEvent.VK_DOWN : down = false;break;
			case KeyEvent.VK_UP : up = false; break;
			case KeyEvent.VK_LEFT : left = false; break; 
			case KeyEvent.VK_RIGHT : right = false;break;
	   	}
	   	updateSpeed();
	  
		
	  }
	  
	  public void keyPressed(KeyEvent e) {
	  	switch (e.getKeyCode()) {
			  case KeyEvent.VK_SPACE : space = true; break;
			  case KeyEvent.VK_UP : up = true; break;
			  case KeyEvent.VK_LEFT : left = true; break;
			  case KeyEvent.VK_RIGHT : right = true; break;
			  case KeyEvent.VK_DOWN : down = true;break;
	  	}
	  	updateSpeed();
	  	
		
	  }
	  
	 public void MouseClicked() {
		
		space=true;
		
		 
		 act();
		 
	 }
	 
	 public void mouseMoved(MouseEvent e) {
		  if(desactivar==false) {
			  setX(e.getX()+20);
			  if(x > stage.WIDTH - getWidth()) {
					 x = stage.WIDTH - getWidth();
					 
				 }
		  }
		 
	  }
	  
	public void collision(Objeto a) {
		if(a instanceof Ladrillo) {
			vy= -vy;
			stage.getSoundCache().playSound("disparo_1.wav");
			vy+=0.2;
			vx+=0.1;
		}
		if(a instanceof Player) {
			vy=-vy;
			//vy+=0.1;
			//vx+=0.05;
		}
		
	}
	
	
}
