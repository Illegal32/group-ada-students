package az.coders.ada_students.lessons.lesson_14;

class Solution3 {
    public int subtractProductAndSum(int n) {
        int cem = 0;
        int hasil = 1;
        while (n > 0) {
            cem += n % 10;
            hasil *= n % 10;
            n /= 10;
        }
        return hasil - cem;
    }
}

public class SubtracttheProductandSumofDigitsofanInteger {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.subtractProductAndSum(25));
    }
}

