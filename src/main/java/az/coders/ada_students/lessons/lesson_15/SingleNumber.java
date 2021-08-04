package az.coders.ada_students.lessons.lesson_15;

class Solution_15 {
    public static int singleNumber(int[] nums) {
        int number = 0;
        for (int num : nums) {
            number = number ^ num;
        }
        return number;
    }
}

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(Solution_15.singleNumber(nums));
    }
}
