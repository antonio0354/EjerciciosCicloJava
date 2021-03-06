package arkanoid;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import ejercicios_ficheroPropiedades.Ejercicio1;





public class Arkanoid extends Canvas implements Stage, KeyListener , MouseListener , MouseMotionListener{
	
	private static Properties propiedades = null;
	
	private static Properties getPropiedades() {
		if (propiedades == null) {
			propiedades = new Properties();
		    
			try {
				propiedades.load(propiedades.getClass().getResourceAsStream("/arkanoid/ejemplo.properties"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		return propiedades;
	}
	
	public static String getProperty(String nombrePropiedad) {
		return getPropiedades().getProperty(nombrePropiedad);
	}

	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static int getIntProperty (String nombrePropiedad) {
		return Integer.parseInt(getPropiedades().getProperty(nombrePropiedad));
	}
	
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static Float getFloatProperty (String nombrePropiedad) {
		return Float.parseFloat(getPropiedades().getProperty(nombrePropiedad));
	}
	
	private BufferStrategy strategy;
	private long usedTime;
	private SpriteCache spriteCache;
	protected ArrayList objetos; 
	
	/**
	 * @return the objetos
	 */
	public ArrayList getObjetos() {
		return objetos;
	}


	/**
	 * @param objetos the objetos to set
	 */
	public void setObjetos(ArrayList objetos) {
		this.objetos = objetos;
	}

	private Player player;
	private Pelota pelota;
	private int pasarFase=1;
	private boolean tocado=false;
	private int inmortales=0;
	private int vidas=3;
	private boolean unavez1=false;
	private boolean unavez2=false;
	private boolean unavez3=false;
	private int posicionXCapsula=0;
	private int posicionYCapsula=0;
	
	
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
		Rectangle pelotaBounds=pelota.getBounds();
		
		for (int i = 0; i < objetos.size(); i++) {
			
			Objeto a1 = (Objeto)objetos.get(i);
			Rectangle r1 = a1.getBounds();
			Rectangle derecha= new Rectangle(a1.getX()+59,a1.getY(),2,a1.height);
			Rectangle izquierda= new Rectangle(a1.getX(),a1.getY(),2,a1.height);
			Rectangle arriba= new Rectangle(a1.getX(),a1.getY(),a1.width,2);
			Rectangle abajo= new Rectangle(a1.getX(),a1.getY()+19,a1.width,2);
			
			
			
			if (r1.intersects(playerBounds)) {
				if(a1.nopildora==false) {
					player.collision(a1);
					a1.collision(player);
				}else {
					
				}
				
				
				
			}
		  for (int j = i+1; j < objetos.size(); j++) {
			Objeto a2 = (Objeto)objetos.get(j);
		  	Rectangle r2 = a2.getBounds();
		  	
		  	
		  	if (derecha.intersects(r2)) {
		  	    
		  		if(a1.nopildora==false) {
		  			 pelota.setVx(-pelota.getVx());
				  	    player.score+=300;
				  		
				  		if(a1.inmortal==true) {
				  			
				  		}else {
				  			
				  			if(a1.golpes==0) {
				  				objetos.remove(a1);
				  				posicionXCapsula=a1.getX()+30;
				  				posicionYCapsula=a1.getY();
				  				//capsulas();
				  			}else {
				  				a1.setSpriteNames( new String[] {"ladrilloroto.png"});
				  				a1.golpes--;
				  			}
				  			 
				  		}
		  		}else {
		  			
		  		}
		  	   
		  	
		  	}else {
		  	if (izquierda.intersects(r2)) {
		  		 
		  		if(a1.nopildora==false) {
		  			 pelota.setVx(-pelota.getVx());
				  	    player.score+=300;
				  	    
				  	  if(a1.inmortal==true) {
				  			
				  		}else {
				  			if(a1.golpes==0) {
				  				objetos.remove(a1);
				  				posicionXCapsula=a1.getX()+30;
				  				posicionYCapsula=a1.getY();
				  				//capsulas();
				  			}else {
				  				a1.setSpriteNames( new String[] {"ladrilloroto.png"});
				  				a1.golpes--;
				  			}
				  		}
		  		}else {
		  			
		  		}
		  	   
		  	    
		  	 
		  	    
		  	    
		  		
		  	}else {
		  		if (arriba.intersects(r2)) {
		  			
		  			if(a1.nopildora==false) {
		  				player.score+=100;
				  		if(a1.inmortal==true) {
				  			pelota.setVy(-pelota.getVy());
				  		}else {
				  			a1.collision(a2);
					  		a2.collision(a1);
				  			if(a1.golpes==0) {
				  				objetos.remove(a1);
				  				posicionXCapsula=a1.getX()+30;
				  				posicionYCapsula=a1.getY();
				  				//capsulas();
				  			}else {
				  				a1.setSpriteNames( new String[] {"ladrilloroto.png"});
				  				a1.golpes--;
				  			}
				  		}
		  			}else {
		  				
		  			}
		  			
			  	    
			  	 
			  	    
			  	    
			  		
			  	}else {
			  		if (abajo.intersects(r2)) {
			  			
			  			if(a1.nopildora==false) {
			  				player.score+=100;
					  		if(a1.inmortal==true) {
					  			pelota.setVy(-pelota.getVy());
					  		}else {
					  			a1.collision(a2);
						  		a2.collision(a1);
					  			if(a1.golpes==0) {
					  				objetos.remove(a1);
					  				posicionXCapsula=a1.getX()+30;
					  				posicionYCapsula=a1.getY();
					  				//capsulas();
					  			}else {
					  				a1.setSpriteNames( new String[] {"ladrilloroto.png"});
					  				a1.golpes--;
					  			}
					  		}
			  			}else {
			  				
			  			}
			  			
				  	    
				  	 
				  	    
				  	    
				  		
				  	}
		  	}
		  	}
		  	}
		  }
		}
	}
	
	
	
	public void paintScore(Graphics2D g) {
		g.setFont(new Font("Arial",Font.BOLD,20));
		g.setPaint(Color.green);
		g.drawString("Puntuacion:",20,Stage.HEIGHT - 50);
		g.setPaint(Color.red);
		g.drawString(player.score+"",150,Stage.HEIGHT  -50);
	}
	
	public void paintStatus(Graphics2D g) {
		  paintScore(g);
		  
		}
	
	public void initWorld() {
		
		
		if(unavez1==false) {
			objetos = new ArrayList();
			for( int i=0; i<1; i++) {
		    	for( int j=0; j< 1 ;j++) {
		    		Ladrillo ladrillo = new Ladrillo(this);
		    		ladrillo.Color(j);;
		            ladrillo.setX(40+i*100);
		            ladrillo.setY(20+j*50);
		            objetos.add(ladrillo);
		            
		           
		    	}
		    	
		    }
			unavez1=true;
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
	
	public void initWorld2() {
		
		if(unavez2==false) {
			objetos = new ArrayList();
		    
		    //crear los ladrillos
				
				
		    for( int i=0; i<1; i++) {
		    	for( int j=0; j< 1 ;j++) {
		    		Ladrillo ladrillo = new Ladrillo(this);
		    		ladrillo.Color2(j);;
		            ladrillo.setX(280+i*100);
		            ladrillo.setY(20+j*50);
		            objetos.add(ladrillo);
		    	}
		    	   }
		    
		    for( int i=0; i<0; i++) {
		    	for( int j=1; j< 0 ;j++) {
		    		Ladrillo ladrillo = new Ladrillo(this);
		    		ladrillo.Color2(j);;
		            ladrillo.setX(230+i*100);
		            ladrillo.setY(20+j*50);
		            ladrillo.inmortal=true; 
		            inmortales++;
		            objetos.add(ladrillo);
		    	}
		    	   }
		    
		    for( int i=0; i<0; i++) {
		    	for( int j=2; j< 0 ;j++) {
		    		Ladrillo ladrillo = new Ladrillo(this);
		    		ladrillo.Color2(j);;
		            ladrillo.setX(180+i*100);
		            ladrillo.setY(20+j*50);
		            
		            objetos.add(ladrillo);
		    	}
		    	   }
		    
		    for( int i=0; i<0; i++) {
		    	for( int j=3; j< 0 ;j++) {
		    		Ladrillo ladrillo = new Ladrillo(this);
		    		ladrillo.Color2(j);;
		            ladrillo.setX(130+i*100);
		            ladrillo.setY(20+j*50);
		            objetos.add(ladrillo);
		    	}
		    	   }
		    
		    for( int i=0; i<0; i++) {
		    	for( int j=4; j< 0 ;j++) {
		    		Ladrillo ladrillo = new Ladrillo(this);
		    		ladrillo.Color2(j);;
		            ladrillo.setX(80+i*100);
		            ladrillo.setY(20+j*50);
		            ladrillo.setGolpes(1);
		            objetos.add(ladrillo);
		            
		    	}
		    	   }
		    
		    for( int i=0; i<0; i++) {
		    	for( int j=5; j< 0 ;j++) {
		    		Ladrillo ladrillo = new Ladrillo(this);
		    		ladrillo.Color2(j);;
		            ladrillo.setX(30+i*100);
		            ladrillo.setY(20+j*50);
		            
		            objetos.add(ladrillo);
		            
		           
		    	}
		    	   }
		    unavez2=true;
		}
		
	
		
    soundCache.loopSound("Solve The Puzzle.wav");
    for (int i = 0; i < 1; i++){
    	pelota= new Pelota(this);
        pelota.setX( player.getX()+20);
	    pelota.setY( player.getY()-20);
	    
	    
        objetos.add(pelota);
    }
  
	}
	
	
	public void initWorld3() {
		
		
		if(unavez3==false) {
			objetos = new ArrayList();
			for( int i=0; i<1; i++) {
		    	for( int j=0; j< 1 ;j++) {
		    		Marciano marciano = new Marciano(this);
		    		marciano.imagen();
		            marciano.setX(40+i*100);
		            marciano.setY(20+j*50);
		            marciano.setVx(3);
		            objetos.add(marciano);
		            
		           
		    	}
		    	
		    	
		    }
			for( int i=0; i<1; i++) {
		    	for( int j=1; j< 2 ;j++) {
		    		Marciano marciano = new Marciano(this);
		    		marciano.imagen();
		            marciano.setX(40+i*100);
		            marciano.setY(20+j*50);
		            marciano.setVx(2);
		            objetos.add(marciano);
		            
		           
		    	}
		    	
		    	
		    }
			for( int i=0; i<1; i++) {
		    	for( int j=2; j< 3 ;j++) {
		    		Marciano marciano = new Marciano(this);
		    		marciano.imagen();
		            marciano.setX(40+i*100);
		            marciano.setY(20+j*50);
		            marciano.setVx(4);
		            objetos.add(marciano);
		            
		           
		    	}
		    	
		    	
		    }
			for( int i=0; i<1; i++) {
		    	for( int j=3; j< 4 ;j++) {
		    		Marciano marciano = new Marciano(this);
		    		marciano.imagen();
		            marciano.setX(40+i*100);
		            marciano.setY(20+j*50);
		            marciano.setVx(5);
		            objetos.add(marciano);
		            
		           
		    	}
		    	
		    	
		    }
			for( int i=0; i<1; i++) {
		    	for( int j=4; j< 5 ;j++) {
		    		Marciano marciano = new Marciano(this);
		    		marciano.imagen();
		            marciano.setX(40+i*100);
		            marciano.setY(20+j*50);
		            marciano.setVx(1);
		            objetos.add(marciano);
		            
		           
		    	}
		    	
		    	
		    }
			for( int i=0; i<1; i++) {
		    	for( int j=5; j< 6 ;j++) {
		    		Marciano marciano = new Marciano(this);
		    		marciano.imagen();
		            marciano.setX(40+i*100);
		            marciano.setY(20+j*50);
		            marciano.setVx(10);
		            objetos.add(marciano);
		            
		           
		    	}
		    	
		    	
		    }
			
			unavez3=true;
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
		String colorFondo = Arkanoid.getProperty("COLOR");
		
		
		
		
		Toolkit.getDefaultToolkit().sync();
		Graphics2D g = (Graphics2D)strategy.getDrawGraphics();
		g.setColor(Color.decode(colorFondo));
		g.fillRect(0,0,getWidth(),getHeight());
		for (int i = 0; i < objetos.size(); i++) {
			Objeto m = (Objeto)objetos.get(i);
			m.paint(g);
		}
		player.paint(g);
		
		paintScore(g);

		g.setColor(Color.white);
		
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
			
			if(objetos.size()==pasarFase) {
				JOptionPane.showMessageDialog(null, "Has completado la primera fase");
				game2();
			}
			if(pelota.getY()>=Stage.HEIGHT-50) {
				vidas--;
				objetos.remove(pelota);
				JOptionPane.showMessageDialog(null, "Has perdido una vida, vidas restantes: "+vidas);
				game();
				
			}
			if(vidas==0) {
				JOptionPane.showMessageDialog(null, "GAME OVER");
				JOptionPane.showMessageDialog(null, "La puntuacion ha sido: "+player.score);
				System.exit(0);
			}
		}
	}
	
	public void game2() {
		usedTime=1000;
		initWorld2();
	
		while (isVisible()) {
			long startTime = System.currentTimeMillis();
			updateWorld();
			checkCollisions();
			paintWorld();
			usedTime = System.currentTimeMillis()-startTime;
			try { 
				 Thread.sleep(SPEED);
			} catch (InterruptedException e) {}
			
			if(objetos.size()<=inmortales+1) {
				JOptionPane.showMessageDialog(null, "Has completado la segunda fase");
				game3();
			}
			if(pelota.getY()>=Stage.HEIGHT-50) {
				vidas--;
				objetos.remove(pelota);
				JOptionPane.showMessageDialog(null, "Has perdido una vida, vidas restantes: "+vidas);
				game2();
				
			}
			if(vidas==0) {
				JOptionPane.showMessageDialog(null, "GAME OVER");
				JOptionPane.showMessageDialog(null, "La puntuacion ha sido: "+player.score);
				System.exit(0);
			}
		}
	}
	
	public void game3() {
		usedTime=1000;
		initWorld3();
	
		while (isVisible()) {
			long startTime = System.currentTimeMillis();
			updateWorld();
			checkCollisions();
			paintWorld();
			usedTime = System.currentTimeMillis()-startTime;
			try { 
				 Thread.sleep(SPEED);
			} catch (InterruptedException e) {}
			
			if(objetos.size()==pasarFase) {
				JOptionPane.showMessageDialog(null, "Has ganado");
				JOptionPane.showMessageDialog(null, "La puntuacion ha sido: "+player.score);
				System.exit(0);
			}
			if(pelota.getY()>=Stage.HEIGHT-50) {
				vidas--;
				objetos.remove(pelota);
				JOptionPane.showMessageDialog(null, "Has perdido una vida, vidas restantes: "+vidas);
				game3();
				
			}
			if(vidas==0) {
				JOptionPane.showMessageDialog(null, "GAME OVER");
				JOptionPane.showMessageDialog(null, "La puntuacion ha sido: "+player.score);
				System.exit(0);
			}
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
	
	public void capsulas() {
		int num=(int) Math.round(Math.random()*10);
		
		
		if(num==1) {
			Capsula vida = new Capsula(this);
			vida.vidaextra=true;
			vida.Imagen();
			vida.setX(posicionXCapsula);
			vida.setY(posicionYCapsula);
			vida.setVy(2);
			objetos.add(vida);
		}
		if(num==2) {
			Capsula bomba = new Capsula(this);
			bomba.bomba=true;
			bomba.Imagen();
			bomba.setX(posicionXCapsula);
			bomba.setY(posicionYCapsula);
			bomba.setVy(2);
			
			objetos.add(bomba);
		}
		if(num==3) {
			Capsula agujero = new Capsula(this);
			agujero.agujero=true;
			agujero.Imagen();
			agujero.setX(posicionXCapsula);
			agujero.setY(posicionYCapsula);
			agujero.setVy(2);
			objetos.add(agujero);
		}
		
		
	}
}
