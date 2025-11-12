package com.ust.ecom;


class Shape{
	public Shape(String name) {
		
	}
	Shape getInstance(){
		return new Shape("");
	}
}

class Triangle extends Shape{
	public Triangle() {
		super("Triangle");
	}
}

class Rectangle extends Shape{
	public Rectangle() {
		super("Rectangle");
		// TODO Auto-generated constructor stub
	}

	@Override
	Triangle getInstance(){
		return new Triangle();
	}
}


public class App11 {

	public static void main(String[] args) {
		System.out.println("Hello world");
	}

}
