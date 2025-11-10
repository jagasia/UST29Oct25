package com.ust.ecom;

import java.util.Scanner;

public class Furniture {
	private String name;
	private String color;

	public void acceptDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Name:");
		name=sc.nextLine();
		System.out.println("Color:");
		color=sc.nextLine();
	}
	public void displayDetails() {
		System.out.println("Name:"+name);
		System.out.println("Color:"+color);
	}
}
