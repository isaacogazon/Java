public class DuplicaMatricula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double matricula = 10000;
		int año=0;
		double interes = matricula * 1.07;
		double doble = matricula * interes;
		
		for (;interes <=matricula*2;año++){
			interes += (matricula * interes);
		}System.out.println("La matricula sera el doble en "+año+" años.");
		
	}

}
