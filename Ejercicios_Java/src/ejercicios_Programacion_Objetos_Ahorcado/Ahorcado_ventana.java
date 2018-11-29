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
		
		g.setColor(Color.green);
		g.fillRect(145, 140, 40, 110);
		
		g.setColor(Color.green);
		g.fillOval(140, 90, 50, 50);
		
		g.setColor(Color.green);
		g.fillRect(185, 140, 60, 20);
		
		g.setColor(Color.green);
		g.fillRect(85, 140, 60, 20);
		
		
		
	}
	
}
