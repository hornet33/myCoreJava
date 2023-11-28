package scratchPad;

import java.util.HashMap;

public class L002 {

    public static void main(String[] args) {
        HashMap<String, Integer> pantry = new HashMap<>();

        pantry.put("Apples", 3);
        pantry.put("Oranges", 2);

        int currentApples = pantry.get("Apples");
        pantry.put("Apples", currentApples + 4);

        System.out.println(pantry.get("Apples"));

        pantry.put("Apples", 10);
        System.out.println(pantry);
    }
}