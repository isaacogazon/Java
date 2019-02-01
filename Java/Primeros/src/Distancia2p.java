import java.util.Scanner;

public class Distancia2p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el valor de X1");
		int x1 = teclado.nextInt();
		System.out.println("Introduce el valor de Y1");
		int y1 = teclado.nextInt();
		System.out.println("Introduce el valor de X2");
		int x2 = teclado.nextInt();
		System.out.println("Introduce el valor de Y2");
		int y2 = teclado.nextInt();
		
		System.out.println("La distancia es: "+ (double) Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2)));
		}

	}
