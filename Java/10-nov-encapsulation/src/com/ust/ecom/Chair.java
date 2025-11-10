package com.ust.ecom;

import java.util.Scanner;

public class Chair extends Furniture{
	
	private int noOfLegs;
	
	public void acceptDetails() {		//hiding super class method
		super.acceptDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of Legs:");
		noOfLegs=sc.nextInt();
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Number of Legs:"+noOfLegs);
	}
	
}
