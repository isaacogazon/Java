import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Éstos son los primeros 50 números primos: ");
		
		int n, divisor, i;
		Scanner teclado = new Scanner (System.in);
		n = teclado.nextInt();
		for ( i = 2; n>0; i++) {
			
		
		for (divisor = 2; divisor<i && i%divisor!= 0 ; divisor++) 
			if(divisor==i){
				if(i!=2)
					System.out.print(", ");
				System.out.print(i);
				
				n--;
			}
		}
		System.out.println("\n");
		
		
		

	}

}
