package Ejercicios_Programacion_Objetos;

import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		
		int opcion=menu("Introduzca el tipo de persona: \n"
				+ "1.-Persona no Identificada \n"
				+ "2.-Persona Identificada",1,2);
		Persona persona=construyePersona(opcion);
		
		opcion=menu("Introduzca el tipo de matricula: \n"
				+ "1.-Bachillerato\n"
				+ "2.-ESO\n"
				+ "3.-FP",1,3);
		Matricula matricula=construyeMatricula(opcion);
		
		System.out.println("Persona: "+ persona +"\nMatricula: "+matricula);
		

}
	
	public static int menu (String strMenu, int minOpcion, int maxOpcion) {
		int opcion=minOpcion;
		do {
			String strPosible=strMenu;
			if(opcion<minOpcion || opcion>maxOpcion) {
				strPosible="Error, pruebe de nuevo\n "+ strMenu;
			}
			opcion=Integer.parseInt(JOptionPane.showInputDialog(strPosible));
			
			
			
		}while(opcion<minOpcion || opcion>maxOpcion);
		
		return opcion;
		
	}
	
	
	public static Persona construyePersona (int tipoPersona) {
		Persona persona= null;
		
		switch(tipoPersona) {
		case 1://no identificada
			persona=new PersonaND();
			((PersonaND)persona).setDescripcion(JOptionPane.showInputDialog("Introduzca la descripcion:"));		
		break;
		case 2://identificada
			persona=new PersonaD();
			((PersonaD)persona).setDni(JOptionPane.showInputDialog("Introduzca el dni:"));
		break;
		
		}
		
		persona.setNombre(JOptionPane.showInputDialog("Introduzca el nombre:"));
		persona.setApellidos(JOptionPane.showInputDialog("Introduzca el apellido:"));
		persona.setFechanac(JOptionPane.showInputDialog("Introduzca la fecha de nacimiento: "));
		
		return persona;
	}
	
	public static Matricula construyeMatricula(int tipoMatricula) {
		Matricula matricula=null;
		
		switch(tipoMatricula) {
		case 1://Bachillerato
			matricula=new Bach();
			((Bach)matricula).setModalidad(JOptionPane.showInputDialog("Introduzca la modalidad:"));
		break;
		case 2://ESO
			matricula=new ESO();
			((ESO)matricula).setPmar(Boolean.parseBoolean(JOptionPane.showInputDialog("Introduzca si es pmar:")));
		break;
		case 3://FP
			matricula=new FP();
			((FP)matricula).setDual(Boolean.parseBoolean(JOptionPane.showInputDialog("Introduzca si es dual:")));
			break;
		}
		
		matricula.setCodigo(JOptionPane.showInputDialog("Introduzca el codigo:"));
		matricula.setFecha(JOptionPane.showInputDialog("Introduzca la fecha de matriculacion:"));
		
		return matricula;
		
		
		
	}
	
	
	
}