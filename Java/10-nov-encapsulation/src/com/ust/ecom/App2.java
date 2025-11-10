package com.ust.ecom;

interface Person{
	void speak();
	static void walk() {
		System.out.println("Person walks");
	}
	default void run() {
		System.out.println("Person run");
	}
}
class Student implements Person{
	public void speak() {
		System.out.println("Student speaks");
	}
	public void run() {
		//i want to call the run method of interface.
		Person.super.run();
		System.out.println("studnet runs");
	}
}
public class App2 {

	public static void main(String[] args) {
		Person raja=new Student();
		raja.speak();
		Person.walk();
		raja.run();
	}

}
