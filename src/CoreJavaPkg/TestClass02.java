//Core Java program to reverse the characters of a string
//Ex., input: Sandeep Ashok Burte
//Ex., output: peednaS kohsA etruB

package CoreJavaPkg;

public class TestClass02 {

	public static void main(String[] args) {
		String t = "Sandeep Ashok Burte";
		String[] o = null;	
		String p;
		
		System.out.println("Input: " + t);
		
		//Check if input string contains any space
		if(t.contains(" ")) {
			//If yes, split the input string on the " " (space) delimiter which will return an array of strings stored in o[]
			o = t.split(" "); 
			
			//Reset t 
			t = "";
			
			 //Loop through the length of string array o[] 
			 for (int i =0; i<o.length;i++) { 
				 //For each word in string array o[], navigate the characters of the string in reverse
				 //That is, from the last to the first character, and keep adding it to var 't'
				 for (int j = o[i].length()-1;j>=0;j--) {
					 t = t + o[i].charAt(j); 
					 
					 //If index j = 0 then it is at the end of the word, so add a ' ' (space) to var 't'
					 if (j==0) {
						 t += ' ';
					 }
				 } 
			}			
			System.out.println("Output (more than 1 word): \'" + t + "\'");
		}
		
		//If input string does not contain space, which means it is a single word
		else {
			
			//Since 't' has the input word, we will use var 'p' to store the output
			p = "";
			
			//For the input word, navigate the characters of the string in reverse and keep adding it to var 'p'
			for (int j = t.length()-1;j>=0;j--) {
				p = p + t.charAt(j); 
			} 
			System.out.println("Output (Single word): \'" + p + "\'");
		}
	}
}
