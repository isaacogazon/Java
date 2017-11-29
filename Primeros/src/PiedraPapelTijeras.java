import java.util.Scanner;

public class PiedraPapelTijeras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pc = (int) Math.random()*3;
		
		System.out.println("Introduce 0 para piedra, 1 para papel o 2 para tijeras:");
		Scanner teclado = new Scanner(System.in);
		int usu = teclado.nextInt();
		 if (usu == pc)
			 System.out.println("Empate!!");
		 else {
		switch (pc) {
		case 0:
				if (usu == 1)
					System.out.println("Has ganado, papel gana a piedra.");
				else System.out.println("Has perdido, piedra gana a tijeras.");
			break;
		case 1:
			if (usu == 0)
				System.out.println("Has perdido, papel gana a piedra.");
			else System.out.println("Has ganado, tijeras gana a papel.");
			
			break;
		case 2: 
			if (usu == 0)
				System.out.println("Has ganado, piedra gana a tijeras.");
			else System.out.println("Has pedido, tijeras gana a papel.");
			
			break;
			}
		 }
	}
}
