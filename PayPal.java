package com.codegnan.AdapterInterface;

public class PayPal implements PaymentProcessor{

	private double balance = 0.0;
	@Override
	public void process(double amount) {
		// TODO Auto-generated method stub
		balance+=amount;
	}

	@Override
	public void refund(double amount) {
		// TODO Auto-generated method stub
		balance-=amount;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

}
