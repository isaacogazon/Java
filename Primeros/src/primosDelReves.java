
public class primosDelReves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salto = 0;
		System.out.println("Números primos: ");
		for (int i = 10; i < 100; i++) {
			
			if (esPrimo(i)){
			System.out.print(i +" ");
			salto++;
				if (salto % 10 == 0)
					System.out.println();
			}
		}

	}
    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
          if (numero % contador == 0)
            primo = false;
          contador++;
        }
        return primo;
      }
    

}
