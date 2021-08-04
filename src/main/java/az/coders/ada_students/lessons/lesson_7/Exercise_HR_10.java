package az.coders.ada_students.lessons.lesson_7;

import java.util.Scanner;

public class Exercise_HR_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int B = input.nextInt();
        int H = input.nextInt();

        if(B > 0 && H > 0){
            System.out.println(B*H);
        }
        else
            System.out.print("java.lang.Exception: Breadth and height must be positive\n");
    }
}