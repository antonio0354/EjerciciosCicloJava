package ejercicios_Programacion_Objetos_Ahorcado;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ahorcado_ventana extends Canvas {

	public static final int WIDTH = 700;
	public static final int HEIGHT = 700;
	
	
	
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
		
		
			if(Ahorcado_juego.getJuego().getIntentosfallidos()>0) {
				
				
				//piernaDer
				g.setColor(Color.red);
				g.fillRect(227,250,20,70);
				
				
			}else {
				//cuerpo
				g.setColor(Color.green);
				g.fillRect(205, 140, 42, 110);
				
				//cabeza
				g.setColor(Color.green);
				g.fillOval(200, 90, 50, 50);
				
				//brazoDer
				g.setColor(Color.green);
				g.fillRect(245, 140, 60, 20);
				
				//brazoIzq
				g.setColor(Color.green);
				g.fillRect(145, 140, 60, 20);
				
				//piernaIzq
				g.setColor(Color.green);
				g.fillRect(205,250,20,70);
				
				//piernaDer
				g.setColor(Color.green);
				g.fillRect(227,250,20,70);
				
				
			}
			
			//soporte
			g.setColor((Color.BLACK));
			g.fillRect(10, 500, 200, 10);
			
			//paloLargo
			g.setColor(Color.black);
			g.fillRect(100,10,15,500);
			
			//palocorto
			g.setColor(Color.black);
			g.fillRect(115,10,200,10);
			
			//cuerda
			g.setColor(Color.black);
			g.fillRect(223,10,5,81);
			
				
				
			
				
			
				
			
		
		
		
		
		
		
		
	}
	
}
