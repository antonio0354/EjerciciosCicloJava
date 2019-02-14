package arkanoid2;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Date;

import tutorialJava.Arkanoid.version09.Actor;

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

	private void colisionConLadrillo (Actor actorColisionado) {
		int margenLateral = 4; // Este mare
		// Creo peque�os rect�ngulos que coincidir�n con los bordes del ladrillo
		Rectangle rectArribaActor = new Rectangle(actorColisionado.getX(), actorColisionado.getY(), actorColisionado.getAncho(), 1);
		Rectangle rectAbajoActor = new Rectangle(actorColisionado.getX(), actorColisionado.getY() + actorColisionado.getAlto()-1, actorColisionado.getAncho(), 1);
		Rectangle rectIzquierdaActor = new Rectangle(actorColisionado.getX(), actorColisionado.getY() + margenLateral, 1, actorColisionado.getAlto() - 2 * margenLateral);
		Rectangle rectDerechaActor = new Rectangle(actorColisionado.getX() + actorColisionado.getAncho()-1, actorColisionado.getY() + margenLateral, 1, actorColisionado.getAlto() - 2 * margenLateral);

		// variables booleanas que me indicar�n una colsi�n por cada lado del ladrillo
		boolean arriba = false, abajo = false, derecha = false, izquierda = false;
		
		if (this.getRectanguloParaColisiones().intersects(rectArribaActor))  arriba = true;
		if (this.getRectanguloParaColisiones().intersects(rectAbajoActor))  abajo = true;
		if (this.getRectanguloParaColisiones().intersects(rectIzquierdaActor))  izquierda = true;
		if (this.getRectanguloParaColisiones().intersects(rectDerechaActor))  derecha = true;
		
		if (arriba && izquierda) { // Colisi�n con esquina superior izquierda
			// Coloco la bola en la esquina
			this.x = actorColisionado.x;
			this.y = actorColisionado.y;
			this.coordenadas.x = this.x; this.coordenadas.y = this.y;
			// Recalculo la pendiente
			this.trayectoria.setPendiente(Math.abs(this.trayectoria.getPendiente()), this.coordenadas, false);
			return;
		}
		if (arriba && derecha) {
			this.x = actorColisionado.x + actorColisionado.ancho;
			this.y = actorColisionado.y;
			this.coordenadas.x = this.x; this.coordenadas.y = this.y;
			this.trayectoria.setPendiente(0-Math.abs(this.trayectoria.getPendiente()), this.coordenadas, true);
			return;
		}
		if (abajo && izquierda) {
			this.x = actorColisionado.x;
			this.y = actorColisionado.y + actorColisionado.alto;
			this.coordenadas.x = this.x; this.coordenadas.y = this.y;
			this.trayectoria.setPendiente(0-Math.abs(this.trayectoria.getPendiente()), this.coordenadas, false);
			return;
		}
		if (abajo && derecha) {
			this.x = actorColisionado.x + actorColisionado.ancho;
			this.y = actorColisionado.y + actorColisionado.alto;
			this.coordenadas.x = this.x; this.coordenadas.y = this.y;
			this.trayectoria.setPendiente(Math.abs(this.trayectoria.getPendiente()), this.coordenadas, true);
			return;
		}
		if (abajo) {
			this.y = actorColisionado.y + actorColisionado.alto;
			this.coordenadas.y = this.y;
			this.trayectoria.reflejarHaciaAbajo(this.coordenadas);
			return;
		}
		if (arriba) {
			this.y = actorColisionado.y;
			this.coordenadas.y = this.y;
			this.trayectoria.reflejarHaciaArriba(this.coordenadas);
			return;
		}
		if (izquierda) {
			this.x = actorColisionado.x;
			this.coordenadas.x = this.x;
			this.trayectoria.reflejarHaciaIzquierda(this.coordenadas);
			return;
		}
		if (derecha) {
			this.x = actorColisionado.x + actorColisionado.ancho;
			this.coordenadas.x = this.x;
			this.trayectoria.reflejarHaciaDerecha(this.coordenadas);
			return;
		}
	}
	
	
	public Rectangle getRectanguloParaColisiones () {
		return new Rectangle(this.x + this.width / 2 - 4, this.y + this.height / 2 - 4, 8, 8);
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
			
		}
		if(a instanceof Capsula) {
			
		}
		
	}
	
	
}
