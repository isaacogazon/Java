import java.util.*;

public class ahorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] palabras = {"antonia", "ordenador", "telefono", "ahorcado", "portatil", "pizarra", "libreria", "eclipse", "java", "entorno"};
		String palabrafin = damePalabra(palabras);
		comparar(palabrafin);
	}
	//En éste método comparo las letras que introduzco y si está dentro del array de guiones, los intercambio.
	public static void comparar(String palabra){
		
		int fallos=0;
		int acierto = 0;
		char [] mascara = ponerGuiones(palabra);
	    String introducidas="";			
		//System.out.println(palabra);
		while(acierto(acierto) != palabra.length() && fallos <6) {
			char letra = dameLetra();
			if (introducidas.indexOf(letra)==-1){
				 introducidas+=letra;
			   
                 boolean esta=false;
			    for (int j = 0; j < mascara.length; j++) {
				  if(palabra.charAt(j) == letra){
					  mascara[j] = letra;
					  acierto++;
					  esta = true;
				   }
			    }
			    if (!esta) {
				  fallos++;
				  fallos(fallos);
			    }
			    if(acierto == palabra.length()) System.out.println("Has ganado!!");
			    System.out.println(mascara);
		  }
		 else{
			 System.out.println("La letra ya está introducida, introduce otra letra.");
		 	}	
		}		
	}
	//Cuento los aciertos, para que cuando tenga tantos aciertos como palabra.length haya, diga que ha ganado.
	public static int acierto(int acierto){
		
		System.out.println("Llevas " + acierto + " letras acertadas.");
		return acierto;
	}
			
	public static String damePalabra(String[] palabras){

		int i = (int) (Math.random()*10);
		return palabras[i];
	}
	//Aquí lo que hace es dependiendo de la longitud de la palabra, pone tantos guiones como .length tenga.
	public static char[] ponerGuiones(String palabrafin){
		
		int longitud = (palabrafin.length());
		char [] mascara = new char [longitud];
		System.out.println("La palabra contiene " + longitud + " letras.");
		for (int i = 0; i < longitud; i++) {
			mascara[i] = '-';
		}
		System.out.println(mascara);
		return mascara;
	}
		//Mientras no haya cometido los 6 fallos, está constantemente llamando a éste método para que introduzca letra.
	public static char dameLetra(){
		
		Scanner teclado = new Scanner (System.in);
		System.out.println();
		System.out.println("Introduce una letra: ");
		String palabra = teclado.next();
		char letra = palabra.charAt(0);
		return Character.toLowerCase(letra);		
	}
	//Aquí voy sumando los fallos, y en el caso de que llegue a 6, acaba el juego y pierde.
	public static void fallos(int fallos){
		if (fallos == 6)
			System.out.println("Has fallado 6 veces, ¡¡GAME OVER!!");
		if(fallos == 1)
			System.out.println("Llevas "+fallos+" fallo.");
		else System.out.println("Llevas "+fallos+" fallos.");
		//return fallos;
	}
}