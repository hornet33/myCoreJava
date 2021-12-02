package leetCode;

import java.util.Arrays;

public class HouseRob {
    private int[] memo;

    public int robRecursive(int[] nums) {

        this.memo = new int[100];

        // Fill with sentinel value representing not-calculated recursions.
        Arrays.fill(this.memo, -1);

        return this.robFrom(0, nums);
    }

    private int robFrom(int i, int[] nums) {

        // No more houses left to examine.
        if (i >= nums.length) {
            return 0;
        }

        // Return cached value.
        if (this.memo[i] > -1) {
            return this.memo[i];
        }

        // Recursive relation evaluation to get the optimal answer.
        int ans = Math.max(this.robFrom(i + 1, nums), this.robFrom(i + 2, nums) + nums[i]);

        // Cache for future use.
        this.memo[i] = ans;
        return ans;
    }

    public int myRobLogic(int[] nums) {
        int maxMoneyPath1 = nums[0];
        int maxMoneyPath2 = Math.max(maxMoneyPath1, nums[1]);
        int maxMoney = maxMoneyPath2;

        for (int i = 2; i < nums.length; i++) {
            maxMoney = Math.max(maxMoneyPath2, maxMoneyPath1 + nums[i]);
            maxMoneyPath1 = maxMoneyPath2;
            maxMoneyPath2 = maxMoney;
        }

        return (maxMoney);
    }

    public static void main(String[] args) {
        HouseRob houseRob = new HouseRob();
        int[][] nums = {{2, 5, 9, 3, 1, 9}, {2, 1, 1, 6}, {100, 50, 400, 700, 100}};
        for (int[] n : nums) {
            System.out.println(Arrays.toString(n) + " | " + houseRob.myRobLogic(n));
        }
    }
}
