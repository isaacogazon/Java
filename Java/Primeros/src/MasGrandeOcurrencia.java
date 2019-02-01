import java.util.Scanner;

public class MasGrandeOcurrencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String uno ="", dos="";
		
		System.out.println("Introduce el primer numero");
		Scanner teclado = new Scanner(System.in);
		int num1 = teclado.nextInt();
		System.out.println("Introdice el segundo numero: ");
		int num2 = teclado.nextInt();
		
		if(num1 > num2){
			System.out.println("El mayor entre "+num1+ " y "+num2+" es: "+ num1);
			uno= Integer.toString(num1);
			
			int i = uno.charAt(0);
			for (; i <= uno.length()-1; i++) {
				int j = uno.charAt(0);
				if (i > j)
					
				j ++;
				
				
			}System.out.println(i + " es el mayor de todos ellos.");
			
		
		}else System.out.println("El mayor entre "+num1+ " y "+num2+" es: "+ num2);
			dos= Integer.toString(num2);
		
		
		
	
	}

}
