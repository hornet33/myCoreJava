package scratchPad;

public class L010 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;

        int fibRange = 10;

        System.out.println("Fibonacci - 1: " + n1);
        System.out.println("Fibonacci - 2: " + n2);
        for (int i = 3; i <= fibRange; i++) {
            int tSum = n1 + n2;
            System.out.println("Fibonacci - " + i + ": " + tSum);
            n1 = n2;
            n2 = tSum;
        }
    }
}
