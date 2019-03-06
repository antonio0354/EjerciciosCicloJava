package xxx;


public class Respuesta  extends NumeroEspecialIntroducidoAdapter  {

	@Override
	public void numeroImparIntroducido(NumeroEspecialIntroducidoEvent event) {
		System.out.println("han introducido la palabra a buscar: " + event.getPalabraIntroducido());
	}

}
