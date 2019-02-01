import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		palabra = teclado.next();
		palabra = palabra.toLowerCase();
		boolean palindrome= true;//Para ponerlo todo en minuscula por si hay alguna mayus
		for (int i = 0, j = palabra.length() -1 ; i <= j; i++, j--) {
			
				if (palabra.charAt(i) != palabra.charAt(j) && palindrome){
					palindrome = false;
					}
		}

		if (palindrome == true){
			System.out.println("Es palindrome");
		}else 
			System.out.println("No es palindrome");
	    	
	}

}