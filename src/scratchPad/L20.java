package scratchPad;

import java.util.ArrayList;

public class L20 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add("one");
        list.add("two");
        System.out.println(list.size());

        list.ensureCapacity(3);
        System.out.println(list.size());

        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list.size());
    }
}
