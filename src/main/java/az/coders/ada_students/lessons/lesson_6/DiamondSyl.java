package az.coders.ada_students.lessons.lesson_6;

import java.util.Scanner;

public class DiamondSyl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int giris = input.nextInt();

        for (int i = 0; i <= giris; i++) {
            for (int j = 1; j <= giris - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = giris; i >= 0; i--) {
            for (int j = 1; j <= giris - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}

//         *
//        ***
//       *****
//      *******
//      *******
//       *****
//        ***
//         *