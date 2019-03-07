package ejercicio_excepciones;


import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String frase = " ";
		
		try {
			frase = pedirFraseInsulto();
			System.out.println(frase);

		} catch (NoApareceBombillaException e) {
			System.out.println("No has introducido la palabra bombilla");
		}
		catch(InsultoException e) {
			System.out.println("Has introducido una palabra malsonante");
		}
	}
	
	
	
	public static String pedirFraseInsulto() throws NoApareceBombillaException,InsultoException{
		
		String fraseIntroducida = JOptionPane.showInputDialog("Introduce una frase: ");
		
		if(!fraseIntroducida.contains("bombilla")) {
			throw new NoApareceBombillaException();
		}
		
		if(fraseIntroducida.contains("tonto")||fraseIntroducida.contains("tonta")||fraseIntroducida.contains("idiota")) {
			throw new  InsultoException();
		}
		
		
		return fraseIntroducida;
	}

}
