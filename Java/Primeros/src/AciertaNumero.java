import java.util.Scanner;

public class AciertaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int) (Math.random()*100+1);
		
		System.out.println("Intenta acertar el numero aleatorio");
		Scanner teclado = new Scanner (System.in);
		int usu = teclado.nextInt();
		
		while (num != usu) {
			if (usu > num){
				System.out.println("El numero introducido es menor");
				System.out.println("Introduce otro numero.");
				usu = teclado.nextInt();
			}
			else System.out.println("El numero introducido es mayor");
			System.out.println("Introduce otro numero.");
			usu = teclado.nextInt();
		}
		System.out.println("Has acertado! El numero era "+num);

	}

}
