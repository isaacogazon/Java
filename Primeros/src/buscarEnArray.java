import java.util.Scanner;

public class buscarEnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce la longitud del array: ");
		int longitud = teclado.nextInt();
		
		System.out.println("Introduce el numero que quieres buscar: ");
		int numero = teclado.nextInt();
		
		int [] array = new int[longitud];
		/*for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		if (buscar(array, numero)!=-1){
			System.out.println(buscar(array,numero));
		}*/
		burbuja(array);

	}
	public static int buscar(int[] array, int numero){
		int i = 0;
		int f = array.length-1;
		int c = (i+f)/2;
		
		while (i <= f){
			if(array[c] == numero)
				return c;
			else if(array[c]>numero)
				f = c-1;
				else 
					i = c+1;
		}
			return -1;
			
	}
	public static int[] burbuja(int[] array){
		for (int i = 0; i < array.length-1; i++) {
			for (int j = array.length-2; j>=i; j--) {
				if(array[j]>array[j+1]){
					int alt = array[j];
					array[j] = array[j+1];
					array[j]=alt;
				}
					
			}
		}return array;
	}

}
