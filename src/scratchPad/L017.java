//Program to reverse a string

package scratchPad;

import java.util.Arrays;

public class L017 {
    public static void main(String[] args) {
        String str = "Python is a good scripting language";
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.printf("Actual Word: '%s' | Word after reversing: '%s' \n", str, reverse);

        System.out.println();

        //Get the first characters from the reversed words
        String[] sArr = reverse.split(" ");
        System.out.println(Arrays.toString(sArr));
        StringBuilder firstCharStr = new StringBuilder();
        for(String s: sArr){
            firstCharStr.append(s.charAt(0));
        }
        System.out.println(firstCharStr);
    }
}