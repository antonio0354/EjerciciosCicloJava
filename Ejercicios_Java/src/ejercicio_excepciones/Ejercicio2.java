package ejercicio_excepciones;


import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String frase = " ";
		
		
		
		try {
			frase = pedirFrase();
			System.out.println(frase);

		} 
		catch(CaracteresBlancoException e) {
			System.out.println("Solo has introducido un espacio en blanco");
			
		}
		 catch(FraseInferior3PalabrasException e) {
			System.out.println("Has introducido una frase inferior a 3 palabras");
		}
		catch (NoApareceBombillaException e) {
			System.out.println("No has introducido la palabra bombilla");
		}
		catch(InsultoException e) {
				System.out.println("Has introducido una palabra malsonante");
			}
		
	}
	
	
	
	public static String pedirFrase() throws NoApareceBombillaException,InsultoException,FraseInferior3PalabrasException,CaracteresBlancoException {
		
		String fraseIntroducida = JOptionPane.showInputDialog("Introduce una frase: ");
		
		String palabras[] = fraseIntroducida.split(" ");
		
		String espacio=" ";
		
		if(fraseIntroducida.equals(espacio)) {
			throw new CaracteresBlancoException();
			
		}
		if(palabras.length<=2) {
			throw new FraseInferior3PalabrasException();
			
		}
		
		if(!fraseIntroducida.contains("bombilla")) {
			throw new NoApareceBombillaException();
		}
		
		if(fraseIntroducida.contains("tonto")||fraseIntroducida.contains("tonta")||fraseIntroducida.contains("idiota")) {
			throw new  InsultoException();
		}
		
		
		
		
		
		
		return fraseIntroducida;
	}

}
