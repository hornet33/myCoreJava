package scratchPad;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class L012 {
    public static void main(String[] args) {
        String inputStr = "Rahul Selenium Java Python Rahul Java";
        String[] inputArr = inputStr.split(" ");
        Set<String> outputSet = new LinkedHashSet<>(Arrays.asList(inputArr));
        System.out.println(outputSet);
    }
}
