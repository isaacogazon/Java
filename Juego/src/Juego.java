import java.util.*;

public class Juego {
	public static void main(String[] args) {

		char tablero [] [] = new char [3][3];
		boolean  winner = false;
		int turno = 1;
		int cont = 0;
		char jugador1 = 'X';
		char jugador2 = 'O';
	    tablero(tablero);
		int posiciones [] = new int [2];
		
		do {
			printTablero(tablero);
			cont++;	
			if(turno==1) {
				turno = 2;
				posiciones = introCoordenadas(jugador1);
		        if (!coloca(tablero, posiciones,jugador1)) {
		        	System.out.println("Posición ocupada");
		        	cont--;
		        	turno = 1;
		        }
		       else winner = chequea(tablero,jugador1);
			}else  {
					turno = 1;
					posiciones = introCoordenadas(jugador2);
					 if (!coloca(tablero, posiciones,jugador2)) {
						 System.out.println("Posición ocupada");
				        	cont--;
				        	turno = 2;
					 }
					winner = chequea(tablero,jugador2);
				}
		}while(cont != 9 && !winner);
		if(cont == 9) {
			System.out.println("¡¡Habeis quedado en tablas!!");
		printTablero(tablero);
		}
	}
	public static boolean chequea(char[][]tablero,char jugador) {
		
		String ganas = " has ganado!!";
		
		if(tablero[0][0] == jugador && tablero[0][1] == jugador && tablero[0][2] == jugador) { 
			System.out.println(jugador + ganas);
			printTablero(tablero);
			return true;
		}
		
		 if(tablero[1][0] == jugador && tablero[1][1] == jugador && tablero[1][2] == jugador) {
			System.out.println(jugador + ganas);
			printTablero(tablero);
			return true;
		 }
		 
		 if(tablero[2][2] == jugador && tablero[2][1] == jugador && tablero[2][0] == jugador) {
				System.out.println(jugador + ganas);
				printTablero(tablero);
				return true;
		 }
		 if(tablero[0][0] == jugador && tablero[1][0] == jugador && tablero[2][0] == jugador) {
				System.out.println(jugador + ganas);
				printTablero(tablero);
				return true;
		 }
		 if(tablero[0][1] == jugador && tablero[1][1] == jugador && tablero[2][1] == jugador) {
				System.out.println(jugador + ganas);
				printTablero(tablero);
				return true;
		 }
		 if(tablero[0][2] == jugador && tablero[1][2] == jugador && tablero[2][2] == jugador) {
				System.out.println(jugador + ganas);
				printTablero(tablero);
				return true;
		 }
		 if(tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
				System.out.println(jugador + ganas);
				printTablero(tablero);
				return true;
		 }
		 if(tablero[2][0] == jugador && tablero[1][1] == jugador && tablero[0][2] == jugador) {
				System.out.println(jugador + ganas);
				printTablero(tablero);
				return true;
		 }
		return false;
	}
	public static int[] introCoordenadas (char j) {
		int [] p = new int [2];
		Scanner teclado = new Scanner (System.in);
		System.out.println(j+ " introduce fila: ");
		p[0] = teclado.nextInt();
		System.out.println(j+ " introduce columna: ");
		p[1] = teclado.nextInt();
		return p;
	}
	public static boolean coloca(char[][] t,int[]p, char j) {
		if (t[p[0]][p[1]] != ' ')
			return false;
		t[p[0]][p[1]] = j;
		return true;
	}
	public static char[][] tablero(char[][] tablero){
		
		int i;
		int j;
		for (i=0;i<3;i++)
		       for (j=0;j<3;j++)
		    	  tablero[i][j]=' ';
			   	    
		    return tablero;
	}
	
	public static void printTablero(char[][] tablero) {
		System.out.println("---JUEGO 3 EN RAYA---");
		for (int i=0;i<3;i++) {
			System.out.println("---------------");
		       for (int j=0;j<3;j++) 
		    	    System.out.print("| "+tablero[i][j] + " |" );
		      System.out.println();
	    }System.out.println("---------------");
	}

}
