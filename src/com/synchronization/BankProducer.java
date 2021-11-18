package com.synchronization;

class BankProducer extends Thread {
	private BankAccount account;

	public BankProducer(BankAccount acct) {
		account = acct;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.deposit(10);
		}
	}
}