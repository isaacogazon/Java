import java.util.Scanner;

public class MasaCorporal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu altura en metros");
		double altura = teclado.nextDouble();
		System.out.println("Introduce tu peso en kilos");
		double peso = teclado.nextDouble();
		
		double masa = peso / Math.pow(altura, 2);
		
		if (masa < 18.5)
			System.out.println("Underweight");
		else if (masa >= 18.5)
			if (masa<25.0)
				System.out.println("Normal");
		else if (masa >= 25.0)
			if (masa <30.0)
				System.out.println("Overweight");
		else if (masa >= 30.0)
			System.out.println("Obese");
	}

}
