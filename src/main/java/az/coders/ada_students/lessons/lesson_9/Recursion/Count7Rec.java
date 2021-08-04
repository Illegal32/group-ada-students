package az.coders.ada_students.lessons.lesson_9.Recursion;

public class Count7Rec {
    public static void main(String[] args) {
        System.out.println(count7(770));
    }
    public static int count7(int n) {
        int count = 0;
        if ( n % 10 == 7 ) count++;
        if ( n / 10 == 0 ) return count;
        return count + count7(n/10);
    }
}
