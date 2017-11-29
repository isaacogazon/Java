import java.util.Scanner;

public class InstruccionIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Introduce un numero y te diremos si es multiplo de 5, de 2 o de los dos: ");
		Scanner teclado = new Scanner (System.in);
		//int numero = teclado.nextInt();
		//if (numero % 2 == 0){
		//	System.out.println("El numero es multiplo de 2.");
		//}
		//if (numero % 5 == 0){
		//	System.out.println("El numero es multiplo de 5.");
		//}
		//---------------------------------------------------------------------------
		/*System.out.println("Introduce una nota:");
		double nota = teclado.nextDouble();
		
			if (nota >10){
				System.out.println("La nota debe de ser menor que 10.");
			}else if (nota >=9){
				System.out.println("La nota es sobresaliente.");
			}else if (nota >=7){
				System.out.println("La nota es notable.");
			} else if (nota >=6){
				System.out.println("La nota es bien.");
			} else if (nota >=5){
				System.out.println("La nota es suficiente");
			}else{
				System.out.println("La nota es insufuciente.");
			}
			---------------------------------------------------------------------------------*/
		/*System.out.println("Introduce el primer numero: ");
		int a = teclado.nextInt();
		System.out.println("Introduce el segundo numero:");
		int b = teclado.nextInt();
		System.out.println("Introduce el tercer numero:");
		int c = teclado.nextInt();
		
		if (a > c)
			if (a > b){
				System.out.println("A es mayor que B y C.");
			}else System.out.println("La B es mayor que A y C.");
		
		else if(b>c){
				System.out.println("B es mayor que A y C");
			}else System.out.println("C es mayor que A y B.");
			--------------------------------------------------------------------------------------*/
		int a = (int) (Math.random()*10);
		int b = (int) (Math.random()*10);
		int c;
		int resultado;
		
		if(a>b){
		System.out.println("Ejecuta la siguiente resta: ");
		System.out.println(a+ "-" +b+"=");
		resultado = teclado.nextInt();
		if(resultado == a-b)
			System.out.println("Es correcto");
		else System.out.println("Es incorrecto");
			}
		else if (a<b){
			System.out.println("Ejecta la siguiente resta: ");
		c = a;
		a = b;
		b = c;
		System.out.println(a+"-"+b+"=");
		resultado = teclado.nextInt();
		if(resultado == a-b)
			System.out.println("Es correcto");
		else System.out.println("Es incorrecto");
			}
		}
	}

