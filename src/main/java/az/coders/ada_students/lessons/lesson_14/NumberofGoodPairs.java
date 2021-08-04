package az.coders.ada_students.lessons.lesson_14;

class Solution1 {
    public int numIdenticalPairs(int[] nums) {
    int count = 0;
        for(int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++)
                if(nums[i] == nums[j])
                    count++;
        }
        return count;
    }
}

public class NumberofGoodPairs {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int [] nums = {1, 1, 1, 1};
        System.out.println(solution1.numIdenticalPairs(nums));
    }
}
