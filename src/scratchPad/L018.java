//Program to find the second-highest number in an integer array

package scratchPad;

import java.util.*;

public class L018 {
    public static void main(String[] args) {
        int[] array = { 10, 20, 2, 45, 3, 14, 32, 4,42, 1, 24};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.printf("Second Largest Element: %s \n", array[array.length-2]);

        //Using ArrayList
        Integer[] arrayInteger = { 10, 20, 2, 45, 3, 14, 32, 4,42, 1, 24};
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(arrayInteger));
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        l.sort(Collections.reverseOrder());
        System.out.println(l);
        System.out.printf("Second Largest Element: %s \n", l.get(1));
    }
}
