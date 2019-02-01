package banco;

public class Bank {

	private BankAccount[] accounts;
	private int index;
	private String name;

	public Bank(String name, int max) {

		this.name = name;
		index = 0;
		accounts = new BankAccount[max];
	}

	public String getName() {
		return name;
	}

	public BankAccount getAccount(int iban) {
		for (int i = 0; i < index; i++) {
			if (iban == accounts[i].getIban())
				return accounts[i];
		}
		return null;
	}

	public boolean addAccount() {
		if (index >= accounts.length)
			return false;
		accounts[index] = new BankAccount();
		index++;
		return true;
	}

	public boolean removeAccount(int iban) {
		if (this.getAccount(iban) == null)
			return false;
		int pos;
		for (pos = 0; pos < index; pos++) {
			int ib = accounts[pos].getIban();
			if (ib == iban)
				break;
		}
		for (int i = pos; i < index - 1; i++)
			accounts[i] = accounts[i + 1];
		index--;
		return true;
	}

}
