package az.coders.ada_students.lessons.lesson_7;

import java.util.Scanner;

public class Exercise_HR_8 {


    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int y = 0; y < n; y++) {
                a = a + b;
                if ( y > 0 )
                    System.out.print(" ");
                System.out.print(a);

                b = b * 2;
            }
            System.out.println("");
        }
        in.close();
    }
}