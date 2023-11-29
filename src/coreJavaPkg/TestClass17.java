// Core Java program to return all the positions where an input character is found in an input string
// Ex. Input String = "Sample String", Input Char = 'S' | Output = [1, 8]
package coreJavaPkg;

import java.util.ArrayList;
import java.util.List;

public class TestClass17 {
    public static List<Integer> findCharPositions(String inputString, char inputCharacter) {
        List<Integer> foundPosition = new ArrayList<>();
        int currentIndex = 0;
        char[] strToCharArray = inputString.toCharArray();
        for (char c : strToCharArray) {
            if (c == inputCharacter) {
                foundPosition.add(currentIndex + 1); //Position = Index + 1
            }
            currentIndex++;
        }
        return (foundPosition);
    }

    public static void main(String[] args) {
        String s = "Sample String";
        char ch = 'S';

        System.out.println(findCharPositions(s, ch));
    }
}
