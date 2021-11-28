//Core Java program to sort an integer array using selection sort [O(n^2) complexity
//Ex. input = {5,4,2,3,8,6,7,1}
//Ex. output = {1,2,3,4,5,6,7,8}

package interviewPrep.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        //Input array to sort
        int[] inputList = {5,4,2,3,8,6,7,1};

        //Index of the smallest element for each array traversal
        int smallestElementIndex;

        System.out.print("Input: " ); printList(inputList);

        //Sorting logic
        //Each traversal should find the smallest unsorted element in the array and swap with the current index
        for(int i=0;i<inputList.length;i++){
            smallestElementIndex = i;
            for(int j=i;j<inputList.length;j++){
                if(inputList[smallestElementIndex]>inputList[j]){
                    smallestElementIndex = j;
                }
            }
            //Printing the current array traversal details
            System.out.println("i =" + i + " | inputList[i] =" + inputList[i] +
                    " | smallestElementIndex = " + smallestElementIndex +
                    " | smallestElement =" + inputList[smallestElementIndex]);

            //Swap logic
            int temp = inputList[i];
            inputList[i] = inputList[smallestElementIndex];
            inputList[smallestElementIndex] = temp;

            //Printing the array state after current traversal/swap
            printList(inputList);
        }

        //Printing the final sorted array
        System.out.print("Output: "); printList(inputList);
    }

    //Static method to print the integer array
    public static void printList(int[] input){
        for(int i: input){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
