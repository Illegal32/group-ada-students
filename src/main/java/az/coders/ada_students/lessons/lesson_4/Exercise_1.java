package az.coders.ada_students.lessons.lesson_4;

import java.util.Scanner;

//Take three numbers from the user and print the greatest number

public class Exercise_1 {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        int input = enter.nextInt();
        int input1 = enter.nextInt();
        int input2 = enter.nextInt();
        System.out.println(Math.max(Math.max(input,input1), input2));
//        if (input >= input1 && input >= input2) {
//            System.out.println(input);
//        }
//        else if (input1 >= input && input1 >= input2) {
//            System.out.println(input1);
//        }
//        else {
//            System.out.println(input2);
//        }
    }
}