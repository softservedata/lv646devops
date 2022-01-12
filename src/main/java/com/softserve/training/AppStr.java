package com.softserve.training;

public class AppStr {
	public static void main(String[] args) {
		String s1 = "ab";
		//String s1 = new String("ab").intern();
		//String s2 = "ab";
		String s2 = new String("ab").intern();
		System.out.println("result (s1 == s2) = " + (s1 == s2));
	}
}
