package az.coders.ada_students.lessons.lesson_9.Recursion;

public class BunnyEars2Rec {
    public static void main(String[] args) {

        System.out.println(bunnyEars2(1));
    }

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0;
        else if ( bunnies % 2 == 0 ) {
            return 3 + bunnyEars2(bunnies-1);
        } else {
            return 2 + bunnyEars2(bunnies-1);
        }
    }
}