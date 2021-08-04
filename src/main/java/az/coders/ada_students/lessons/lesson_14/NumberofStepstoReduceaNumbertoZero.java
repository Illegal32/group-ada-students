package az.coders.ada_students.lessons.lesson_14;

class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            if ( num % 2 == 0 )
                num = num/2;
            else
                num = num - 1;
        }
        return count;
    }

}

public class NumberofStepstoReduceaNumbertoZero {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberOfSteps(16));
    }
}