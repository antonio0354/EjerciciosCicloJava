package arkanoid;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ejercicios_Programacion_Objetos_3enRaya.Celda;



public class Arkanoid extends Canvas implements Stage, KeyListener , MouseListener , MouseMotionListener{
	
	private BufferStrategy strategy;
	private long usedTime;
	private SpriteCache spriteCache;
	private ArrayList objetos; 
	private Player player;
	private Pelota pelota;
	
	private SoundCache soundCache;
	
	//Crea la ventana
	public Arkanoid() {
		spriteCache = new SpriteCache();
		soundCache = new SoundCache();
	
		JFrame ventana = new JFrame("Arkanoid");
		JPanel panel = (JPanel)ventana.getContentPane();
		setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		panel.setPreferredSize(new Dimension(Stage.WIDTH,Stage.HEIGHT));
		panel.setLayout(null);
		panel.add(this);
		ventana.setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		ventana.setVisible(true);
		ventana.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
			this.addMouseMotionListener(new MouseAdapter(){
				@Override
				public void mouseMoved (MouseEvent e) {
					player.mouseMoved(e);
					pelota.mouseMoved(e);
					
				}
				
				
				
				
				
				
			});
			
			this.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					pelota.MouseClicked();
					
				}
				
				
			});
		
			
		
		
		
		
		ventana.setResizable(false);
		createBufferStrategy(2);
		strategy = getBufferStrategy();
		requestFocus();
		addKeyListener(this);
	}
	
	
	public void checkCollisions() {
		Rectangle playerBounds = player.getBounds();
		
		
		for (int i = 0; i < objetos.size(); i++) {
			Objeto a1 = (Objeto)objetos.get(i);
			Rectangle r1 = a1.getBounds();
			Rectangle derecha= new Rectangle(a1.getX()+59,a1.getY(),2,a1.height);
			Rectangle izquierda= new Rectangle(a1.getX(),a1.getY(),2,a1.height);
			
			if (r1.intersects(playerBounds)) {
				player.collision(a1);
				a1.collision(player);
				
				
			}
		  for (int j = i+1; j < objetos.size(); j++) {
			Objeto a2 = (Objeto)objetos.get(j);
		  	Rectangle r2 = a2.getBounds();
		  	
		  	
		  	if (derecha.intersects(r2)&&r1.intersects(r2)) {
		  	  
		  	    pelota.setVx(-pelota.getVx());
		  	    //pelota.setVy(-pelota.getVy());
		  		
		  		
		  		
		  	    objetos.remove(a1);
	
		  	}else {
		  	if (izquierda.intersects(r2)&&r1.intersects(r2)) {
			  	  
		  	    pelota.setVx(-pelota.getVx());
		  	    //pelota.setVy(-pelota.getVy());
		  	
		  		
		  		
		  	    objetos.remove(a1);
		  	    
		  	 
		  	    
		  	    
		  		
		  	}else {
		  		if (r1.intersects(r2)) {
				  	  
			  	    
			  		a1.collision(a2);
			  		a2.collision(a1);
			  		
			  		
			  	    objetos.remove(a1);
			  	    
			  	 
			  	    
			  	    
			  		
			  	}
		  	}
		  	}
		  }
		  
		  
		}
	}
	
	public void initWorld() {
		objetos = new ArrayList();
    
    //crear los ladrillos
    for( int i=0; i<6; i++) {
    	for( int j=0; j< 5 ;j++) {
    		Ladrillo ladrillo = new Ladrillo(this);
    		ladrillo.Color(j);;
            ladrillo.setX(40+i*100);
            ladrillo.setY(20+j*50);
            objetos.add(ladrillo);
            
           
    	}
    	
    }
    
    
    
    //crear la plataforma
    player = new Player(this);
    player.setX(Stage.WIDTH/2);
    player.setY(400);
    
    
    soundCache.loopSound("Solve The Puzzle.wav");
   
  //crear la pelota
    for (int i = 0; i < 1; i++){
    	pelota= new Pelota(this);
        pelota.setX( player.getX()+20);
	    pelota.setY( player.getY()-20);
	    
	    
        objetos.add(pelota);
    }
	}
	

	/**setSpriteNames( new String[] {"bola.png"});
		setFrameSpeed(35);
	 * 
	 */
	public void updateWorld() {
		
		
		for (int i = 0; i < objetos.size(); i++) {
			Objeto m = (Objeto)objetos.get(i);
			m.act();
		}
		player.act();
	
	}
	
	/**
	 * Metodo que pinta los objetos 
	 */
	public void paintWorld() {
		Toolkit.getDefaultToolkit().sync();
		Graphics2D g = (Graphics2D)strategy.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0,0,getWidth(),getHeight());
		for (int i = 0; i < objetos.size(); i++) {
			Objeto m = (Objeto)objetos.get(i);
			m.paint(g);
		}
		player.paint(g);
		

		g.setColor(Color.white);
		if (usedTime > 0)
		  g.drawString(String.valueOf(1000/usedTime)+" fps",0,Stage.HEIGHT-50);
  	else
	  	g.drawString("--- fps",0,Stage.HEIGHT-50);
		strategy.show();
	}
	
	public SoundCache getSoundCache() {
		 return soundCache;
	 }
	
	public SpriteCache getSpriteCache() {
		return spriteCache;
	}
	
	public void keyPressed(KeyEvent e) {
		player.keyPressed(e);
		pelota.keyPressed(e);
	}
	
	public void keyReleased(KeyEvent e) {
		player.keyReleased(e);
		pelota.keyReleased(e);
	}
	public void keyTyped(KeyEvent e) {}
	
	public void game() {
		usedTime=1000;
		initWorld();
	
		while (isVisible()) {
			long startTime = System.currentTimeMillis();
			updateWorld();
			checkCollisions();
			paintWorld();
			usedTime = System.currentTimeMillis()-startTime;
			try { 
				 Thread.sleep(SPEED);
			} catch (InterruptedException e) {}
		}
	}
	
	public static void main(String[] args) {
		Arkanoid ark = new Arkanoid();
		ark.game();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		pelota.MouseClicked();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
