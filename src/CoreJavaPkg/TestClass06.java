//Core Java program to calculate the frequency of characters in a string
//Ex. Input String = "Selenium"
//Ex. Output = "S=1,e=2,l=1,n=1,i=1,u=1,m=1"

package CoreJavaPkg;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestClass06 {
	
	public static void main(String args[]) {
		String input = "Selenium";
		int count = 0;
		//Using a HashMap data structure to maintain <character,count> pair
		LinkedHashMap<String,Integer> outputHash = new LinkedHashMap<String,Integer>();
		
		//Loop through the input string for each character
		for(int i=0;i<input.length();i++) {
			
			//If first and last index of the character are not the same, means more than 1 occurrence
			if(input.indexOf(input.charAt(i)) != input.lastIndexOf(input.charAt(i))) {
				for(int j=input.indexOf(input.charAt(i));
						j<=input.lastIndexOf(input.charAt(i));
						j++) 
				{
					//Count the occurrences between the first and last indexes only
					if(input.charAt(i) == input.charAt(j)) {
						count++;
					}
				}
				//Add to the HashMap if not present already
				outputHash.putIfAbsent(String.valueOf(input.charAt(i)), count);

				//Reset count
				count = 0;
			}
			else {
				//First and last index of the character are the same, means only 1 occurrence
				//Add the <character,count> pair to the HashMap by converting the character to a String object
				outputHash.put(String.valueOf(input.charAt(i)), 1);
			}			
		}
		
		//Can print a HashMap using a forEach method like the below statement:
		//outputHash.forEach((s,n) -> System.out.println(s + ": " + n));
		
		//Alternatively can use a for loop like shown below:
		for(Map.Entry<String,Integer> mapSet: outputHash.entrySet()) {
			System.out.println(mapSet.getKey() +": " + mapSet.getValue());
		}
	}
}
