//Core Java program to find the sum of a range of indexes in a given number array
//Ex. Input = inputArray = {1,5,2,78,3,67} / indexRange = {2,4}
//Ex. Output = inputArray[2] + ... + inputArray[4] = 2+78+3 = 83

package CoreJavaPkg;

public class TestClass08 {

	public static void main(String[] args) {
		Integer[] inputArray = {1,5,2,78,3,67};
		Integer[] indexRange = {2,6};
		Integer outputSum = 0;
		
		//Check Start index <= End index
		if(indexRange[0] <= indexRange[1]) {
			try{
				//Add the elements from Start indexRange[0] to End indexRange[1]
				for(int i = indexRange[0];i<=indexRange[1];i++) {
					//Store in outputSum variable
					outputSum += inputArray[i];
				}
				System.out.println(outputSum);
			}
			//If Start/End index is greater than indexArray length, catch index out of bounds exception
			catch(ArrayIndexOutOfBoundsException e) {			
				if(indexRange[0] > inputArray.length-1) {
					System.out.println("Start index '" + indexRange[0] + "' exceeds max inputArray index");
				}
				else if(indexRange[1] > inputArray.length-1) {
					System.out.println("End index '" + indexRange[1] + "' exceeds max inputArray index");
				}			
			}
		}
		//If Start index > End index, print error
		else {
			System.out.println("Start index '" + indexRange[0] + "' cannot be greater than End index '" + indexRange[1] +"'");
		}
	}
}
