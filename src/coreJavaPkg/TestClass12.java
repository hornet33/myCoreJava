//Core Java program to return only unique values from a String (with and without Collections framework)
//Ex. Input = "Selenium Rahul Maven Rahul"
//Ex. Output = "Selenium Rahul Maven"

package coreJavaPkg;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestClass12 {

	public static void main(String[] args) {
		String input = "Rahul Selenium Rahul Caterpillar Rahul Test Selenium";		
		System.out.println("Input String: " + input);
		
		/* ****************************** Without using Collections framework ******************************** */
		//Split the input string with space as a delimiter
		String[] temp = input.split(" ");
		
		//Var "output" will store the final output string
		String output = "";
		
		//Loop through each String in temp[]
		for(String s:temp) {
			System.out.println(output + " | " + s);
			
			//Check if output contains the String 's' already
			if(output.contains(s)) {
				System.out.println("Continue");
				//If output string already contains current String s, continue to the next String s in temp[]
            }
			else {//Add the current String s to output string
				System.out.println("Add");
				output = output.concat(s).concat(" ");
			}
		}
		
		//Print the output
		System.out.println("Without using Collections framework: '" + output.trim() + "'");

		/* *********************************** Using Collections framework ************************************ */
		Set<String> outSet = new LinkedHashSet<>();
        Collections.addAll(outSet, temp);
		System.out.println("Using Collections framework: " + outSet);
	}
}
