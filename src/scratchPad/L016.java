//Java program to find the Euclidean distance from a fixed (x,y) to a set of other (x,y) coordinates

package scratchPad;

import java.util.Arrays;

public class L016 {
    public static void main(String[] args) {
        final int[][] coordinates = new int[][]{{10, 20}, {30, 40}, {8, 10}, {7, 6}, {9, 3}, {11, 10}};
        final int[] mainPoint = new int[]{3,5};
        final int X2 = mainPoint[0];
        final int Y2 = mainPoint[1];

        System.out.println(Arrays.deepToString(coordinates)); //Print the 2D array contents instead of the address

        for (int[] i : coordinates) {
            int x2 = i[0];
            int y2 = i[1];

            System.out.print("Euclidean Distance from " + Arrays.toString(mainPoint) + " to " + Arrays.toString(i) + ": ");
            System.out.printf("%.2f", Math.sqrt(Math.pow((X2-x2),2) + Math.pow((Y2-y2),2)));
            System.out.println();
        }
    }
}
