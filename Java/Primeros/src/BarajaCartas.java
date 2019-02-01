import java.util.Scanner;

public class BarajaCartas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NUMERO_DE_CARTAS = 40;
		int CARTAS_POR_PALO = 10;
		int[]cartas = new int[40];
		
		for (int i = 0; i < 40; i++) {
			cartas[i] = i+1;
		}

		int op;
		do {
			 op = menu();
			switch (op) {
			case 1:
				muestraCartas(cartas);
				break;
			case 2:
				barajarCartas(cartas);
				break;
			case 3:
				ordenaMazo(cartas);
				break;
			case 4:
				reparteCartas(cartas);
				break;
			case 5:
				juego(cartas);
				break;
			case 6:
				break;

			default:
				System.out.println("La opción introducida no está en el menú.");
				break;
			}
			
		}while (op != 6);
		

	}
	public static void reparteCartas(int[] elem){
		Scanner input = new Scanner(System.in);
		System.out.println("¿Cuantos jugadores van a participar?");
		int jug = input.nextInt();
		for (int i = 1; i < jug+1; i++) {
			System.out.println("Cartas del jugador "+i+":");
			for (int j = 0; j <40/i; j++) {
				System.out.println(cartaToString(elem[j]));
				
			}
			
		}
		
	}
	
	public static int menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.println("Introduce la opción que desee: ");
		System.out.println("1.- Mostrar la baraja.");
		System.out.println("2.- Bajarar el mazo.");
		System.out.println("3.- Ordenar el mazo.");
		System.out.println("4.- Reparte cartas.");
		System.out.println("5.- Juego.");
		System.out.println("6.- Salir");
		System.out.println("------------------------------");
		
		int op = input.nextInt();
		return op;
	}
	public static void ordenaMazo(int[]cartas){
		
		for (int i = 0; i < 40; i++) {
			cartas[i] = i+1;
		}
	}
	
	public static void barajarCartas(int[] cartas){
		 
	     for (int i = 0; i < cartas.length; i++){
				int r = (int)(Math.random()*cartas.length);
				int aux = cartas[i];
				cartas[i] = cartas[r];
				cartas[r] = aux;
			}
	   
	 }
	
	public static void muestraCartas(int[] cartas){
		
		for (int i =0; i<cartas.length;i++){
			System.out.println(cartaToString(cartas[i]));
		}
			
	}
    public static String cartaToString(int cartaNum){
    	String []palos ={"oros","copas","espadas","bastos"};
    	String [] cartas ={"Rey","AS","2","3","4","5","6","7","Sota","Caballo"};
    	int cociente = cartaNum/10;
    	if (cartaNum%10 == 0) cociente--;
    	String myCard = cartas[cartaNum%10]+ " de " + palos[cociente];
    	return myCard;
    	
    }
    public static void juego(int[] cartas){
    	Scanner input = new Scanner(System.in);
    	
    	int i = 0;
    	int j;
    	
    	for (j = 0; j < cartas.length; j++) {
    		
    		do{	
		    	System.out.println("Cartas del jugador 1:");
		    	for (; i < 4; i++) {
					System.out.println(cartaToString(cartas[i]));
				}
		    	System.out.println("Cartas del jugador 2:");
		    	for (; i < 4; i++) {
					System.out.println(cartaToString(cartas[i]));
		    	}
		    		System.out.println(j);
		    	System.out.println("Quieres volver a repartir?? Pulsa 0 para repetir o 1 para salir.");
		    	int op = input.nextInt();
		    	if(op == 1 )
		    		j = 40;
    		}while (j !=40);
    	}
    }
}
