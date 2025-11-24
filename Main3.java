package com.codegnan.AdapterInterface;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String message = sc.nextLine();
		
		LegacyPrinter legacyprinter = new LegacyPrinter();
		ModernPrinter printer = new PrinterAdapter(legacyprinter);

		printer.printModern(message);
		sc.close();
	}

}
