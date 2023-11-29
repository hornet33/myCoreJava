//Core Java program to reverse the characters of a string
//Ex., input: Sandeep Ashok Burte
//Ex., output: peednaS kohsA etruB

package coreJavaPkg;

public class TestClass02 {

	public static void main(String[] args) {
		String input = "selenium java";
		String[] t;
		StringBuilder output = new StringBuilder();
		
		System.out.println("Input: " + input);

		//Split the input string on the " " (space) delimiter which will return an array of strings stored in t[]
		t = input.split(" ");
			
		//Loop through the length of string array t[]
        for (String s : t) {
			//For each word in string array t[], navigate the characters of the string in reverse
			//That is, from the last to the first character, and keep adding it to output variable
			for (int j = s.length() - 1; j >= 0; j--) {
				output.append(s.charAt(j));

				//If index j = 0 then it is at the end of the word, so add a ' ' (space) to output
				if (j == 0) {
					output.append(" ");
				}
			}
		}
		System.out.println("Output: '" + output.toString().trim() + "'");
	}
}
