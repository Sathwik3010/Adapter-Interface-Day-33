package com.codegnan.AdapterInterface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		PaymentProcessor pay = new PayPal();
		
		for(int i=0; i<n; i++) {
			String command = sc.next();
			double amount = sc.nextDouble();
			
			if(command.equalsIgnoreCase("process")) {
				pay.process(amount);
			} else {
				if(command.equalsIgnoreCase("refund")) {
					pay.refund(amount);
				}
			}
		}
		
		System.out.printf("Balance: %.2f",pay.getBalance());
		sc.close();
	}

}
