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
		String[] temp = input.split("\s");
		
		//Var "output" will store the final output string
		String output = "";
		
		//Loop through each String in temp[]
		for(String s:temp) {
			System.out.println(output + " | " + s);
			
			//Check if output contains the String 's' already
			if(output.contains(s)) {
				System.out.println("Continue");
				//If it already contains, continue to the next String s in temp[]
				continue;
			}
			else {//Add the String s to output string
				System.out.println("Add");
				output = output.concat(s).concat("\s");
			}
		}
		
		//Print the output
		System.out.println("Without using Collections framework: '" + output.trim() + "'");
		
		/************************************ Using Collections framework *************************************/
		Set<String> outSet = new LinkedHashSet<String>();
		for(String si:temp) {
			outSet.add(si);
		}
		System.out.println("Using Collections framework: " + outSet);
	}
}
