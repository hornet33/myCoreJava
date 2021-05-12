//Core Java program to reverse a number array to the subset of N
//Ex. Input Array = [1,3,5,7,9,11,15,17,19] | Reverse subset N = 5
//Ex. Output Array = [9,7,5,3,1,11,15,17,19] (first N = 5 elements reversed, rest elements same as input)

package CoreJavaPkg;

public class TestClass05 {

	public static void main(String[] args) {
		int[] inputArray = {1,3,5,7,9,11,13,15,17,19};
		int[] outputArray = new int[10];
		int reverseSubsetN = 4;
		int j = 0;
		
		try{
			//Up to the first N elements of input array, copy in reverse to output array
			for(int i=reverseSubsetN-1;i>=0;i--) {
				outputArray[j++]=inputArray[i];
			}
			
			//Remaining input array elements copied as is to output array
			for(int i=reverseSubsetN;i<inputArray.length;i++) {
				outputArray[j++]=inputArray[i];
			}
	
			//Print input and output
			for(int i:inputArray) {
				System.out.print(i+" ");
			}
			System.out.println();
			for(int o:outputArray) {
				System.out.print(o+" ");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Reverse Subset N cannot exceed input array length");
		}
	}

}
