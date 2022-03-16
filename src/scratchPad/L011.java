//Program to remove duplicate characters from a string
//"hello" -> "helo"
//"bumblebee" -> "bumle"

package scratchPad;

public class L011 {
    public static StringBuilder removeDuplicateFromString(String inStr) {
        StringBuilder finalString = new StringBuilder();

        for (char c : inStr.toCharArray()) {
            if (finalString.indexOf(String.valueOf(c)) == -1) {
                finalString.append(c);
            }
        }

        /*Set<Character> finalStrList = new LinkedHashSet<>();
        for(char c: inStr.toCharArray()){
            finalStrList.add(c);
        }
        finalString = new StringBuilder(finalStrList.toString());*/

        return finalString;
    }

    public static void main(String[] args) {
        String input = "bumblebee";
        System.out.println(input + " -> " + removeDuplicateFromString(input));
    }
}
