package application;

public class Numero {
	VistaEj1 v;
	
	int uno1;
	int dos1;
	char operacion1;
	
	int uno2;
	int dos2;
	char operacion2;
	
	public Numero(String numero1, String numero2) {
		numero1 = v.getPrimernum().getText();
		numero2 = v.getSegundonum().getText();
		
		uno1 = (int) numero1.charAt(0);
		dos1 = (int) numero1.charAt(2);
		operacion1 = numero1.charAt(1);
		
		uno2 =(int) numero1.charAt(0);
		dos2 =(int) numero1.charAt(2);
		operacion2 = numero1.charAt(1);
	}

}
