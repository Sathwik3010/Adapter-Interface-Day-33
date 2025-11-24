package com.codegnan.AdapterInterface;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Fighter w = new Warrior();
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			String command = sc.nextLine();
			
			if(command.equalsIgnoreCase("attack"))
				w.attack();
			else if(command.equalsIgnoreCase("defend"))
				w.defend();
		}
		sc.close();
	}

}
