package com.example;
	abstract class Shape {
	    abstract double area();
	}

	class Circle extends Shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    double area() {
	        return 3.14 * radius * radius;
	    }
	}

	class Rectangle extends Shape {
	    private double length;
	    private double width;

	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    double area() {
	        return length * width;
	    }
	}

	public class ShapeInheritance {
	    public static void main(String[] args) {
	        Circle circle = new Circle(5);
	        Rectangle rectangle = new Rectangle(5, 6);

	        System.out.println("Area of Circle: " + circle.area());
	        System.out.println("Area of Rectangle: " + rectangle.area());
	    }
	}
