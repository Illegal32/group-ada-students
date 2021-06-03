package az.coders.ada_students.lessons.lesson_2;

import java.util.Scanner;

public class task_5_switch_case {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int input = giris.nextInt();
        if ((input >= 0) && (input <= 4)) {
            System.out.print("0-4 = Suspenso\n");
        } else if (input >= 7 && input <= 8) {
            System.out.print("7-8 = Notable\n");
        } else if (input >= 9 && input <= 10) {
            System.out.print("9-10 = Sobresaliente\n");
            switch (input) {
                case 5:
                {
                    System.out.print("5 = Aprobado\n");
                }
                case 6:
                    {
                        System.out.print("6 = Bien\n");
                    }
            }
        }
    }
}