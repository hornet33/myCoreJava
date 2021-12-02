package leetCode;

import java.util.Arrays;

public class HouseRob {
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
