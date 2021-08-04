package az.coders.ada_students.lessons.lesson_15;

import java.util.Arrays;

class Solution_14 {
    public static int[] buildArray(int[] nums) {
        int[] buildArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            buildArray[i]= nums[nums[i]];
        }
        return buildArray;
    }
}

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(Solution_14.buildArray(nums)));
    }
}
