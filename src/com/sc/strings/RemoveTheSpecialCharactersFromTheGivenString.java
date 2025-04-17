package com.sc.strings;

public class RemoveTheSpecialCharactersFromTheGivenString {

	public static void main(String[] args) {
		String inputValue = "Naven&%$#@12er3+widen";
		System.out.println("Input Value :: " + inputValue + "\nOutPut Value ::" + removeSpecialChars(inputValue));
	}
	
	private static String removeSpecialChars(String data) {
		String clearValue = "";
		for (char charData : data.toCharArray()) {
			if ((charData >= 'A' && charData <= 'Z') || (charData >= 'a' && charData <= 'z') 
					|| (charData >= '0' && charData <= '9')) {
				clearValue = clearValue.concat(String.valueOf(charData));
			}
		}
		return clearValue;
	}

}
