package az.coders.ada_students.lessons.lesson_5;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int giris = input.nextInt();
        int p = 1;
        for(int x = 1; x <= giris; x++){
            for(int y = 1; y <= x ; y++){
                System.out.print(p);
                p++;
            }
            System.out.println("");
        }
    }
}
