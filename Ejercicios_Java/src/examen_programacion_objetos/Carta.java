package examen_programacion_objetos;

public class Carta {

	private  int valor;
	private  String valorLetra=" ";
	private  String palo = " ";
	private  int id=0;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", valorLetra=" + valorLetra + ", palo=" + palo + ", id=" + id + "]";
	}

	public static void setCarta(Carta carta) {
		Carta.carta = carta;
	}
	
	private static Carta carta=null;

	public static Carta getCarta() {
		if(carta==null) {
			carta=new Carta();
		}
		return carta;
	}
	
	public void valorcarta () {
		boolean letra=false;	
		valor=1;
		palo="Picas";
		for(int i=1;i<14;i++ ) {
			letra=false;
			if(valor==1) {
				valorLetra="A";
				letra=true;
			}else {
				if(valor==11) {
					valorLetra="J";
					letra=true;
				}else {
					if(valor==12) {
						valorLetra="Q";
						letra=true;
					}else {
						if(valor==13) {
							valorLetra="K";
							letra=true;
						}
					}
				}
				
			}
			id++;
			if(letra==true) {
				System.out.print(valorLetra);
				System.out.print(" de "+ palo+" id="+id+"\n");
			}else {
				System.out.print(valor);
				System.out.print(" de "+ palo+" id="+id+"\n");
			}
			
			
			valor++;
			
		}
		
		valor=1;
		palo="Diamantes";
		for(int i=1;i<14;i++ ) {
			letra=false;
			if(valor==1) {
				valorLetra="A";
				letra=true;
			}else {
				if(valor==11) {
					valorLetra="J";
					letra=true;
				}else {
					if(valor==12) {
						valorLetra="Q";
						letra=true;
					}else {
						if(valor==13) {
							valorLetra="K";
							letra=true;
						}
					}
				}
				
			}
			id++;
			if(letra==true) {
				System.out.print(valorLetra);
				System.out.print(" de "+ palo+" id="+id+"\n");
			}else {
				System.out.print(valor);
				System.out.print(" de "+ palo+" id="+id+"\n");
			}
			
			
			valor++;
			
		}
		
		valor=1;
		palo="Treboles";
		for(int i=1;i<14;i++ ) {
			letra=false;
			if(valor==1) {
				valorLetra="A";
				letra=true;
			}else {
				if(valor==11) {
					valorLetra="J";
					letra=true;
				}else {
					if(valor==12) {
						valorLetra="Q";
						letra=true;
					}else {
						if(valor==13) {
							valorLetra="K";
							letra=true;
						}
					}
				}
				
			}
			id++;
			if(letra==true) {
				System.out.print(valorLetra);
				System.out.print(" de "+ palo+" id="+id+"\n");
			}else {
				System.out.print(valor);
				System.out.print(" de "+ palo+" id="+id+"\n");
			}
			
			
			valor++;
			
		}
		
		valor=1;
		palo="Corazones";
		for(int i=1;i<14;i++ ) {
			letra=false;
			if(valor==1) {
				valorLetra="A";
				letra=true;
			}else {
				if(valor==11) {
					valorLetra="J";
					letra=true;
				}else {
					if(valor==12) {
						valorLetra="Q";
						letra=true;
					}else {
						if(valor==13) {
							valorLetra="K";
							letra=true;
						}
					}
				}
				
			}
			id++;
			if(letra==true) {
				System.out.print(valorLetra);
				System.out.print(" de "+ palo+" id="+id+"\n");
			}else {
				System.out.print(valor);
				System.out.print(" de "+ palo+" id="+id+"\n");
			}
			
			
			valor++;
			
		}
		
		
		
		
		
		
	}

	

	public Carta() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
