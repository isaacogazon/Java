import java.util.Scanner;

public class ConvertirGrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introducir grados en Fahrenheit: ");
		Scanner teclado = new Scanner(System.in);
		double fahren = teclado.nextInt();
		System.out.println("En Celsius son: "+ (5.0/9)*(fahren -32));
	}
}