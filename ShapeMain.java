package com.inheritance;

class Shape {
    public double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    public double calculateCircleArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double calculateArea() {
        return length * width;
    }
    
    public double calculateRectangleArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base;
    double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double calculateArea() {
        return 0.5 * base * height;
    }
    public double calculateTriangleArea() {
        return 0.5 * base * height;
    }
}


public class ShapeMain {
	public static void main(String[] args) {
		Shape circle = new Circle(5);
		System.out.println(circle.calculateArea());
		System.out.println(((Circle) circle).calculateCircleArea());
		System.out.println();
		Shape rectangle = new Rectangle(4, 6);
		System.out.println(rectangle.calculateArea());
		System.out.println(((Rectangle) rectangle).calculateRectangleArea());
		System.out.println();
		Shape triangle = new Triangle(3, 7);
		System.out.println(triangle.calculateArea());
		System.out.println(((Triangle) triangle).calculateTriangleArea());
	}
}