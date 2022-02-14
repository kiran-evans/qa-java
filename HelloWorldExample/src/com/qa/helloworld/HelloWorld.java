package com.qa.helloworld;

public class HelloWorld {
	
	private static String message = "This is a test";
	
	public static void main(String[] args) {
		printMessage(message);
	}
	
	public static void printMessage(String msg) {
		System.out.print(msg);
	}
}