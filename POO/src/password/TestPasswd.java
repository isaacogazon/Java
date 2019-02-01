package password;

public class TestPasswd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passwd contraseña = new Passwd();
		do {
			contraseña.esFuerte();
		} while (!contraseña.esFuerte());
		System.out.println(contraseña.getContraseña());
	}
}
