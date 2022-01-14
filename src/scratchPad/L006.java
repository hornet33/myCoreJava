//Program to find the two elements from an array that are equal to a given sum 'k'
package scratchPad;

public class L006 {

    public static void main(String[] args) {
        int[] n = {2, 6, 10, 3, 5};
        int k = 11;
        int one = 0;
        int two = 0;

        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] + n[j] == k) {
                    one = n[i];
                    two = n[j];
                    break;
                }
            }
        }
        System.out.println(one + " " + two);
    }
}

