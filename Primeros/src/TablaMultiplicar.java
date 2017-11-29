import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0;
		
		do{
		System.out.println("Introduce la tabla que desea, por ejemplo, si quieres la del 3, "
				+ "introduce el numero 3");
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		System.out.println(num + " x " + cont +" = " + num*cont);
		}while (++cont<11);
			

	}

}
