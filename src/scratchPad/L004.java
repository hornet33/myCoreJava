package scratchPad;

import java.util.*;
import java.lang.StringBuffer;

public class L004 {
    public static void main(String[] args) {
//        Set<String> mySet = new LinkedHashSet<>();
//        Map<String, Integer> myMap = new HashMap<>();
//
//        mySet.add("Apples");
////        mySet.add("Apples");
//        System.out.println(mySet);
//        for (String item: mySet
//             ) {
//            System.out.println(item);
//        }
//
//        myMap.put("Apples",10);
////        myMap.put("Apples", 20);
//        System.out.println(myMap);
//
//        Scanner sc = new Scanner(System.in);
//        String inp = sc.next();
//        System.out.println(inp);

        String s = "test";
        s.concat("automation");
        System.out.println(s);

        StringBuffer sb = new StringBuffer("test");
        sb.append("automation");
        System.out.println(sb);

        StringBuilder sbld = new StringBuilder("test");
        sbld.append("automation");
        System.out.println(sbld);
    }
}
