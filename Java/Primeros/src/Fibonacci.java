import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cuantos numeros de la seria de Fibonacci quieres?");
		Scanner teclado = new Scanner (System.in);
		int num = teclado.nextInt();
		
		int primero = 0;
		int segundo = 1;
		if (num >= 1)
			System.out.print("\t"+primero);
		if (num>=2)
			System.out.print("\t"+segundo);
		for (int i = 2;i<num;i++){
		      int tercero = primero + segundo;
		      if (i%7 ==0) System.out.println();
		      System.out.print("\t"+tercero);
		      primero = segundo;
		      segundo = tercero;
		}

	}

}
