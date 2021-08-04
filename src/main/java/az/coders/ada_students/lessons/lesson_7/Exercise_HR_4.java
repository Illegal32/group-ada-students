package az.coders.ada_students.lessons.lesson_7;
import java.util.*;

public class Exercise_HR_4 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int giris = input.nextInt();
        if(giris > 0 && giris <= 100) {
            if ( giris % 2 == 0) {
                if ( giris <= 5 || giris > 20 ) {
                    System.out.println("Not Weird");
                } else if ( giris > 6 ) {
                    System.out.println("Weird");
                }
            }
            else {
                    System.out.println("Weird");
                }

        }
        else
            System.out.println("Please enter number between 0 and 100");

        scanner.close();
    }
}