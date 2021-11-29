//Core Java program to sort an integer array in ascending order using quick sort [O(n^2) complexity]
//Ex. input = {5,4,2,3,8,6,7,1}
//Ex. output = {1,2,3,4,5,6,7,8}

package interviewPrep.sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] inputList = {5, 4, 2, 3, 8, 6, 7, 1};

        System.out.print("Input: ");
        printList(inputList);

        quickSort(inputList, 0, inputList.length - 1);

        System.out.print("Output: ");
        printList(inputList);
    }

    public static void quickSort(int[] arrToSort, int low, int high) {
        int pivotIndex;

        //Check to ensure array indexes are within bounds and also for recursion end condition
        if (low < high) {

            //Pivot index from partition subroutine which will be at its correct position post subroutine call
            pivotIndex = partition(arrToSort, low, high);

            quickSort(arrToSort, low, pivotIndex - 1); //Recursive call for left (smaller) side of pivotIndex
            quickSort(arrToSort, pivotIndex + 1, high); //Recursive call for right (greater) side of pivotIndex
        }
    }

    //Partition subroutine of quick-sort algorithm
    public static int partition(int[] arr, int low, int high) {
        //Objective of this subroutine is to ensure that the pivot value gets placed at its right position
        //Initialized to the last (high) element of the array arr[high]
        int pivot = arr[high];

        //Initialize to index of smaller element
        int i = low - 1;

        //Print array state before partition
        System.out.print("low = " + low + " | high = " + high + " | pivot = " + pivot + " | array = ");
        printList(arr);

        //Loop through the array, from 'low' to 'high-1'
        for (int j = low; j <= high - 1; j++) {
            //If the current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++; //Increment the index of the smaller element
                swap(arr, i, j); //Swap the elements - smaller element with current element
            }
        }
        swap(arr, i + 1, high); //Swap to get the pivot element to get it to its correct position
        return (i + 1); //Return pivot index from current iteration which will be input for subsequent recursions
    }

    //Static method to swap two given elements of the integer array
    public static void swap(int[] arr, int i, int j) {
        //Print array state before swap
        System.out.print("Before Swap: arr[i] = " + arr[i] + " | arr[j] = " + arr[j] + " | array = ");
        printList(arr);

        //Swap logic
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        //Print array state after swap
        System.out.print("After Swap: array = ");
        printList(arr);
    }

    //Static method to print the integer array
    public static void printList(int[] input) {
        for (int i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
