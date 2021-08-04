package az.coders.ada_students.lessons.lesson_15;

import java.util.Arrays;

class Solution_11 {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
    return nums;
    }
}

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        Solution_11 solution_11 = new Solution_11();
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(solution_11.runningSum(nums)));
    }
}
