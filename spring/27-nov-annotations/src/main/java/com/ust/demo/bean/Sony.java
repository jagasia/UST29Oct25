package com.ust.demo.bean;

import org.springframework.stereotype.Component;

@Component("s1")
public class Sony implements Audio{

	@Override
	public void play() {
		System.out.println("Sony makes good sound");
	}

}
