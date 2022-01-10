//Core Java program to calculate the frequency of characters in a string (case sensitive)
//Ex. Input String = "Selenium"
//Ex. Output = "S=1,e=2,l=1,n=1,i=1,u=1,m=1"

package scratchPad;

import java.util.*;

public class L005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        char[] chArray = input.toCharArray();

        Map<String, Integer> charCount = new LinkedHashMap<>();

        for (char c: chArray){
            if(charCount.containsKey(String.valueOf(c))){
                charCount.put(String.valueOf(c), charCount.get(String.valueOf(c)) + 1);
            }
            else{
                charCount.put(String.valueOf(c), 1);
            }
        }
        System.out.println(charCount);
    }
}
