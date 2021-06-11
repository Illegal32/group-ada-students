package az.coders.ada_students.lessons.lesson_5;

import java.util.Scanner;

public class Star_1 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int input = giris.nextInt();
        for(int i = 1; i <= input; i++){
            for(int e = 1; e<= input; e++)

                System.out.print("* " );
            System.out.println();
        }

    }
}
