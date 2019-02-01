package calculadora;

public class Modelo {

	private String numero;
	private char operador = 1;
	private String num1 = "";
	private String num2 = "";

	public Modelo(String numero) {
		this.numero = numero;
		int i = 0;
		for (; i < this.numero.length(); i++) {

			if (Character.isDigit(this.numero.charAt(i)) || this.numero.charAt(i) == '.')
				this.num1 += this.numero.charAt(i);
			else

				break;
		}
		this.operador = this.numero.charAt(i);
		for (int j = i; j < this.numero.length(); j++)
			this.num2 += this.numero.charAt(j);
	}

	public double calculo() {
		double primero = Double.parseDouble(num1);
		double segundo = Double.parseDouble(num2);

		if (operador == '+')
			return primero + segundo;
		if (operador == '-')
			return primero - segundo;
		if (operador == '*')
			return primero * segundo;
		if (operador == '/')
			return primero / segundo;
		return 0;
	}

}
