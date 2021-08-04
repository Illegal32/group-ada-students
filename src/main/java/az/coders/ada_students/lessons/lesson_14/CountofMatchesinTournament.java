package az.coders.ada_students.lessons.lesson_14;

class Solution4 {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        while (n != 1){
            int f = n/2;
            int remainder = n % 2;
            sum = sum + f;
            n = f + remainder;
        }
        return sum;
    }
}

public class CountofMatchesinTournament {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.subtractProductAndSum(7));
    }
}
