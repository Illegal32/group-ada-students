package az.coders.ada_students.lessons.lesson_8;

import java.util.Scanner;

public class MethodTask5s {

    public static void main(String[] args) {
        Task5sv();
    }

    public static void Task5sv() {

        Scanner giris = new Scanner(System.in);
        int input = giris.nextInt();
        if ( (input >= 0) && (input <= 4) ) {
            System.out.print("0-4 = Suspenso\n");
        } else if ( input >= 7 && input <= 8 ) {
            System.out.print("7-8 = Notable\n");
        } else if ( input >= 9 && input <= 10 ) {
            System.out.print("9-10 = Sobresaliente\n");
        }
        switch (input) {
            case 5:
                System.out.print("5 = Aprobado\n");
                break;
            case 6:
                System.out.print("6 = Bien\n");
                break;
        }
    }
}
