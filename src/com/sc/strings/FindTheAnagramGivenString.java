package com.sc.strings;

import java.util.Arrays;

public class FindTheAnagramGivenString {
	
	public static void main(String[] args) {
		String input1 ="lListen";
		String input2 = "lSilent";
		
		//isAnagramString(input1,input2);
		//isAnagramStringByUsingSorting(input1, input2);
		isAnagramString1(input1, input2);
	}
	
	private static void isAnagramString(String input1, String input2) {
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		if (input1 != null && input2 != null) {
			int count =0;
			if (input1.length() != input2.length()) {
				System.out.println("The given string is not an Anagram..!!");
			}else {
				for (int i = 0; i < input1.length(); i++) {
					for (int j = 0; j < input2.length(); j++) {
						if (input1.charAt(i) == input2.charAt(j)) {
							count = count + 1;
						}
					}
				}
				if(count==input1.length()) {
					System.out.println("Yes, this is Anagram..");
				}
			}
		} else {
			System.out.println("The gievn String in null..");
		}
	}
	
	
	private static void isAnagramStringByUsingSorting(String input1, String input2) {
		if (input1 == null || input2 == null) {
			System.out.println("The Given inputs are null");
			return;
		}

		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();

		if (input1.length() != input1.length()) {
			System.out.println("The Given inputs are null");
			return;
		} else {

			char[] chars1 = input1.toCharArray();
			char[] chars2 = input2.toCharArray();

			Arrays.sort(chars1);
			Arrays.sort(chars2);

			if (Arrays.equals(chars1, chars2)) {
				System.out.println("Yes, the given string's are anagram");
			} else {
				System.out.println("No, the given strings are not anagrams.");
			}
		}

	}
	
	//Best approach
	private static void isAnagramString1(String input1, String input2) {
	    if (input1 == null || input2 == null) {
	        System.out.println("The given string is null.");
	        return;
	    }

	    if (input1.length() != input2.length()) {
	        System.out.println("The given strings are not anagrams.");
	        return;
	    }

	    input1 = input1.toLowerCase();
	    input2 = input2.toLowerCase();

	    // Initialize an array to store the frequency of characters
	    int[] charCounts = new int[26];

	    // Count characters from the first string
	    for (int i = 0; i < input1.length(); i++) {
	        charCounts[input1.charAt(i) - 'a']++;
	    }

	    // Subtract character counts using the second string
	    for (int i = 0; i < input2.length(); i++) {
	        charCounts[input2.charAt(i) - 'a']--;
	    }

	    // Check if all counts are zero
	    for (int count : charCounts) {
	        if (count != 0) {
	            System.out.println("No, the given strings are not anagrams.");
	            return;
	        }
	    }

	    System.out.println("Yes, the given strings are anagrams.");
	}

}


