package com.codegnan.AdapterInterface;

public interface PaymentProcessor {
	void process(double amount);
	void refund(double amount);
	double getBalance();
}
