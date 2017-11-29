import java.util.Scanner;

public class mercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int meses = 3;
		final int productos = 4;
		
		int op;
		int[][] array= null;
		do {
			 op = menu();
			switch (op) {
			case 1:
				array =  darValores(meses,productos);
				break;
			case 2:
				//productoMasVendidoMes(array);
				break;
			case 3: 
					vendidoPorProducto(array);
				break;
			case 4: 
				   imprimeTabla(array);
				   break;
			case 5: 
				break;
			
			default:
				System.out.println("La opción introducida no está en el menú.");
				break;
			}
			
		}while (op != 5);

	}
	public static void vendidoPorProducto(int[][] v){
		int total= 0;
		int j = 0;
		
		for (int i = 0; i < v.length; i++) {
			for (; j < v.length; j++) {
				total += v[i][j];
			}System.out.println("De "+v[i][j]+ " se ha vendido " + total+"." );
		}
		
	}
	public static int menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.println("Introduce la opción que desee: ");
		System.out.println("1.- Introducir ventras del trimestre.");
		System.out.println("2.- Producto mas vendido cada mes.");
		System.out.println("3.- Total vendido por producto.");
		System.out.println("4.- Imprimir tabla.");
		System.out.println("5.- salir.");
		System.out.println("------------------------------");
		
		int op = input.nextInt();
		return op;
	}
	public static int[][] darValores(int f, int c){
		String []meses ={"Enero","Febrero","Marzo"};
		String []producto = {"leche", "azucar", "pan", "pintura"};
		Scanner input = new Scanner(System.in);
		int [][] array = new int [f][c];
		
		System.out.println("Introduzca datos de venta:");
		for (int i = 0; i < meses.length; i++) {
			System.out.println(meses[i]+":");
			for (int j = 0; j < producto.length; j++) {
				System.out.println("Introduzca cantidad de "+ producto[j]+ " en el mes de "+meses[i]+":");
				 array[i][j] = input.nextInt();
				}
			}
			
		return array;
	}
	public static void imprimeTabla(int[][] v){
		String []meses ={"Enero","Febrero","Marzo"};
		System.out.println("Tabla de ventas:");
		System.out.println("\tLeche \tAzucar \tPan \tPintura");
		
		for (int i = 0; i <3; i++) {
			System.out.print(meses[i] + ": ");
			for (int j = 0; j < 4; j++) {
				System.out.print(v[i][j]+ "\t   ");
				}System.out.println();
			}
	}
	
	public static void productoMasVendidoMes(int[][] v){
		String []meses ={"Enero","Febrero","Marzo"};
		String []producto = {"leche", "azucar", "pan", "pintura"};	
		
		int j= 0;
		int i = 0;
		int[] sumar = new int [producto.length];
		int mayor = 0;
		
		for (; i < meses.length; i++) {
			for (; j < producto.length; j++) {
				if(v[i][j] > mayor)
					mayor = v[i][j];
			}System.out.println("El producto mas vendido del mes de "+meses[i]+ " es "+ producto[mayor]+".");
			
		}
			
			
	}

}
