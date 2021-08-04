package az.coders.ada_students.lessons.lesson_7;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sutun = input.nextInt();

        int[] giris = new int[sutun];
        int sum = 0;
        for (int x = 0; x < sutun; x++) {
            for (int y = 0; y < sutun; y++) {

                if ( x == y ) {
                    System.out.print(((int) (Math.random() * 10)) + " ");
                } else if ( x + y == sutun - 1 ) {
                    System.out.print(((int) (Math.random() * 10)) + " ");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.print("\n");


        }
    }
}
