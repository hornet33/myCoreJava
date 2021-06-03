//Core Java program to print the first non-repeated char in a string (Case insensitive)
//Ex. Input = "This is a test string."
//Ex. Output = "h"

package CoreJavaPkg;

public class TestClass07 {

	public static void main(String[] args) {
		String input = "Sample Selenium String For Testing";
		
		//For case insensitive comparison, converting the input string to all lower case
		String inputAllLower = input.toLowerCase();
		
		//Loop through the input String characters
		for(int i=0;i<input.length();i++) {
			
			//Look for a character which has first and last index equal which means 1 occurrence (non-repeated)
			if(inputAllLower.indexOf(inputAllLower.charAt(i)) == inputAllLower.lastIndexOf(inputAllLower.charAt(i))) {
				
				//Print the output
				System.out.println("First non-repeated character in the string '" + input + "' is '"+ input.charAt(i) + "'.");
				
				//Exit the loop
				break;
			}
		}
	}
}
