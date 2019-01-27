package arkanoid;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Arkanoid extends Canvas implements Stage, KeyListener {
	
	private BufferStrategy strategy;
	private long usedTime;
	
	private SpriteCache spriteCache;
	private ArrayList actors; 
	private Player player;
	public int contador =0;
	
	public Arkanoid() {
		spriteCache = new SpriteCache();
		
	
		JFrame ventana = new JFrame("Invaders");
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
		ventana.setResizable(false);
		createBufferStrategy(2);
		strategy = getBufferStrategy();
		requestFocus();
		addKeyListener(this);
	}
	
	public void initWorld() {
    actors = new ArrayList();
    
    for( int i=0; i<10; i++) {
    	for( int j=0; j< 5 ;j++) {
    		Ladrillo ladrillo = new Ladrillo(this);
    		ladrillo.Color(j);
            ladrillo.setX(10+i*60);
            ladrillo.setY(20+j*50);
            actors.add(ladrillo);
            
           
    	}
    	
    }
    
    for (int i = 0; i < 1; i++){
    	Pelota p = new Pelota(this);
      p.setX( Stage.WIDTH/2 );
	    p.setY( Stage.HEIGHT/2 );
	    p.setVx( 2 );
        p.setVy(2);
      actors.add(p);
    }
    
    player = new Player(this);
    player.setX(Stage.WIDTH/2);
    player.setY(400);
    
    
    
   
	}
	

	
	public void updateWorld() {
		for (int i = 0; i < actors.size(); i++) {
			Actor m = (Actor)actors.get(i);
			m.act();
		}
		player.act();
	
	}
	
	public void paintWorld() {
		Graphics2D g = (Graphics2D)strategy.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0,0,getWidth(),getHeight());
		for (int i = 0; i < actors.size(); i++) {
			Actor m = (Actor)actors.get(i);
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
	
	public SpriteCache getSpriteCache() {
		return spriteCache;
	}
	
	public void keyPressed(KeyEvent e) {
		player.keyPressed(e);
	}
	
	public void keyReleased(KeyEvent e) {
		player.keyReleased(e);
	}
	public void keyTyped(KeyEvent e) {}
	
	public void game() {
		usedTime=1000;
		initWorld();
		while (isVisible()) {
			long startTime = System.currentTimeMillis();
			updateWorld();
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
}
