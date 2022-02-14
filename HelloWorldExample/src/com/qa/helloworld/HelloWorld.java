package com.qa.helloworld;

public class HelloWorld {
	
	private static String message = "This is a test";
	
	public static void main(String[] args) {
		if (printMessage(message)) {
			System.out.print(message);
			return;
		}
		
		System.out.print("Message failed");
	}
	
	public static boolean printMessage(String msg) {
		if (msg != null) {
			return true;
		}
		
		return false;
	}
}