package az.coders.ada_students.lessons.lesson_9.Recursion;

public class Prosta {
    public static void main(String[] args) {
//        for(int i = 1; i <= 5; i++){
//            System.out.println("Hello " + i);
//        }
        ex1(5);
    }
    public static void ex1(int x){
        if(x > 0){
            ex1(x-1);
            System.out.println("Hello " + x);
        }
    }
}
