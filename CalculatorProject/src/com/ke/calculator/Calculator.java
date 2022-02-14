package com.ke.calculator;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(calculateSum(1, 2));
		System.out.println(calculateProduct(2, 3));
		System.out.println(calculateDivide(5, 2));
	}
	
	public static int calculateSum (int x, int y) {
		return x + y;
	}
	
	public static int calculateProduct (int x, int y) {
		return x * y;
	}
	
	public static double calculateDivide (double x, double y) {
		return x / y;
	}

}
