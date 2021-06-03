package az.coders.ada_students.lessons.lesson_3;

import java.util.Scanner;

public class task_6_Loop1 {
    public static void main(String[] args) {
    //Write a program to enter the numbers till the user wants and
    //at the end it should display the count of positive, negative and zeros entered
        int pos = 0;
        int neg = 0;
        int zero = 0;

          Scanner Giris = new Scanner(System.in);
            System.out.println("Enter any number!");
            while (Giris.hasNextInt()) {

                int AnyNumber = Giris.nextInt();

                if (AnyNumber > 0)
                {
                    pos++;
                }
                else if (AnyNumber < 0)
                {
                    neg++;
                }
                else if (AnyNumber == 0)
                {
                    zero++;
                }
            }
        System.out.println("Positive Numbers are Counted :" + pos);
        System.out.println("Negative Numbers are Counted :" + neg);
        System.out.println("Zeros are Counted :" + zero);
    }
}
