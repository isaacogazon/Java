import java.util.Scanner;

public class distanciaEntreDosPuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int op;
		final int TOPE = 7;
		int punto;
		int[] arrayDeX = new int[TOPE];
		int[] arrayDeY = new int[TOPE];
		
		
		do{
			op = menu();
		switch (op) {
		case 1:
			
			System.out.println("Dime el punto donde se quiere almacenar:");
			punto = teclado.nextInt();
			arrayDeX[punto] = coordenada('X');
			arrayDeY[punto] = coordenada('Y');
			
			
			break;
		case 2:
				calculaDistanciaPuntos(arrayDeX, arrayDeY);
			
			break;
		case 3:
			
			break;

		default:
			break;
		}
		}while (op != 3);

	}
	public static int menu(){
		Scanner teclado = new Scanner (System.in);
		System.out.println("Options menu.");
		System.out.println("1.- Intro a point.");
		System.out.println("2.- Distance between two point.");
		System.out.println("3.- Exit.");
		
		int op = teclado.nextInt();
		return op;
	}
	public static int coordenada(char c){
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dime el coordenada " +c+ ":");
		int x = teclado.nextInt();
		return x;
	}
	public static void calculaDistanciaPuntos(int[] arrayDeX, int [] arrayDeY){
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introdice el primer punto:");
		
		int punto1 = teclado.nextInt();
		int x1 = arrayDeX[punto1];
		int y1 = arrayDeY[punto1];
		System.out.println("Introdice el segundo punto:");
		
		int punto2 = teclado.nextInt();
		int x2 = arrayDeX[punto2];
		int y2 = arrayDeY[punto2];
		
		System.out.println("La distancia es: "+ (double) Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2)));
	}

}
