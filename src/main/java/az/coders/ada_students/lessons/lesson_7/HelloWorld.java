package az.coders.ada_students.lessons.lesson_7;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        int p, q;
        Scanner s = new Scanner(System.in);
        p = s.nextInt();
        q = s.nextInt();

        int[][] a = new int[p][q];

        System.out.println("First Matrix:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}