package az.coders.ada_students.lessons.lesson_4;

// Write a Java program to find the number of days in a month.

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        Scanner giris = new Scanner(System.in);
        System.out.println("First number is located between 1-12");
        int input = giris.nextInt();
        System.out.println("Second number is shown a year");
        int input1 = giris.nextInt();

        if(input == 2){
                if ((input1 % 4 != 0) || (input1 % 400 != 0) || (input1 %100 != 0))
                    System.out.println("Febuary, " + input1 + " has 28 days");
                else
                System.out.println("Febuary, " + input1 + " has 29 days");
        }

        switch (input){
            case 1:
                System.out.println("January" + input1 + "has 31 days");
            case 3:
                System.out.println("March" + input1 + "has 31 days");
            case 4:
                System.out.println("April" + input1 + "has 30 days");
            case 5:
                System.out.println("May" + input1 + "has 31 days");
            case 6:
                System.out.println("June" + input1 + "has 30 days");
            case 7:
                System.out.println("July" + input1 + "has 31 days");
            case 8:
                System.out.println("August" + input1 + "has 31 days");
            case 9:
                System.out.println("September" + input1 + "has 30 days");
            case 10:
                System.out.println("October" + input1 + "has 31 days");
            case 11:
                System.out.println("November" + input1 + "has 30 days");
            case 12:
                System.out.println("December" + input1 + "has 31 days");

        }
    }
}
