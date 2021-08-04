package az.coders.ada_students.lessons.lesson_9.Recursion;

public class FibonacciRec {
    public static void main(String[] args) {

        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n) {
        if ( n <= 1 )
            return n;
        //System.out.println(fibonacci(n));
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}