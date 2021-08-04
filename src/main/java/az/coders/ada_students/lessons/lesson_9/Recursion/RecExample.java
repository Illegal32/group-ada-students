package az.coders.ada_students.lessons.lesson_9.Recursion;

public class RecExample {
    public static void main(String[] args) {
//        for(int i = 1; i <= 10; i++)
//            System.out.println(i);
            count(10);
    }

    public static void count(int x){
        if(x >= 1){
            count(x-1);
            System.out.println(x);
        }
    }
}