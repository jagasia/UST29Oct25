package com.ust.ecom;

import java.util.Scanner;

public class BookShelf extends Furniture{
	private int noOfShelves;
	
	public void acceptDetails() {
		super.acceptDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of Shelves:");
		noOfShelves=sc.nextInt();
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Number of Shelves:"+noOfShelves);
	}
	
}
