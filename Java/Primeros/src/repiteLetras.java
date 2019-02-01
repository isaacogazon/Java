
public class repiteLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array = new char[100];
		 arrayList(array);
		
	}
	public static void arrayList(char[] elementos){
		char[] elem;
		for (int i = 0; i < elementos.length; i++) {
			int resultado=(int)(Math.random()*(0+25));
			//letra[i] = (char) resultado;
			System.out.print(resultado+" ");
			
		}
	}

}
