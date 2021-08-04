package az.coders.ada_students.lessons.lesson_6;

import java.util.Scanner;

public class Assignment5_syl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int giris = input.nextInt();

        for(int x = 0; x <= giris; x++){
            for(int y = 0; y <= giris; y++){
                System.out.print((Math.random() * 2) + " ");
            }
            System.out.println("");
        }
    }
}
