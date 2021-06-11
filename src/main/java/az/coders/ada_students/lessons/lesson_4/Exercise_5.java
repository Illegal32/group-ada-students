package az.coders.ada_students.lessons.lesson_4;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int input = giris.nextInt();
        int sum = input + 1;
        for (int i = 2; i < input - 1; i++) {
            if (input % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
