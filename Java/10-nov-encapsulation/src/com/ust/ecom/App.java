package com.ust.ecom;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1: Chair\r\n"
				+ "2: Book Shelf\r\n"
				+ "3: Exit");
		int choice=sc.nextInt();
		
		Furniture f=null;
		switch(choice) {
		case 1:		//chair
			f=new Chair();
			break;
		case 2:		//bookshelf
			f=new BookShelf();
			break;
		case 3:
			return;
		}
		
		f.acceptDetails();
		f.displayDetails();
	}

}
