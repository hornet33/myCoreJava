//Program to find if two strings are anagrams or not
//Ex. S1 = "life", S2 = "file" | Output = "Anagrams"

package CoreJavaPkg;

public class TestClass18 {
    public static Boolean isAnagram(String[] values) {
        char[] v1 = values[0].toCharArray();
        int l1 = values[0].length() - 1;
        int l2 = values[1].length() - 1;

        if (l1 != l2) {
            return false;
        }

        for (int i = 0; i <= l1; i++) {
            if (values[1].indexOf(v1[i]) == -1) {
                return false;
            }
        }
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
