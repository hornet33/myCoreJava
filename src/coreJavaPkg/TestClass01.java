//Core Java program to print the first letter of each word in a string
//Ex. input = "Python is a good scripting language"
//Ex. output = "Piagsl"

package coreJavaPkg;

public class TestClass01 {

	public static void main (String[] args){

		String t = "Python is a good scripting language";
		String[] o = null;		
		
		System.out.println("Input: " + t);
		
		//Split the input string on the " " (space) delimiter - this will return an array of strings stored in 'o[]'
		o = t.split(" ");
		
		//Reset t to an empty string to prepare the output string in t
		t = "";
		
		//Loop through the length of string array o[], take the first character and keep appending to var 't'
		for (int i =0; i<o.length;i++) {
			//System.out.println(o[i]);
			t= t + o[i].charAt(0);
		}
		
		System.out.println("Output: \'" + t + "\'");
	}
}
