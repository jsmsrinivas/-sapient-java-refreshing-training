package com.sapient.day3;

abstract class Figure {
	double dim1;
	double dim2;

	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	abstract double area(); // area is now an abstract method
}

class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a, b);
	}

	double area() // override area for rectangle
	{
		System.out.println("Inside Area of Rectangle.");
		return dim1 * dim2;
	}
}

class Triangle extends Figure {
	Triangle(double a, double b) {
		super(a, b);
	}

	double area() // override area for right triangle
	{
		System.out.println("Inside Area of Triangle.");
		return dim1 * dim2 / 2;
	}
}

public class AbstractAreas {
	public static void main(String args[]) { // Figure f = new Figure(10, 10); // illegal now
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		System.out.println("Area is " + r.area());
		System.out.println("Area is " + t.area());
	}
}
