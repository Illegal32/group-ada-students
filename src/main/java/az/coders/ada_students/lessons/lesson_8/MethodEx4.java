package az.coders.ada_students.lessons.lesson_8;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Ex1();
        Ex2();
        Ex3();
        Ex4();
        Ex5();
    }
    public static void Ex1(){
        System.out.println("Enter any number for knowing which number is the biggest");
        Scanner enter = new Scanner(System.in);
        int input = enter.nextInt();
        int input1 = enter.nextInt();
        int input2 = enter.nextInt();
        System.out.println(Math.max(Math.max(input,input1), input2));
    }
    public static void Ex2(){
        System.out.println("Enter a number between 1-7");
        Scanner giris = new Scanner(System.in);
        System.out.println("This code is shown which number indicates which day of the week");
        int input = giris.nextInt();
        switch (input){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }

    public static void Ex3(){
        System.out.println("Enter two numbers : ");
        Scanner giris = new Scanner(System.in);
        System.out.println("First number is located between 1-12");
        int input = giris.nextInt();
        System.out.println("Second number is shown a year");
        int input1 = giris.nextInt();

        if(input == 2){
            if ((input1 % 4 != 0) || (input1 % 400 != 0) || (input1 %100 != 0))
                System.out.println("Febuary, " + " " + input1 + " " + " has 28 days");
            else
                System.out.println("Febuary, " + " " + input1 + " " + " has 29 days");
        }

        switch (input){
            case 1:
                System.out.println("January" + " " + input1 + " " + "has 31 days");
                break;
            case 3:
                System.out.println("March" + " " + input1 + " " + "has 31 days");
                break;
            case 4:
                System.out.println("April" + " " + input1 + " " + "has 30 days");
                break;
            case 5:
                System.out.println("May" + " " + input1 + " " + "has 31 days");
                break;
            case 6:
                System.out.println("June" + " " + input1 + " " + "has 30 days");
                break;
            case 7:
                System.out.println("July" + " " + input1 + " " + "has 31 days");
                break;
            case 8:
                System.out.println("August" + " " + input1 + " " + "has 31 days");
                break;
            case 9:
                System.out.println("September" + " " + input1 + " " + "has 30 days");
                break;
            case 10:
                System.out.println("October" + " " + input1 + " " + "has 31 days");
                break;
            case 11:
                System.out.println("November" + " " + input1 + " " + "has 30 days");
                break;
            case 12:
                System.out.println("December" + " " + input1 + " " + "has 31 days");
                break;

        }
    }

    public static void Ex4(){
        System.out.println("Enter any number for knowing that is simple or complex");
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
    public static void Ex5(){
        System.out.println("Enter any number for the sum of the divisors");
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
