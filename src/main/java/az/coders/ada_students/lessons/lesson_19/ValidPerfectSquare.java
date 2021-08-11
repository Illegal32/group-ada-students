package az.coders.ada_students.lessons.lesson_19;

class Solution19_3 {
    public boolean isPerfectSquare(int num) {
        for (int i = 0; i <= num; i++) {
            if ( i * i == num ) return true;
        }
        return false;
    }
}

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Solution19_3 solution19_3 = new Solution19_3();
        System.out.println(solution19_3.isPerfectSquare(31));
    }
}
