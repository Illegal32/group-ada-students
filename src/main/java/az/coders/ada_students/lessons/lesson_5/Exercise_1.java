package az.coders.ada_students.lessons.lesson_5;

public class Exercise_1 {
    public static void main(String[] args) {

        for(int x = 1; x<=10; x++){
            for(int y = 1; y<=x;y++){
                System.out.printf("%s ", y);
            }
            System.out.println("");
        }
    }
}