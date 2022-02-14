package com.ke.calculator;

public class Results {
	
	static int physicsMark = 50;
	static int chemistryMark = 95;
	static int biologyMark = 134;
	
	static int totalMark = physicsMark + chemistryMark + biologyMark;
	
	static double percentageMark = (totalMark / 450d) * 100d;

	public static void main(String[] args) {
		displayResultsOfEach();
		displayPercentage();
	}
	
	static void displayResultsOfEach() {
		System.out.println("Physics: " + physicsMark + "/150");
		System.out.println("Chemistry: " + chemistryMark + "/150");
		System.out.println("Biology: " + biologyMark + "/150");
	}
	
	static void displayPercentage() {
		System.out.println("\nOverall: " + percentageMark + "%");
	}

}
