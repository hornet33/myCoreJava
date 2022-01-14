package CoreJavaPkg;

import interviewPrep.searching.BinarySearch;
import java.util.Arrays;

public class TestClass16 {
    public static void main(String[] args) {
        int[] array = {4, 7, 9, 13, 15, 17, 23, 26, 28, 29, 30};
        int searchNum = 24;
        System.out.println(Arrays.toString(array));
        if (BinarySearch.doBinarySearch(array, 0, array.length - 1, searchNum) != -1) {
            System.out.println("Found");
        } else System.out.println("Not Found");
    }
}
