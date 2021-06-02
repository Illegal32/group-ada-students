package az.coders.ada_students.lessons.lesson_2;

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
    try{
            int input = giris.nextInt();
            if ((input >= 0) && (input <= 4)) {
                System.out.print("0-4 = Suspenso\n");
            }
            else if (input == 5)
            {
                System.out.print("5 = Aprobado\n");
            }
            else if (input == 6)
            {
                System.out.print("6 = Bien\n");
            }
            else if (input >= 7 && input <= 8)
            {
                System.out.print("7-8 = Notable\n");
            }
            else if (input >= 9 && input <= 10)
            {
                System.out.print("9-10 = Sobresaliente\n");
            }
        }
        catch ( Exception exception) {
            System.out.println("Input letter is Consonant");
        }
    }
}