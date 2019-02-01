import java.util.Scanner;

public class codigoDeBarras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = darValores();
		
		int op;
		do {
			 op = menu();
			switch (op) {
			case 1:
				valoresAleatorios(array);
				break;
			case 2:
				meterDatos(array);
				break;
			case 3: 
				imprimeCodigoDeBarras(array);
				break;
			case 4: 
				break;
			
			default:
				System.out.println("La opción introducida no está en el menú.");
				break;
			}
			
		}while (op != 4);
		

	}
	public static int[] darValores(){
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce la dimension del array: ");
		int cantidad = input.nextInt();
		int[] array = new int[cantidad];
		return array;
	}
	public static void imprimeCodigoDeBarras(int[]elem){
		for (int i = 0; i < elem.length; i++) {
			int cant = elem[i];
			for (int j = 0; j < cant; j++) {
				System.out.print("|");
			}
			System.out.println();
		}
	}
	
	public static void meterDatos(int[] elem){
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < elem.length; i++){
			System.out.print( "Introduce valor para la posicion "+i+" del array: ");
			elem[i] = input.nextInt();
		}
	}
	
	public static void valoresAleatorios(int[] elem){
			
			for (int i = 0; i < elem.length; i++){
				
				elem[i] = (int)(Math.random()*10)+1;
			}
		}
	public static int menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.println("Introduce la opción que desee: ");
		System.out.println("1.- Datos aleatorios.");
		System.out.println("2.- Meter datos.");
		System.out.println("3.- Imprimir codigo de barras.");
		System.out.println("4.- Salir");
		System.out.println("------------------------------");
		
		int op = input.nextInt();
		return op;
	}

}
