package az.coders.ada_students.lessons.lesson_15;

import java.util.Arrays;

class Solution_12 {
    public static int[] shuffle(int[] nums, int n) {
        int []shuffle = new int[2*n];
        int j = 0;
        for (int i = 0; i < nums.length;i+=2) {
            shuffle[i] = nums[j];
            shuffle[i+1] = nums[j+n];
            j++;
        }
        return shuffle;
    }
}

public class ShuffleTheArray {
    public static void main(String[] args) {
        Solution_12 solution_12 = new Solution_12();
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(Solution_12.shuffle(nums, n)));
    }
}
