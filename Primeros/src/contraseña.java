import java.util.Scanner;

public class contraseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce una contraseña, la primera letra debe de ser mayuscula y contener al menos 2 digitos y ser mayor o igual de 8 caracteres:");
		Scanner teclado = new Scanner(System.in);
		String password = teclado.next();
		boolean correct = true;
		
		if(correct){
			if (!cheqPrimeraLetra(password)){
				System.out.println("La primera letra debe de ser una mayuscula.");
			}
			
				if (password.length()<8){
					System.out.println("La password debe tener al menos 8 caracteres");
				}
				
					if (!atLeast2Digits(password)){
						System.out.println("La password debe contener 2 digitos.");
					}
						if (!cheqSoloLetrasyNumeros(password)){
							System.out.println("La password solo puede contener letras y numeros.");
						}
		} correct = false;
		//if(correct != true) System.out.println("La contraseña está escrita dentro de los parametros.");

	}
	
	public static boolean cheqPrimeraLetra(String palabra){
		if (palabra.charAt(0) >='A' && palabra.charAt(0) <='Z')
			return true;
			
		return false;
	}
	
	public static boolean atLeast2Digits(String p){
		int total =0;
		for (int i = 0; i< p.length() ;i++)
			if (p.charAt(i)>= '0' && p.charAt(i)<='9')
				total++;
		if (total >=2)
			return true;
		return false;
	}
	
	public static boolean cheqSoloLetrasyNumeros(String p){
		for (int i = 0; i< p.length() ;i++)
			if (p.charAt(i) >= 'a' && p.charAt(i) <= 'z' || p.charAt(i) >= '0' && p.charAt(i) <= '9' || p.charAt(i) >= 'A'
			&& p.charAt(i) <= 'Z')
				return true;
		return false;
		
	}

}
