//Core Java program to count the number of instances of a letter in a given word (Case insensitive)
//Ex., input string = "This is a sample test String."; letter to find = 's'
//Ex., output = 5

package CoreJavaPkg;

public class TestClass03 {

	public static void main(String[] args) {
		String ip = "This is a sample test String.";
		String charToFind = "t";
		int totalCount = 0;
		
		try {
			//Looping through the input string "ip"
			//First, the characters of both input "ip" and "charToFind" are converted to same upper case to make it case insensitive
			//Second, index i begins from the first index where the case insensitive position of "charToFind" is present in "ip"
			//Third,  index i ends at the last index where the case insensitive position of "charToFind" is present in "ip
			//Second and Third are done to shorten the loop and make it faster - otherwise i = 0 to i<ip.length() also works fine
			for (	int i =ip.toUpperCase().indexOf(charToFind.toUpperCase()); 
					i<=ip.toUpperCase().lastIndexOf(charToFind.toUpperCase());
					i++
				) {
				
				//Check if the charToFind is matched - if yes, increase the count 
				//Notice the upper case conversion for both for case insensitive comparison
				if (ip.toUpperCase().charAt(i) == charToFind.toUpperCase().charAt(0)) {
					totalCount ++;
				}
			}
			System.out.println("Input String: " + ip + "\n"
					+ "Character to find (Case Insensitive): " + charToFind + "\n"
					+ "Total Matches: " + totalCount);
		}	
		
		//Error handling: If the charToFind is not found in the input string "ip" , an exception will be generated
		catch (StringIndexOutOfBoundsException se) {
			System.out.println("Cannot find \'" + charToFind + "\' in \'" + ip + "\'");			
		}
	}
}
