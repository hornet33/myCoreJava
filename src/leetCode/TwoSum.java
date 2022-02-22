package leetCode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> visitedNums = new LinkedHashMap<>();
        int[] indices = new int[2];
        int x = 0;

        for (int i = 0; i < nums.length; i++) {
            indices[1] = i;
            x = target - nums[i];
            if (visitedNums.isEmpty()) {
                visitedNums.put(nums[i], i);
                System.out.println(visitedNums);
            } else {
                if (visitedNums.get(x) != null) {
                    indices[0] = visitedNums.get(x);
                    break;
                } else {
                    visitedNums.put(nums[i], i);
                    System.out.println(visitedNums);
                }
            }
        }
        return (indices);
    }

    public static void main(String[] args) {
        TwoSum ob = new TwoSum();
        int[][] nums = {{3, 4, 2, 2}, {3, 4, 1, 6}, {-1, 3, 6, 4, -6, 9, 8}};
        int[] target = {7, 5, 15};
        int i = 0;
        for (int[] a : nums) {
            System.out.println(Arrays.toString(a) + target[i] + Arrays.toString(ob.twoSum(a, target[i++])));
        }
    }
}
