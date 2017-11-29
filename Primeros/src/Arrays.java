import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]elements = new int[10];
		int op;
		do{
			op = menu();
			switch(op){
			case 1: introElements(elements);
			        break;
			case 2: randomValues(elements);
	                break;       
			case 3: printArray(elements);
			        break;
			case 4: int sum = sumElements(elements);
			        System.out.println("The sum of all elements is :"+sum);
	                break;      
			case 5: //int largest = largestElement(elements);
	                System.out.println("The largest element is :"+largestElement(elements));
                    break;      
			case 6: //int largest = largestElement(elements);
                     System.out.println("The smallerest position  is :"+smallestPosition(elements)+ " with the value:"
                    		 +elements[smallestPosition(elements)]);
                     break;    
			case 7: shufflingArray(elements);
					break;
			case 8: shiftingArray(elements);
				break;
			case 9: System.out.println("La media de éstos numeros es "+ media(elements));
				break;
			case 10: System.out.println("Los numeros que estan por encima de la media son: ");
			encimaMedia(elements);
				break;
			case 11: printArray(darVuelta(elements));
				break;

			case 12: imprimeArray(elements);
				break;        
			
			case 13: break;
			default : System.out.println("No option, please enter a number between 1 to 2"); 
				
			}
		} while (op!=13);
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void imprimeArray(int elem[]){
		int mayor = 0;
		int i= 0;
		int pos = 0;
		int rep = 1;
		
		for (; i < elem.length; i++) {
				
			if ( mayor == elem[i]){
				rep++;
			}
			if(elem[i]>mayor){
				mayor = elem[i];
				pos = i;
				}
		}
		System.out.println("El numero mayor es "+mayor+" y está en la posicion " +pos+ " y se repite " + rep + " veces.");
	}
	
	
	public static int[] darVuelta(int[] v){
		
		int[] r = new int[v.length];
		for (int i = 0, j = v.length-1; i < v.length; i++, j--) {
			r[i] = v[j];
			
		}
		return r;
	}
	
	public static void encimaMedia(int[] elem){
		
		for (int i = 0; i < elem.length; i++) {
			if (elem[i] > media(elem))
				System.out.print(elem[i]+" ");
		}
		
	}
	
	public static int media(int[] elem){
		int suma = 0;
		int media=0;
		int i = 0;
		for (; i < elem.length; i++) {
			suma = suma + elem[i];
		}
		media = suma / elem.length;
		
		return media;
		
	}

	public static void shiftingArray(int[] elem){
		 int aux = elem[0];
	     for (int i = 0; i < elem.length-1; i++){
				
				elem[i] = elem[i+1];
				
			}
		 elem[elem.length-1] = aux;
	   
	 }  
	public static void shufflingArray(int[] elem){
		 
	     for (int i = 0; i < elem.length; i++){
				int r = (int)(Math.random()*elem.length);
				int aux = elem[i];
				elem[i] = elem[r];
				elem[r] = aux;
			}
	   
	 }  
	public static int smallestPosition(int[] elem){
		 int smallest = 0;
	     for (int i = 1; i < elem.length; i++){
				if (elem[smallest] < elem[i])
					smallest = i;
				
			}
	    return smallest;
	 }  
	public static int largestElement(int[] elem){
		 int largest = elem[0];
	     for (int i = 1; i < elem.length; i++){
				if (largest < elem[i])
					largest = elem[i];
				
			}
	    return largest;
	 }  
	 public static int sumElements(int[] elem){
		 int sum =0;
	     for (int i = 0; i < elem.length; i++){
				sum+= elem[i];
				
			}
	    	return sum;
	 }  	
	public static void introElements(int[] elem){
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < elem.length; i++){
			System.out.print( "Enter the value:"+i+" : ");
			elem[i] = input.nextInt();
		}
	}
	public static void randomValues(int[] elem){
		
		for (int i = 0; i < elem.length; i++){
			
			elem[i] = (int)(Math.random()*100)+1;
		}
	}
    public static void printArray(int[] elem){
    	for (int i = 0; i < elem.length; i++){
			System.out.print( "Value "+i+" : "+ elem[i]+"\t");
			if (i%5 == 0) System.out.println();
			
		}
	}
	public static int menu(){
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("-----Menu de opciones------");
		System.out.println("1 .- Initializing arrays with input values ");
		System.out.println("2 .- Initializing arrays with random values");
		System.out.println("3 .- Printing arrays ");
		System.out.println("4 .- Summing all elements ");
		System.out.println("5 .- Finding the largest element ");
		System.out.println("6 .- Finding the smallest index of the largest element");
		System.out.println("7 .- Random shuffling");
		System.out.println("8 .- Shifting elements");
		System.out.println("9 .- Media ");
		System.out.println("10.- Números por encima de la media. ");
		System.out.println("11.- Dar la vuelta.");
		System.out.println("12.- Devuelve la posición del as grande en array.");
		System.out.println("13 .- Exit ");
		System.out.println("Intro an option : "); 
		int op = input.nextInt();
		return op;
						
		
	}
}