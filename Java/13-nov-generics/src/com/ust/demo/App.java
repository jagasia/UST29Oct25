package com.ust.demo;

public class App {

	public static void main(String[] args) {
		Sony sony=new Sony();
		Jbl jbl=new Jbl();
		Car bmw=new Car();
		bmw.playMusic(jbl);
	}

}
