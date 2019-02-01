package ahorcado;



public class Ahorcado {
	
	private String palabra;
	private char[] mascara;
	int fallos = 0;
	
	//boolean isIn = true;
	String introducidas = "";
	
	public Ahorcado() {
		String [] palabras = {"antonia", "ordenador", "telefono", "ahorcado", "portatil", "pizarra", "libreria", "eclipse", "java", "entorno"};
		int j = (int) (Math.random()*10);
		palabra = palabras[j];
		mascara = new char [palabra.length()];
		for (int i = 0; i < palabra.length(); i++) {
			mascara[i] = '-';
		}
	}
	
	public String getPalabra() {
		return palabra;
	}
	
	public String  getMascara() {
		 String m ="";
		 for (int i = 0; i < palabra.length(); i++) {
				m = m+mascara[i] + " " ;
			}
		return m;
	}
	
	public int setFallos() {
		fallos++;
		return fallos;
	}
	
	public boolean isWin() {
		boolean win = true;
		for (int j = 0; j < mascara.length; j++) {
			if (mascara[j]== '-')
				win = false;
		}
		return win;
	}
	public boolean checkLetra(char letra) {
		boolean isIn = false;
		if (introducidas.indexOf(letra) == -1){
			//isIn=false;
			introducidas += letra;
		    for (int j = 0; j < mascara.length; j++) {
				  if(palabra.charAt(j) == letra){
					  mascara[j] = letra;
					  isIn = true;
				   }
		     }
	    }
	  if (!isIn) setFallos();
	  return isIn;
	}
}
