package ahorcado;
import java.util.Scanner;
public class TestAhorcado {

	private static Scanner teclado;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ahorcado juego = new Ahorcado();
		
		System.out.println("Resuelve el ahorcado: ");
		System.out.println("La palabra es "+ juego.getPalabra());
		do {	
		System.out.println(juego.introducidas);
		System.out.println(juego.getMascara());
		System.out.println("Introduce una letra: ");
		char letra = getLetra();
		if(juego.checkLetra(letra) == false) {
			System.out.println("Llevas "+juego.fallos +" fallos.");
		}
		}while (juego.fallos != 6 && juego.isWin()==false);
		if (juego.isWin()) {
			System.out.println("Has ganado!!");
			System.out.println(juego.getMascara());
		}
		else if(juego.fallos == 6) System.out.println("Has perdido...");
	}
	public static char getLetra() {
		teclado = new Scanner (System.in);
		String palabra = teclado.next();
		char letra = palabra.charAt(0);
		return Character.toLowerCase(letra);
	}
}
