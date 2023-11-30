//Program to reverse a string

package scratchPad;

public class L017 {
    public static void main(String[] args) {
        String str = "rahul pradhan";
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.printf("Actual Word: '%s' | Word after reversing: '%s'", str, reverse);
    }
}