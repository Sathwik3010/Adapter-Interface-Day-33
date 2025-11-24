package com.codegnan.AdapterInterface;

public class Circle implements DrawableShape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
	}

	@Override
	public double getArea(double radius) {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
}
