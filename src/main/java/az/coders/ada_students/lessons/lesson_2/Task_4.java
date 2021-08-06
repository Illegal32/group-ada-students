package az.coders.ada_students.lessons.lesson_2;

import java.util.*;

public class Task_4 {
    public static void main(String[] args) {

        byte max = 100;
        byte min = 0;

        byte RandomNumber = (byte) Math.floor(Math.random() * (max - min + 1) + min);
        Scanner input = new Scanner(System.in);
        System.out.println(" Let the game begin!");
        while (true) {
            System.out.println("Guess your number :");
            input.hasNextInt();

            byte Formula = input.nextByte();
            if (RandomNumber == Formula) {
                System.out.println("Congratulations, Nadir!");
                break;
            } else if (RandomNumber > Formula) {
                System.out.println(" Your number is too small. Please, try again..");
            } else {
                System.out.println(" Your number is too big. Please, try again..");
            }
        }
    }
}