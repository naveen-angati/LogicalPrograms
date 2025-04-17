package com.sc.strings;

public class FindStringLengthWithoutUsingLengthProperty {

	public static void main(String[] args) {
		System.out.println(getCout("Naveen"));

	}
	
	private static int getCout(String str) {
		return (int)str.chars().count();
	}

}
