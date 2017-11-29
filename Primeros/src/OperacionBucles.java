import java.util.Scanner;

public class OperacionBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int respuesta;
		int intentos = 0;
		int acierto=0;
		int fallo=0;
		
			
			while (intentos != 5) {
				int a = (int)(Math.random()*10);
				int b = (int)(Math.random()*10);
				intentos++;
				System.out.println("Realiza la siguiente operacion");
				System.out.println(a+" + " + b + " =");
				respuesta = teclado.nextInt();
				if (a + b == respuesta){
					System.out.println("Has acertado.");
				acierto++;
				}
				else {System.out.println("Has fallado.");
				fallo++;

				}
		}
			System.out.println("Has intentado "+ intentos + " veces. Has acertado "+ acierto + " veces, "
					+ "y has fallado "+fallo+ " veces.");
	}
}

