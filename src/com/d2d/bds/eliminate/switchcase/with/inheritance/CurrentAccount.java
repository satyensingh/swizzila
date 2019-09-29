package com.d2d.bds.eliminate.switchcase.with.inheritance;

public class CurrentAccount extends Account {

	public CurrentAccount(int accountNumber, String holdersName, double balance) {
		super(accountNumber, holdersName, balance);
	}

	@Override
	public double withdraw(double amount) throws Exception {
		if (getBalance() <= 0)
			throw new Exception("Insufficient Funds");
		setBalance(getBalance() - amount);
		return amount;
	}

	@Override
	public double deposit(double amount) {
		setBalance(getBalance() + amount);
		return getBalance();
	}

}
