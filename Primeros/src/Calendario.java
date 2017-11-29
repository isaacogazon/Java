import java.util.Scanner;

public class Calendario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Introduce el mes: ");
		Scanner teclado = new Scanner (System.in);
		int mes = teclado.nextInt();
		System.out.print("Introduce el año: ");
		int anio = teclado.nextInt();
		
		printMonth(anio,mes);
		
	}
	
	public static void printMonth(int y, int m){
		
		System.out.println("\t\t   "+getMonthName(m)+"  "+y);
		System.out.println("----------------------------------------------------");
		System.out.println(" Mon \t Tue \t Wed \t Thu \t Fri \t Sat \t Sun");
		diaMes(m, y);
	}
	
	public static String getMonthName(int m){
		switch (m) {
		case 1:
			return "Enero";
		case 2:
			return "Febrero";
		case 3:
			return "Marzo";
		case 4:
			return "Abril";
		case 5:
			return "Mayo";
		case 6:
			return "Junio";
		case 7:
			return "Julio";
		case 8:
			return "Agosto";
		case 9:
			return "Septiembre";
		case 10:
			return "Octubre";			
		case 11:
			return "Noviembre";			
		case 12:
			return "Diciembre";
		}	
		return " ";
			
		
	}
	
	public static void diaMes(int mes, int anio){
		
		
		if (bisiesto(anio)==true && (mes == 2)){

			for (int i = 1; i <= 29; i++) {
				System.out.print(i +"\t");
				if (i%7==0)
					System.out.println();
			}
				
		}else if (mes == 2){
			for (int i = 1; i <= 28; i++) {
				System.out.print(i +"\t");
				if (i%7==0)
					System.out.println();
			}
				
		}else  if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
				for (int i = 1; i <= 31; i++) {
					System.out.print(i +"\t");
					if (i%7==0)
						System.out.println();
				}
			
		}else for (int i = 1; i <= 30; i++) {
			System.out.print(i +"\t");
				if (i%7==0)
					System.out.println();
			}
		
	}
	
	public static boolean bisiesto(int anio){

		
		if (anio%400==0 || (anio%4==0 && !(anio%100==0)))
			return true;
		return false;
		
	}
	
	public static int diasBisiesto(int year){
		
		int total = 0;
		      if (bisiesto(year))
		        total += 366;
		      else
		        total += 365;
		return total;
			
	}
	
}