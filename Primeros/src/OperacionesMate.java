import java.util.Scanner;

public class OperacionesMate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado;
		Scanner teclado = new Scanner(System.in);
		int primero = (int) (Math.random()*10);
		int segundo = (int) (Math.random()*10);
		System.out.println("Cuanto es "+ primero + " + " + segundo +"?");
		resultado = teclado.nextInt();
		double solucion =  primero + segundo;
		System.out.println( resultado == solucion );
	}

}
