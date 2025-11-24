package com.codegnan.AdapterInterface;

public class PrinterAdapter implements ModernPrinter{
	LegacyPrinter legacyprinter;
	
	
	public PrinterAdapter(LegacyPrinter legacyprinter) {
		this.legacyprinter = legacyprinter;
	}


	@Override
	public void printModern(String message) {
		// TODO Auto-generated method stub
		legacyprinter.printLegacy(message);
	}

}
