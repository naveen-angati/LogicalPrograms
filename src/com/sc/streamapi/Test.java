package com.sc.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

	 public static void main(String[] args) {
		 
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        // Using method reference
	        numbers.stream().forEach(System.out::println);
	 }
}
  