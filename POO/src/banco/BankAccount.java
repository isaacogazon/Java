package banco;

import java.util.Date;

public class BankAccount {

	static int number = 0;
	private int iban;
	private double balance;
	private Date createdDate;

	public BankAccount() {
		number++;
		iban = number;
		balance = 0;
		createdDate = new Date();
	}

	public int getIban() {
		return iban;
	}

	public double getBanalance() {
		return balance;
	}

	public String getDate() {
		return createdDate.toString();
	}

	public void fund(double amount) {
		this.balance += amount;
	}

	public int withdraw(int amount) {
		if (this.balance <= amount)
			return 1;
		if (amount % 10 != 0)
			return 2;
		this.balance -= amount;
		return 3;
	}

	public boolean transfer(BankAccount account, int amount) {
		if (this.withdraw(amount) == 3) {
			account.fund(amount);
			return true;
		}
		return false;
	}

}
