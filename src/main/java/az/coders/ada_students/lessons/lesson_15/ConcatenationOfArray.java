package az.coders.ada_students.lessons.lesson_15;

import java.util.Arrays;

class Solution_13 {
    public static int[] getConcatenation(int[] nums) {
        int[] getConcatenation = new int[2*(nums.length)];
        for (int i = 0; i < nums.length; i++) {
            getConcatenation[i] = nums[i];
            getConcatenation[i+ nums.length] = nums[i];
        }
        return getConcatenation;
    }
}

public class ConcatenationOfArray {
    public static void main(String[] args) {
        Solution_13 solution_13 = new Solution_13();
        int [] nums = {1,2,1};
        System.out.println(Arrays.toString(Solution_13.getConcatenation(nums)));
    }
}
