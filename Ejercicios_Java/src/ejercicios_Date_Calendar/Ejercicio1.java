package ejercicios_Date_Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	
	
	public static void main(String[] args) {
		
		//FechaParseada();
		//sumaCalendar();
		//restaSemanas();
		//sumaCalendar300dias();
		//sumaCalendar4años();
		diferenciaRomaNewYork();
	}
	
	public static void FechaParseada(){
		Date fechaParseada = null;
		
		String fecha=JOptionPane.showInputDialog("Introduzca la fecha: ");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");

		try {
			fechaParseada = sdf2.parse(fecha);
		} catch (ParseException e) {
			System.out.println ("Error en el parseo de la fecha");
			e.printStackTrace();
		}
		
		System.out.println("Fecha parseada: " + sdf2.format(fechaParseada));
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(fechaParseada);
		System.out.println(fechaParseada);
		
		
		
		System.out.print(" A�o: " + cal.get(Calendar.YEAR));
		System.out.print(" Mes(0 es Enero): " + cal.get(Calendar.MONTH));
		System.out.print(" Dia: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.print(" Hora: " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.print(" Minutos: " + cal.get(Calendar.MINUTE));
		System.out.print(" Segundos: " + (cal.get(Calendar.SECOND))+"\n");

		System.out.print("Año : "+ new SimpleDateFormat("yyyy").format(fechaParseada));
		System.out.print("Mes : "+ new SimpleDateFormat("MM").format(fechaParseada));
		System.out.print("Dia : "+ new SimpleDateFormat("dd").format(fechaParseada));
		System.out.print("Hora : "+ new SimpleDateFormat("HH").format(fechaParseada));
		System.out.print("Minutos : "+ new SimpleDateFormat("mm").format(fechaParseada));
		System.out.print("Segundos : "+ new SimpleDateFormat("ss").format(fechaParseada));
		
	}
	
	
	
	public static void sumaCalendar() {
		
		//suma 3 dias
		Calendar ahora = Calendar.getInstance();
		ahora.add(Calendar.DAY_OF_MONTH, 10);
		System.out.println("Fecha actual : " + ahora.getTime());

		ahora.add(Calendar.DAY_OF_MONTH, +3);
		System.out.println("Ahora despues de 3 dias : " + ahora.getTime());
		
		
		
	}
	
	public static void restaSemanas() {
		
		//resta 2 semanas
		Calendar ahora = Calendar.getInstance();
		ahora.add(Calendar.WEEK_OF_MONTH, 3);
		System.out.println("Fecha actual : " + ahora.getTime());

		ahora.add(Calendar.WEEK_OF_MONTH, -2);
		System.out.println("Ahora 2 semanas atras : " + ahora.getTime());
		
		
		
	}
	
	public static void sumaCalendar300dias() {
		
		//suma 3 dias
		Calendar ahora = Calendar.getInstance();
		ahora.add(Calendar.DAY_OF_MONTH, 10);
		System.out.println("Fecha actual : " + ahora.getTime());

		ahora.add(Calendar.DAY_OF_MONTH, +300);
		System.out.println("Ahora despues de 3 dias : " + ahora.getTime());
		
		
		
	}
	
	public static void sumaCalendar4años() {
		
		//suma 3 dias
		Calendar ahora = Calendar.getInstance();
		ahora.add(Calendar.YEAR, 0);
		System.out.println("Fecha actual : " + ahora.getTime());

		ahora.add(Calendar.YEAR, +4);
		System.out.println("Ahora despues de 4 años : " + ahora.getTime());
		
		
		
	}
	
	public static void diferenciaRomaNewYork() {
		Calendar ahoraEnRoma = Calendar.getInstance(TimeZone.getTimeZone("Europa/Roma"));
		Calendar ahoraEnNewYork = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		
		System.out.println("Hora en Roma: " + ahoraEnRoma.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora en New York: " + ahoraEnNewYork.get(Calendar.HOUR_OF_DAY));
	}

}
