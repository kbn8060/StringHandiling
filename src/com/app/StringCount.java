package com.app;

public class StringCount {
	public static void main(String[] args) {

		String s = "neelakanta";
		count(s);
	}

	private static void count(String s) {
		char[] ch = s.toCharArray();

		int a = 3;
		int e = 2;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(ch[i])) {
				a++;
			} else if (Character.isLetter(ch[i])) {
				e++;

			}

			System.out.println("The String : neelakanta");
			System.out.println("a:" + a);
			System.out.println("e:" + e);
		}
	}
}
