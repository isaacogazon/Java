import java.util.Scanner;

public class MaxComDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int i = 1;
		System.out.println("Introduce el primer numero");
		int num1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		int num2 = teclado.nextInt();
		if(num1%num2==0){
		for (; i <= num1 && i <= num2; i++) {
			
			if(num1%i==0 || num2%i==0);	
		}
		System.out.println("El maximo comun divisor es "+(i - 1));
		}else System.out.println("El maximo comun divisor es 1.");

	}

}
