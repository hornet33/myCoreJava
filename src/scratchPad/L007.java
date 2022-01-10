//Program to remove the special characters from a String

package scratchPad;

public class L007 {
    public static void main(String[] args) {
        String in = "asd#@fa&sdf1!23#$%";

        char[] out = in.toCharArray();

        String sOut = "";

        for (char c : out) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                sOut += c;
            }
        }
        System.out.println(sOut);


        String str = "This#string%contains^special*characters&.";
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        //Regex '^' means NOT so "[^a-z]" means NOT in the range "a-z"
        System.out.println(str);
    }
}
