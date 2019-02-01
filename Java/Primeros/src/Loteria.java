import java.util.Scanner;

public class Loteria {

	public static void main(String[] args) {

		int num1 =  (int) (Math.random()*100);
		int num2 = (int) (Math.random()*100);
		
		System.out.println("Introduce el primer numero de dos digitos: ");
		Scanner teclado = new Scanner(System.in);
		int primero = teclado.nextInt();
		System.out.println("Introdice el segundo numero de dos digitos: ");
		int segundo = teclado.nextInt();
		
		int num1o1 = num1%10;
		int num1o2 = num1/10;
		int num2o1 = num2%10;
		int num2o2 = num2/10;
		int primero1 = primero%10;
		int primero2 = primero/10;
		int segundo1 = segundo%10;
		int segundo2 = segundo/10;
		
		if((num1 == primero) && (num2 == segundo))
			System.out.println("Has ganado 10.000$!!!");
		else if (num1 == primero || num2 == segundo || num1 == segundo || num2 == primero)
			System.out.println("Has ganado 3000$!!!");
		
		else if (num1o1 == primero1|| num1o1 ==primero2  || num1o1 == segundo1 || num1o1 == segundo2||
				num1o2 == primero1 || num1o2 ==primero2  || num1o2 == segundo1 || num1o2 == segundo2||
				num2o1 == primero1 || num2o1 ==primero2  || num2o1 == segundo1 || num2o1 == segundo2||
				num2o2 == primero1 || num2o2 ==primero2  || num2o2 == segundo1 || num2o2 == segundo2)
			System.out.println("Has ganado 1000$!!!");
		System.out.println("Los numero de la loteria son: " + num1 + " y " +num2 +". Y los que has introducido "
				+ "son " + primero +" y "+ segundo);
	}

}
