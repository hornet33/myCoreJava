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
        TwoSum ob = new TwoSum();
        int[][] nums = {{3, 4, 2, 2}, {3, 4, 1, 6}, {-1, 3, 6, 4, -6, 9, 8}};
        int[] target = {4, 5, 15};
        int i = 0;
        for (int[] a : nums) {
            System.out.println(Arrays.toString(a) + target[i] + Arrays.toString(ob.twoSum(a, target[i++])));
        }
    }
}
