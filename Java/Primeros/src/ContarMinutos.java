import java.util.Scanner;

public class ContarMinutos {

	public static void main(String[] args) {
		
		System.out.println("Introduce cuantos segundos quieres calcular");
		Scanner teclado = new Scanner(System.in);
		int segundos = teclado.nextInt();
		int minutos = segundos / 60;
		int restoseg = segundos % 60;
		System.out.println("Son " + minutos + " minutos y " + restoseg + " segundos de resto.");
	}

}
