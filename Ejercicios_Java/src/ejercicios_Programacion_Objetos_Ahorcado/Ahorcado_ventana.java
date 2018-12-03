package ejercicios_Programacion_Objetos_Ahorcado;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ahorcado_ventana extends Canvas {

	public static final int WIDTH = 700;
	public static final int HEIGHT = 700;
	public static Ahorcado_ventana ventana=null;
	
	
	public Ahorcado_ventana() {
		
		JFrame ventana=new JFrame("Ahorcado");
		
		ventana.setBounds(300,0,WIDTH,HEIGHT);
		
		JPanel panel = (JPanel)ventana.getContentPane();
		panel.add(this);
		
		this.setBounds(0, 0, WIDTH, HEIGHT);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		ventana.setResizable(true);
		
		
		
		
	}
	
	
	public void paint (Graphics g) {
		
	g.drawImage(Ahorcado_cacheimagen.getCache().getImagen("oeste.jpg"),0,0,this);
		
				if(Ahorcado_juego.getJuego().getIntentosfallidos()>0) {
					//cuerpo
					g.setColor(Color.red);
					g.fillRect(205, 240, 42, 110);
					
				}else {
					//cuerpo
					g.setColor(Color.green);
					g.fillRect(205, 240, 42, 110);
					
				}
				
				if(Ahorcado_juego.getJuego().getIntentosfallidos()>1) {
					//cabeza
					g.setColor(Color.red);
					g.fillOval(200,190, 50, 50);
					
				}else {
					//cabeza
					g.setColor(Color.green);
					g.fillOval(200, 190, 50, 50);
					
				}
				
				if(Ahorcado_juego.getJuego().getIntentosfallidos()>2) {
					//brazoDer
					g.setColor(Color.red);
					g.fillRect(247, 240, 60, 20);
					
				}else {
					//brazoDer
					g.setColor(Color.green);
					g.fillRect(247, 240, 60, 20);
					
				}
				
				if(Ahorcado_juego.getJuego().getIntentosfallidos()>3) {
					//brazoIzq
					g.setColor(Color.red);
					g.fillRect(145, 240, 60, 20);
					
				}else {
					//brazoIzq
					g.setColor(Color.green);
					g.fillRect(145, 240, 60, 20);
					
				}
				
				if(Ahorcado_juego.getJuego().getIntentosfallidos()>4) {
					//piernaIzq
					g.setColor(Color.red);
					g.fillRect(205,350,20,70);
					
				}else {
					//piernaIzq
					g.setColor(Color.green);
					g.fillRect(205,350,20,70);
					
				}
				
				if(Ahorcado_juego.getJuego().getIntentosfallidos()>5) {
					//piernaDer
					g.setColor(Color.red);
					g.fillRect(227,350,20,70);
					
				}else {
					//piernaDer
					g.setColor(Color.green);
					g.fillRect(227,350,20,70);
					
				}
				

			//soporte
			g.setColor((Color.BLACK));
			g.fillRect(10, 600, 200, 10);
			
			//paloLargo
			g.setColor(Color.black);
			g.fillRect(100,110,15,500);
			
			//palocorto
			g.setColor(Color.black);
			g.fillRect(115,110,200,10);
			
			//cuerda
			g.setColor(Color.black);
			g.fillRect(223,110,5,81);
			
				
	
	}
	
	public static Ahorcado_ventana getventana() {
		if(ventana==null) {
			ventana=new Ahorcado_ventana();
			
		}
		return ventana;
	}
	
}
