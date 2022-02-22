//Core Java program to calculate the frequency of characters in a string (case sensitive)
//Ex. Input String = "Selenium"
//Ex. Output = "S=1,e=2,l=1,n=1,i=1,u=1,m=1"

package scratchPad;

import java.util.*;

public class L005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char[] chArray = sc.next().toCharArray();
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (char c: chArray){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else{
                charCountMap.put(c, 1);
            }
        }
        System.out.println(charCountMap);
    }
}
