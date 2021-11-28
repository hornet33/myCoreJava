//Core Java program to sort an integer array in ascending order using insertion sort [O(n^2) complexity]
//Ex. input = {5,4,2,3,8,6,7,1}
//Ex. output = {1,2,3,4,5,6,7,8}

package interviewPrep.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] inputList = {5, 4, 2, 3, 8, 6, 7, 1};
        System.out.print("Input: ");
        printList(inputList);

        for (int i = 1; i < inputList.length; i++) {
            //Initialize j to the preceding array item of i
            int j = i - 1;
            int arrayItem = inputList[i];
            //Loop until j >=0 AND array of current index i is less than the previous index j
            while (j >= 0 && (inputList[j] > arrayItem)) {
                //Swap Logic
                inputList[j + 1] = inputList[j];
                //Decrement j
                j--;
            }
            //Swap current array item to correct position
            inputList[j + 1] = arrayItem;
            //Print array after traversal
            printList(inputList);
        }
        //Printing the final sorted array
        System.out.print("Output: ");
        printList(inputList);
    }

    //Static method to print the integer array
    public static void printList(int[] input) {
        for (int i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
