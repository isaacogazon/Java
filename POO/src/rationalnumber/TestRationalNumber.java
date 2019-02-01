package rationalnumber;

public class TestRationalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sumar fracciones.");
		RationalNumber f1 = new RationalNumber(6,9);
		System.out.println("Fracción 1: "+f1);
		RationalNumber f2 = new RationalNumber(2,8);
		System.out.println("Fracción 2: "+f2);
		System.out.println("Suma de 1 y 2: "+f1.add(f2));

	}

}
