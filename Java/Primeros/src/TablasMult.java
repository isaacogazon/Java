import java.util.Scanner;

public class TablasMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un numero, y se visualizara la tabla de ese numero, y de todas "
				+ "las anteriores.");
		Scanner teclado = new Scanner (System.in);
		int num = teclado.nextInt();
		 
		for (int rest = 0; rest < num; num--) {	
			System.out.println("");
			System.out.println("Tabla del "+num);
		for (int i = 0; i <=10; i++) {
			System.out.println(num+" x "+i+" = "+num*i);	
			}
		}

	}

}
