package com.example.app;

import com.example.util.MessageUtil;

public class MainApp {
	public static void main(String[] args) {
		String userName = "World";
		if (args.length > 0) {
			userName = args[0];
		}
		System.out.println(MessageUtil.getGreeting(userName));
	}
}