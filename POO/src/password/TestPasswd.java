package password;

public class TestPasswd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passwd contrase�a = new Passwd();
		do {
			contrase�a.esFuerte();
		} while (!contrase�a.esFuerte());
		System.out.println(contrase�a.getContrase�a());
	}
}
