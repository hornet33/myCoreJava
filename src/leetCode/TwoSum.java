package leetCode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> visitedNums = new LinkedHashMap<Integer, Integer>();
        int[] indices = new int[2];
        int x = 0;

        for (int i = 0; i < nums.length; i++) {
            indices[0] = i;
            x = target - nums[i];
            if (visitedNums.isEmpty()) {
                visitedNums.put(nums[i], i);
            } else {
                if (visitedNums.get(x) != null) {
                    indices[1] = visitedNums.get(x);
                    break;
                } else {
                    visitedNums.put(nums[i], i);
                }
            }
        }
        return (indices);
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 1, 6};
        int target = 5;
        TwoSum ob = new TwoSum();
        System.out.println(Arrays.toString(ob.twoSum(nums, target)));
    }
}
