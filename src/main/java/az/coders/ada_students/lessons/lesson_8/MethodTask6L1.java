package az.coders.ada_students.lessons.lesson_8;

import java.util.Scanner;

public class MethodTask6L1 {

    public static void main(String[] args) {
        Task6();
    }

        public static void Task6() {
        int pos = 0;
        int neg = 0;
        int zero = 0;

        Scanner giris = new Scanner(System.in);
        System.out.println("For Break, Write 'A'");
        System.out.println("Enter any number!");
        while (giris.hasNextInt()) {
            int AnyNumber = giris.nextInt();
            System.out.println("Enter new number");
            if ( AnyNumber > 0 ) {
                pos++;
            } else if ( AnyNumber < 0 ) {
                neg++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive Numbers are Counted :" + pos);
        System.out.println("Negative Numbers are Counted :" + neg);
        System.out.println("Zeros are Counted :" + zero);
    }
}