package com.sc.strings;

public class PrintDataWithouUsingSemocolon {

	public static void main(String[] args) {
		printData("Naveen");
	}

	private static void printData(String data) {
		if (System.out.printf("Data ::" + data) == null);
	}
}
