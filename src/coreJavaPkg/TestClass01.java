//Core Java program to print the first letter of each word in a string
//Ex. input = "Python is a good scripting language"
//Ex. output = "Piagsl"

package coreJavaPkg;

public class TestClass01 {

	public static void main (String[] args){

		StringBuilder t = new StringBuilder("Python is a good scripting language");
		String[] o;
		
		System.out.println("Input: " + t);
		
		//Split the input string on the " " (space) delimiter - this will return an array of strings stored in 'o[]'
		o = t.toString().split(" ");
		
		//Reset t to an empty string to prepare the output string in t
		t = new StringBuilder();
		
		//Loop through the length of string array o[], take the first character and keep appending to var 't'
        for (String s : o) {
            //System.out.println(o[i]);
            t.append(s.charAt(0));
        }
		
		System.out.println("Output: '" + t + "'");
	}
}
