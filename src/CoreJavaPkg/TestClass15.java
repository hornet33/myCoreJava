//Core Java program to reverse a given number
//Ex. Input = 123456
//Ex. Output = 654321

package CoreJavaPkg;

public class TestClass15 {
    public static void main(String[] args) {
        long input = 24111981;
        long output = 0;

        while (input != 0) {
            output = (output * 10) + (input % 10);
            input = input / 10;

            System.out.println("input = " + input + "| output = " + output);
        }
    }
}
