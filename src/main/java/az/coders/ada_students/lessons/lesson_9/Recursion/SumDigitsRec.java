package az.coders.ada_students.lessons.lesson_9.Recursion;

public class SumDigitsRec {
    public static void main(String[] args) {
        System.out.println(sumDigits(20));
    }

    public static int sumDigits(int n) {
        if ( n >= 0 && n <= 9 ) return n;
         return (n % 10 + sumDigits(n / 10));
    }
}
