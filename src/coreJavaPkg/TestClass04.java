//Core Java program to move all zeroes to the end for a number given in Array form
//Ex. Input = {2,0,4,0,3,0,5}
//Ex. Output = {2,4,3,5,0,0,0}

package coreJavaPkg;

import java.util.Arrays;

public class TestClass04 {

		public static void main(String[] args) {
			int[] inputArray = {0,4,2,3,0,1,5,0,6,9,7};
			
			//Create outputArray of the same size as the inputArray
			int[] outputArray = new int[inputArray.length];
			int j = 0;
			
			//Loop through input array and copy non-zero numbers to output array
            for (int k : inputArray) {
                if (k != 0) {
                    outputArray[j++] = k;
                }
            }
			
			//For remaining positions of input array length, fill the output array with zero values
			for(;j<inputArray.length;j++) {
				outputArray[j]=0;
			}
			
			//Print input and output
			System.out.println(Arrays.toString(inputArray));
			System.out.println(Arrays.toString(outputArray));
		}
}
