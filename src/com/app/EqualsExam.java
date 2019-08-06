package com.app;

public class EqualsExam {

	public static void main(String[] args) {

		String s1 = new String("Hello Java");
		String s2 = new String("Hello Java");

		if (s1.equals(s2)) {
			System.out.println("Both Objects are equals");
		} else {

			System.out.println("Both Objetcs are not equals");
		}
	}
}
