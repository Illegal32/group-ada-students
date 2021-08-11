package az.coders.ada_students.lessons.lesson_19;

class Solution19_2 {
    public int mySqrt(int x) {
        double res = Math.sqrt(x);
        return (int) res;
    }
}

public class Sqrt_x {
    public static void main(String[] args) {
        Solution19_2 solution19_2 = new Solution19_2();
        System.out.println(solution19_2.mySqrt(26));
    }
}
