package az.coders.ada_students.lessons.lesson_5;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int giris1 = input.nextInt();
        int giris2 = input.nextInt();
        int giris3 = input.nextInt();

        if(giris1 < giris2 && giris2 < giris3)
            System.out.println("increasing order");
        else if(giris1 > giris2 && giris2 > giris3)
            System.out.println("decreasing order");
        else if(giris1 <= giris2 && giris2 >= giris3 || giris1 >= giris2 && giris2 <= giris3)
            System.out.println("Neither increasing or decreasing order");
    }
}
