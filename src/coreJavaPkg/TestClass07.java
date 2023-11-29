//Core Java program to print the first non-repeated char in a string (Case insensitive)
//Ex. Input = "This is a test string."
//Ex. Output = "h"
//This program will also create and print a list of ALL the non-repeated characters in the input string

package coreJavaPkg;

import java.util.ArrayList;
import java.util.List;

public class TestClass07 {

	public static void main(String[] args) {
		String input = "application programming";
		
		//For case insensitive comparison, converting the input string to all lower case
		String inputAllLower = input.toLowerCase();

		//Create a list to add all the non-repeated characters in the string
		List<Character> nonRepChars = new ArrayList<>();

		//Set a flag to check if first non-repeated character is found
		boolean firstNonRepChar = true;
		
		//Loop through the input String characters
		for(int i=0;i<input.length();i++) {

			//Ignore if the character is a space
			if(input.charAt(i) == ' '){
				continue;
			}
			
			//Look for a character which has first and last index equal which means 1 occurrence (non-repeated)
			if(inputAllLower.indexOf(inputAllLower.charAt(i)) == inputAllLower.lastIndexOf(inputAllLower.charAt(i))) {

				if(firstNonRepChar){
					//Print the output
					System.out.println("First non-repeated character in the string '" + input + "' is '"+ input.charAt(i) + "'.");
					//Set the flag to false since first non-repeated character is found
					firstNonRepChar = false;
				}

				//Add the non-repeated character to the nonRepChar list
				nonRepChars.add(input.charAt(i));
			}
		}
		System.out.println("List of all non-repeated characters in the string:" + nonRepChars);
	}
}
