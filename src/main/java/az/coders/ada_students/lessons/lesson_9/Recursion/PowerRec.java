package az.coders.ada_students.lessons.lesson_9.Recursion;

public class PowerRec {
    public static void main(String[] args) {
        System.out.println(powerN(3,4));
    }
    public static int powerN(int base, int n) {
        if(n==0)
            return 1;
        else return base * powerN(base, (n-1));
    }
}
