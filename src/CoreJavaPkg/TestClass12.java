//Core Java program to return only unique values from a String (with and without Collections framework)
//Ex. Input = "Selenium Rahul Maven Rahul"
//Ex. Output = "Selenium Rahul Maven"

package CoreJavaPkg;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestClass12 {

	public static void main(String[] args) {
		String input = "Rahul Selenium Rahul Caterpillar Rahul Test Selenium";		
		System.out.println("Input String: " + input);
		
		/******************************* Without using Collections framework *********************************/
		//Split the input string with space as a delimiter
		String[] ti = input.split("\s");
		
		//Var "output" will store the final output string
		String output = "";
		
		//Var "existsFlag" will check if an input string is already added to the output string
		boolean existsFlag = false;
		
		//Loop for all input strings split by space ("\s")
		for(String si:ti) {
			
			//Split the output string with space as a delimiter
			String[] to = output.split("\s");
			
			//Loop through each value of input string array
			for(String so:to) {
				
				//Check each input string (Var "si") against each output string (Var "so")
				//If input string matches any occurrence of output string, it is already present (duplicate)
				if(si.equalsIgnoreCase(so)) {
					
					//Set "existsFlag" to true to signify that it's a duplicate entry
					existsFlag = true;
					
					//Exit the for loop since it is already a duplicate - need not go through other output string values
					break;
				}
			}
			
			//IF existsFlag is false means not a duplicate element
			if(!existsFlag) {
				//Add it to the output string and also add a space at the end
				output = output.concat(si).concat("\s");
			}
			
			//Reset "existsFlag" to false for next iteration of input string
			existsFlag = false;
		}
		
		//Print the output
		System.out.println("Without using Collections framework: " + output);
		
		/************************************ Using Collections framework *************************************/
		Set<String> outSet = new LinkedHashSet<String>();
		for(String si:ti) {
			outSet.add(si);
		}
		System.out.println("Using Collections framework: " + outSet);
	}
}
