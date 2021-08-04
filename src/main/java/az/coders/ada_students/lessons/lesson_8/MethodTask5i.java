package az.coders.ada_students.lessons.lesson_8;

import java.util.Scanner;

public class MethodTask5i {

    public static void main(String[] args) {
        Task5();
    }

    public static void Task5() {

        Scanner enter = new Scanner(System.in);
        char alp = enter.next().charAt(0);
        if ( (alp >= 'a' && alp <= 'z') || (alp >= 'A' && alp <= 'Z') ) {
            if ( alp == 'A' || alp == 'E' || alp == 'I' || alp == 'O' || alp == 'U' || alp == 'a' || alp == 'e' || alp == 'i' || alp == 'o' || alp == 'u' )  // A, E, I, O, U
            {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        } else
            System.out.println("ERROR");
    }
}
