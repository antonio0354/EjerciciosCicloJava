package arkanoid;

import java.util.ArrayList;
import java.util.List;
import java.awt.image.BufferedImage;

public class Explosion extends Objeto{

	public Explosion(Stage stage) {
		super(stage);
		List<BufferedImage> Sprites = new ArrayList<BufferedImage>();
		Sprites.add(spriteCache.getSprite("explosion1.png"));
		Sprites.add(spriteCache.getSprite("explosion2.png"));
		Sprites.add(spriteCache.getSprite("explosion3.png"));
		
		for (BufferedImage sprite : Sprites) {
			setSpriteNames( new String[] {"explosion1.png"});
			setFrameSpeed(35);
		}
		
	}

	
	
	
	

}
