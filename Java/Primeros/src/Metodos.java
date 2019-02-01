
public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Numero aleatorio: "+numero());
		System.out.println("Letra minuscula aleatoria: "+(char)letraMinu());
		System.out.println("Letra mayúscula aleatoria: "+(char)letraMayu());
		

	}
	public static int numero(){
		int numero =(int) (Math.random()*10)+1;
		return numero;
	}
	public static int letraMinu(){
		int letra = (int) Math.floor(Math.random()*(97-123)+123);
		return letra;
	}
	public static int letraMayu(){
		int letra = (int) Math.floor(Math.random()*(65-90)+90);
		return letra;
	}

}

