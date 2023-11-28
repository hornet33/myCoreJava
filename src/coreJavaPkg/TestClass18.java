//Program to find if two strings are anagrams or not
//Ex. S1 = "life", S2 = "file" | Output = "Anagrams"

package coreJavaPkg;

public class TestClass18 {
    public static Boolean isAnagram(String[] values) {

        char[] v1 = values[0].toCharArray(); //Store the first string as a char[]
        int l1 = values[0].length() - 1; //Get the length of the first string
        int l2 = values[1].length() - 1; //Get the length of the second string

        //Length of both strings have to be the same - if not, return false
        if (l1 != l2) {
            return false;
        }

        //Loop through the length of the first string
        for (int i = 0; i <= l1; i++) {

            //If any character in first string v1 is not found in second string (values[1]), return false
            if (values[1].indexOf(v1[i]) == -1) {
                return false;
            }
        }
        //Since lengths are the same and all characters are present in both strings, return true
        return true;
    }

    public static void main(String[] args) {
        String[] s1 = {"triangle", "integral"};

        Boolean s1IsAnagram = isAnagram(s1);
        System.out.println(s1IsAnagram);

        s1 = new String[]{"listen", "silent"};
        s1IsAnagram = isAnagram(s1);
        System.out.println(s1IsAnagram);

        s1 = new String[]{"file", "life"};
        s1IsAnagram = isAnagram(s1);
        System.out.println(s1IsAnagram);

        s1 = new String[]{"hi", "hello"};
        s1IsAnagram = isAnagram(s1);
        System.out.println(s1IsAnagram);
    }
}
