package com.ust.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class Jbl implements Audio {

	@Override
	public void play() {
		System.out.println("Jbl sounds good");
	}

}
