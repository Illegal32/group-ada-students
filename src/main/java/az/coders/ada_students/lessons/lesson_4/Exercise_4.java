package az.coders.ada_students.lessons.lesson_4;

//Write a program in Java to display the first 10 natural numbers.

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                int giris = input.nextInt();
                int count = 2;

                for(int i = 2; i<giris; i++) {
                    if (giris % i == 0) count++;
                }
                if(count==2){
                    System.out.println("sade");
                }
                else{
                    System.out.println("murekkeb");
                }
    }
}