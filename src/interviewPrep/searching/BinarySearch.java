package interviewPrep.searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] inputList = {12, 16, 24, 27, 28, 34, 59, 71}; //Pre-requisite to have the input search list to be sorted
        int searchNum = 12;

        System.out.println("Input Array: " + Arrays.toString(inputList));

        int indexFound = doBinarySearch(inputList, 0, inputList.length-1, searchNum);
        if (indexFound >= 0) {
            System.out.println("Number " + searchNum + " found at index " + indexFound);
        } else if (indexFound == -1) {
            System.out.println("Number " + searchNum + " not found in the array");
        }
    }

    public static int doBinarySearch(int[] inputArray, int lowerBound, int upperBound, int searchNum) {

        //Check to ensure array limits are not exceeded for both lower and upper bounds
        if (upperBound >= lowerBound) {

            //Calculate the middle index to search for this iteration
            int mid = lowerBound + (upperBound - lowerBound) / 2;

            System.out.println("lowerBound = " + lowerBound + " | upperBound = " + upperBound +
                    " | mid = " + mid + " | input[mid] = " + inputArray[mid]);

            //If searchNum < array[mid] then focus on left side of the array - lowerBound to mid-1
            if (searchNum < inputArray[mid]) {
                //Recursive call to method
                return (doBinarySearch(inputArray, lowerBound, mid - 1, searchNum));
            }
            //If searchNum > array[mid] then focus on right side of the array - mid+1 to upperBound
            else if (searchNum > inputArray[mid]) {
                //Recursive call to method
                return (doBinarySearch(inputArray, mid + 1, upperBound, searchNum));
            }
            //If searchNum == array[mid] return the index 'mid'
            else if (inputArray[mid] == searchNum) {
                return mid; //Element found at this position
            }
        }
        return -1; //Element not found
    }
}
