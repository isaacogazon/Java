package banco;

import java.util.Scanner;

public class TestBankAccount {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		BankAccount[] cuentas = new BankAccount[5];
		
		for (int i=1; i<cuentas.length; i++)
			cuentas[i] = new BankAccount();
		
		int op = 0;
		int opm=0;
		
		do {
		     opm=menu1();	
		     if (opm==1) {
		    	 System.out.println("Introduce la cuenta que desea administrar: ");
		 		int select = teclado.nextInt();
		     
		         if (select >=0 && select < cuentas.length) {
		        
			     do {
			       op = menu();
			       switch (op) {
			       case 1:
			    	   cuentas[select].getIban();
			    	   //c.fund(300);
			    	   System.out.println("Su numero de cuenta es: "+cuentas[select].getIban());
			    	   break;
			       case 2:
			    	   	System.out.println("Introduce la cantidad que desea sacar:");
			    	   	
			    	   	int cant = teclado.nextInt();
				
			    	   	if(cuentas[select].withdraw(cant)==3)
			    	   		System.out.println("Gracias por su visita, su balance es: "+cuentas[select].getBanalance());
			    	   	else {
				
			    	   		if (cuentas[select].withdraw(cant)==1) 
			    	   			System.out.println("Imposible atenderle. Sin saldo suficiente, eres un pobre.");
			    	   		else 
			    	   			if(cuentas[select].withdraw(cant)==2)
			    	   				System.out.println("Solo se puede sacar multiplo de 10.");
			    	   	}
			    	   	break;
			       case 3:
			    	   System.out.println("Su balance es: "+ cuentas[select].getBanalance());
			    	   break;
			       case 4:
			    	   System.out.println("Introduce la cantidad a introducir: ");
			    	   int sum = teclado.nextInt();
			    	   cuentas[select].fund(sum);
			    	   break;
			       case 5:
			    	   break;
			       default:
			    	   System.out.println("La opción introducida no está en el menú.");
			    	   break;
			       }
			     }while (op != 5);
		         }
		     }
		}while (opm!=2);
	}
	public static int menu() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("1-. Ver número de cuenta.");
		System.out.println("2-. Sacar dinero.");
		System.out.println("3-. Ver el saldo de su cuenta.");
		System.out.println("4-. Ingresar dinero.");
		System.out.println("5-. Salir.");
		int op = teclado.nextInt();
		return op;
	}
	public static int menu1() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("1-. Opera con una cuenta.");
		System.out.println("2-. Sal del sistema");

		int op = teclado.nextInt();
		return op;
	}
}
