package az.coders.ada_students.lessons.lesson_7;

import java.util.Scanner;

public class Exercise_HR_7 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int N = giris.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", N, i, N*i);
        }
    }
}
