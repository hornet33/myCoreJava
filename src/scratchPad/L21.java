package scratchPad;

public class L21 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = (s1+s2).intern();
        String s4 = "HelloWorld";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}
