//Core Java program to sort an integer array in ascending order using bubble sort [O(n^2) complexity]
//Ex. input = {5,4,2,3,8,6,7,1}
//Ex. output = {1,2,3,4,5,6,7,8}

package interviewPrep.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] inputList = {5, 4, 2, 3, 8, 6, 7, 1};
        System.out.print("Input: ");
        printList(inputList);

        //Outer loop runs for the length of the input array
        for (int i = 0; i < inputList.length; i++) {
            //Inner loop runs from 1 to length of the array
            for (int j = 1; j < inputList.length; j++) {
                //Swap positions if previous array element is > current array element
                //For descending order, change ">" to "<"
                if (inputList[j - 1] > inputList[j]) {
                    int temp = inputList[j - 1];
                    inputList[j - 1] = inputList[j];
                    inputList[j] = temp;
                }
            }
            //Print array state after traversal
            printList(inputList);
        }
        //Print final sorted array
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
