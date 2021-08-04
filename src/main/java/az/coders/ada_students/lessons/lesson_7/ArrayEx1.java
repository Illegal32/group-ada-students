package az.coders.ada_students.lessons.lesson_7;

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int giris = input.nextInt();

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
    }
}