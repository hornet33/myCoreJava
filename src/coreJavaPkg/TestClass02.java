//Core Java program to reverse the characters of a string
//Ex., input: Sandeep Ashok Burte
//Ex., output: peednaS kohsA etruB

package coreJavaPkg;

public class TestClass02 {

	public static void main(String[] args) {
		StringBuilder input = new StringBuilder("Sandeep Ashok Burte");
		String[] output;
		StringBuilder p;
		
		System.out.println("Input: " + input);
		
		//Check if input string contains any space
		if(input.toString().contains(" ")) {
			//If yes, split the input string on the " " (space) delimiter which will return an array of strings stored in o[]
			output = input.toString().split(" ");
			
			//Reset t 
			input = new StringBuilder();
			
			 //Loop through the length of string array o[] 
            for (String s : output) {
                //For each word in string array o[], navigate the characters of the string in reverse
                //That is, from the last to the first character, and keep adding it to var 't'
                for (int j = s.length() - 1; j >= 0; j--) {
                    input.append(s.charAt(j));

                    //If index j = 0 then it is at the end of the word, so add a ' ' (space) to var 't'
                    if (j == 0) {
                        input = new StringBuilder(input.toString().concat(" "));
                    }
                }
            }
			System.out.println("Output (more than 1 word): '" + input + "'");
		}
		
		//If input string does not contain space, which means it is a single word
		else {
			
			//Since 'input' has the input word, we will use var 'p' to store the output
			p = new StringBuilder();
			
			//For the input word, navigate the characters of the string in reverse and keep adding it to var 'p'
			for (int j = input.length()-1;j>=0;j--) {
				p.append(input.charAt(j));
			} 
			System.out.println("Output (Single word): '" + p + "'");
		}
	}
}
