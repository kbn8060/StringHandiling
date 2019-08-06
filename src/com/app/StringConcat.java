package com.app;

public class StringConcat {

	public static void main(String[] args) {
		String s1 = "Java String";
		s1.concat("is immutable");
		System.out.println(s1);
		s1 = s1.concat(" is immutable");
		System.out.println(s1);
	}
}
