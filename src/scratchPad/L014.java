package scratchPad;

import java.util.*;

public class L014 {
    public static void main(String[] args) {

        String input = "Quick Brown Fox Field Brown Black Blue Fox Test Brown Blue Sky";
        String[] inputSentence = input.split(" ");

        System.out.println("Input: " + Arrays.toString(inputSentence));

        //To count the number of times a word comes in a sentence
        Map<String, Integer> wordCountMap = new LinkedHashMap<>();
        for(String s: inputSentence) {
            if(wordCountMap.containsKey(s)){
                wordCountMap.put(s, wordCountMap.get(s) + 1);
            }
            else{
                wordCountMap.put(s, 1);
            }
        }
        System.out.println("Word Count: " + wordCountMap);

        //To remove redundant words from the input
        Set<String> uniqueWords = new LinkedHashSet<>();
        Collections.addAll(uniqueWords, inputSentence);
        System.out.println("Unique Words: " + uniqueWords);
    }
}
