package com.codegnan.AdapterInterface;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        String command = sc.next();
        
		DrawableShape circle = new Circle();
		if(command.equalsIgnoreCase("draw"))
			circle.draw();
		else if(command.equalsIgnoreCase("area"))
			System.out.printf("Area: %.2f",circle.getArea(radius));
		sc.close();
	}

}
