package rationalnumber;

public class RationalNumber {
	private int num;
	private int den;

	public RationalNumber() {
		this.num = 1;
		this.den = 1;

	}

	public RationalNumber(int n, int d) {
		this.num = n;
		this.den = d;
		simplified();
	}
	
	private void simplified() {
		int n = mcd();
		//System.out.println(n);
		this.num /= n;
		this.den /= n;
	}
	
	private int mcd() {
		int n = (num < den) ? num : den;
		
		while (n > 0) 
			if(this.num % n == 0 && this.den % n == 0)
				return n;
			else n--;
		
		return 1;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}

	public String toString() {
		return getNum() + "/" + getDen();
	}
	
	public int compareTo(RationalNumber f) {
		if(this.num == f.num && this.den == f.den) return 0;//devuelve si son iguales.
		double n1 = this.num / this.den;
		double n2 = this.num / this.den;
		if(n1>n2) return 1;//devuelve el mayor
		return -1;
				
	}
	//sumar dos fracciones.
	public RationalNumber add(RationalNumber f) {
		int d = this.den*f.den;
		int n = (d /this.den*this.num)+(d /f.den*f.num);
		return new RationalNumber(n,d);

	}
	//falta la resta, multiplicación y división.

}
