package ejercicios_Programacion_Objetos_Ahorcado;

import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;



public class Ahorcado_cacheimagen {


	// Patr�n Singleton
	private static Ahorcado_cacheimagen cache= null;
	
	// Variables con im�genes almacenadas
	private BufferedImage imagenFondo = null;
	
	
	
	/**
	 * El constructor busca los archivos en el sistema y los carga en memoria
	 */
	public Ahorcado_cacheimagen () {
		super();
	}
	
	
	/**
	 * Getter del patr�n Singleton
	 * @return
	 */
	public static Ahorcado_cacheimagen getCache() {
		if (cache == null) {
			cache = new Ahorcado_cacheimagen();
		}
		return cache;
	}
	
	
	/**
	 * M�todo que permite obtener una imagen del sistema de ficheros. No es necesario que 
	 * en este momento de tu aprendizaje entiendas el 100% del siguiente m�todo. Es 
	 * demasiado complejo. S�lo tienes que entender que est� m�todo te devuelve un objeto
	 * de tipo BufferedImage, que podr�s utilizar para poder pintar un archivo de imagen
	 * sobre tu ventana.
	 * @param nombre
	 * @return
	 */
	public BufferedImage getImagen(String oeste) {
		URL url=null;
		try {
			url = getClass().getResource("/ejercicios_Programacion_Objetos_Ahorcado/recursos/" + oeste);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + oeste +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}
	
	public BufferedImage getImagenNavidad(String navidad) {
		URL url=null;
		try {
			url = getClass().getResource("/ejercicios_Programacion_Objetos_Ahorcado/recursos/" + navidad);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + navidad +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}


	/**
	 * @return the imagenTablero
	 */
	public BufferedImage getImagenFondo() {
		if (imagenFondo == null) {
			imagenFondo = getCache().getImagen("oeste.jpg");
		}
		
		return imagenFondo;
	}


	
	
}
