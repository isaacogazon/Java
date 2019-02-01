package password;

public class Passwd {
	private int longitud;
	private String contrase�a;

	public Passwd() {
		this.longitud = 8;
	}

	public Passwd(int l) {
		setLongitud(l);
	}

	public String generarPasswd() {
		String todos = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";// 62
		String con = "";
		int longitud = this.getLongitud() + 3;
		for (int i = 0; i < longitud; i++) {
			int ale = (int) (Math.random() * (62 - 0) + 0);
			con += todos.charAt(ale);
		}

		return con;
	}
	public boolean esFuerte() {
		this.contrase�a = generarPasswd();
		int totalnum = 0;
		int totalmayus = 0;
		int totalminus = 0;
		for (int i = 0; i < contrase�a.length(); i++) {
			if (contrase�a.charAt(i) >= 'a' && contrase�a.charAt(i) <= 'z')
				totalminus++;
			if (contrase�a.charAt(i) >= 'A' && contrase�a.charAt(i) <= 'A')
				totalmayus++;
			if (contrase�a.charAt(i) >= '0' && contrase�a.charAt(i) <= '9')
				totalnum++;
		}
		if (totalmayus > 2 && totalminus > 1 && totalnum > 5)// 215
			return true;
		return false;

	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

}
