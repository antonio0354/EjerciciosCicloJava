package arkanoid2;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;





public class Objeto {
	protected int x,y,contador=0;
	protected boolean markedForRemoval;
	protected boolean explosion = false;
	protected int num;
	protected boolean inmortal=false;
	protected int golpes=0;
	
	/**
	 * @return the golpes
	 */
	public int getGolpes() {
		return golpes;
	}

	/**
	 * @param golpes the golpes to set
	 */
	public void setGolpes(int golpes) {
		this.golpes = golpes;
	}

	/**
	 * @return the inmortal
	 */
	public boolean isInmortal() {
		return inmortal;
	}

	/**
	 * @param inmortal the inmortal to set
	 */
	public void setInmortal(boolean inmortal) {
		this.inmortal = inmortal;
	}

	/**
	 * @return the explosion
	 */
	public boolean isExplosion() {
		return explosion;
	}

	/**
	 * @param explosion the explosion to set
	 */
	public void setExplosion(boolean explosion) {
		this.explosion = explosion;
	}

	public void remove() {
		markedForRemoval = true;
	}
	
	public void colisionProducidaConOtroActor(Objeto actorColisionado) {
	}
	
	public boolean isMarkedForRemoval() {
		return markedForRemoval;
	}
	
	protected int width, height;
	protected String[] spriteNames;
	protected int currentFrame;
	protected int frameSpeed;
	protected int t;
	protected static Stage stage;
	protected SpriteCache spriteCache;
	
	public Objeto(Stage stage) {
		this.stage = stage;
		spriteCache = stage.getSpriteCache();
		currentFrame = 0;
		frameSpeed = 1;
		t=0;
	}
	
	public void paint(Graphics2D g){
		g.drawImage( spriteCache.getSprite(spriteNames[currentFrame]), x,y, stage );
	}
	
	public int getX()  { return x; }
	public void setX(int i) {	x = i; }

	public int getY() {	return y; }
	public void setY(int i) { y = i; }
	
	public int getFrameSpeed() {return frameSpeed;	}
	public void setFrameSpeed(int i) {frameSpeed = i;	}
	
	
	public void setSpriteNames(String[] names) { 
		spriteNames = names;
		height = 0;
		width = 0;
		for (int i = 0; i < names.length; i++ ) {
  		BufferedImage image = spriteCache.getSprite(spriteNames[i]);
	  	height = Math.max(height,image.getHeight());
		  width = Math.max(width,image.getWidth());
		}
	}			
	
	public int getHeight() { return height; }
	public int getWidth() {	return width;	}
	public void setHeight(int i) {height = i;	}
	public void setWidth(int i) {	width = i;	}

	public void act() {
		
		if (num % frameSpeed == 1){
			num=0;
  		currentFrame = (currentFrame + 1) % spriteNames.length;
		}
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x,y,width,height);
	}
	
	public void collision(Objeto a){
		
		
	}
}
