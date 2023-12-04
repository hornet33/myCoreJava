//Core Java program to calculate the frequency of characters in a string (case sensitive)
//Ex. Input String = "Selenium"
//Ex. Output = "S=1,e=2,l=1,n=1,i=1,u=1,m=1"

package coreJavaPkg;

import java.util.LinkedHashMap;

public class TestClass06 {
	
	public static void main(String[] args) {
		String input = "promiscuous";
		int count = 0;
		//Using a HashMap data structure to maintain <character,count> pair
		LinkedHashMap<String,Integer> outputHash = new LinkedHashMap<>();
		
		//Loop through the input string for each character
		for(int i=0;i<input.length();i++) {
			
			//Storing current character of input string in a temp String object  
			String ipChar = String.valueOf(input.charAt(i));
			
			//If first and last index of the character are not the same, means more than 1 occurrence
			if(input.indexOf(ipChar) != input.lastIndexOf(ipChar)) {
				for(int j=input.indexOf(ipChar);
						j<=input.lastIndexOf(ipChar);
						j++) {
					
					//For that character, count the occurrences between the first and last indexes only 
					if(ipChar.equals(String.valueOf(input.charAt(j)))){
						count++;
					}
				}
				//Add the <character,count> pair to the HashMap if not present already to avoid duplicate reporting
				outputHash.putIfAbsent(ipChar, count);

				//Reset count
				count = 0;
			}
			else {
				//First and last index of the character are the same, means only 1 occurrence
				//Add the <character,count> pair to the HashMap 
				outputHash.put(ipChar, 1);
			}			
		}
		
		//Can print a HashMap using a forEach method like the below statement:
		//outputHash.forEach((s,n) -> System.out.println(s + ": " + n));
		
		//Alternatively can use a for loop like shown below:
//		for(Map.Entry<String,Integer> mapSet: outputHash.entrySet()) {
//			System.out.println(mapSet.getKey() +": " + mapSet.getValue());
//		}
		System.out.println(outputHash);
	}
}
