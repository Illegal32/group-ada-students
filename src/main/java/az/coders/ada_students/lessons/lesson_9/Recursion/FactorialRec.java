package az.coders.ada_students.lessons.lesson_9.Recursion;

import java.util.Scanner;

public class FactorialRec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int giris = input.nextInt();
        System.out.println(findFact(giris));
    }
//            int f = 1;
//            for (int i = 1; i <= 5; i++) {
//                f = f * i;
//            }
    public static int findFact(int y) {
        if ( y == 0 ) {
            return 1;
        }
        else if(y == 1){
            return 1;
        }
        else {
            return(y*findFact(y-1));
        }
    }
}