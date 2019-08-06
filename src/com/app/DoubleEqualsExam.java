package com.app;

public class DoubleEqualsExam {

	public static void main(String[] args) {

		String s1 = new String("Hello Java");
		String s2 = new String("Hello Java");

		if (s1 == s2) {
			System.out.println("Both Objects are equals ");

		} else {

			System.out.println("Both Objects are not equals");
		}
	}
}
