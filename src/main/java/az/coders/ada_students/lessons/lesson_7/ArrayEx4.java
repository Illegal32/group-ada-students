package az.coders.ada_students.lessons.lesson_7;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int giris = input.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int[][] arr = new int[giris][giris];

        for (int x = 0; x < giris; x++) {
            for (int y = 0; y < giris; y++) {
                arr[x][y] = (int) (Math.random() * 10);
            }
        }
        for (int x = 0; x < giris; x++) {
            for (int y = 0; y < giris; y++) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }

        for (int x = 0; x < giris; x++) {
            for (int y = 0; y < giris; y++) {
                if ( x == y ) {
                    sum1 += arr[x][y];
                }
                if ( x + y == giris - 1 ) {
                    sum2 += arr[x][y];
                }
            }
        }
        System.out.printf("%s %s", sum1, sum2);
    }
}