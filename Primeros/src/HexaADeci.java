import java.util.Scanner;

public class HexaADeci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un número hexadecimal de 4 cifras: ");
		Scanner teclado = new Scanner (System.in);
		String numero = teclado.nextLine();
		
		
		System.out.println("El primer numero es " + numero.charAt(0));
		
	}

}
