package arkanoid2;

import java.util.Date;

public class Capsula extends Objeto {
	protected boolean bomba=false;
	protected boolean vidaextra=false;
	protected boolean agujero=false;
	private int Vy=0;
	
	
	public void act() {
		super.act();
		
		
		y+=Vy;
		
		
		
		
	}
	
	/**
	 * @return the vy
	 */
	public int getVy() {
		return Vy;
	}

	/**
	 * @param vy the vy to set
	 */
	public void setVy(int vy) {
		Vy = vy;
	}

	public void Imagen() {
		
		if(bomba==true) {
			setSpriteNames( new String[] {"bomba.png"});
			setFrameSpeed(35);
			bomba=false;
		}
		if(vidaextra==true) {
			setSpriteNames( new String[] {"vidaextra.png"});
			setFrameSpeed(35);
			vidaextra=false;
		}
		if(agujero==true) {
			setSpriteNames( new String[] {"agujeronegro.png"});
			setFrameSpeed(35);
			agujero=false;
			
		}
		
	}

	/**
	 * @return the bomba
	 */
	public boolean isBomba() {
		return bomba;
	}

	/**
	 * @param bomba the bomba to set
	 */
	public void setBomba(boolean bomba) {
		this.bomba = bomba;
	}

	/**
	 * @return the vidaextra
	 */
	public boolean isVidaextra() {
		return vidaextra;
	}

	/**
	 * @param vidaextra the vidaextra to set
	 */
	public void setVidaextra(boolean vidaextra) {
		this.vidaextra = vidaextra;
	}

	/**
	 * @return the agujero
	 */
	public boolean isAgujero() {
		return agujero;
	}

	/**
	 * @param agujero the agujero to set
	 */
	public void setAgujero(boolean agujero) {
		this.agujero = agujero;
	}

	public Capsula(Stage stage) {
		super(stage);
		
	
	}
	
	
	
	


}
