package az.coders.ada_students.lessons.lesson_18;

class Solution18_3 {
    public int tribonacci(int n) {
        if ( n == 0 ) return 0;
        if ( n == 1 || n == 2 ) return 1;
        int[] res = new int[n + 1];
        res[0] = 0;
        res[1] = 1;
        res[2] = 1;
        for (int i = 3; i <= n; i++) {
            res[i] = res[i - 3] + res[i - 2] + res[i - 1];
        }
        return res[n];
    }
}

public class NthTribonacciNumber {
    public static void main(String[] args) {
        Solution18_3 solution18_3 = new Solution18_3();
        System.out.println(solution18_3.tribonacci(4));
    }
}
