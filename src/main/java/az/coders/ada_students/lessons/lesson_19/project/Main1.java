package az.coders.ada_students.lessons.lesson_19.project;

import java.util.Scanner;

public class Main1 {
    private static final Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        int str = SC.nextInt();
        for (ID id: ID.values()) {
            if ( id.getId() == str )
                System.out.println(id);
        }
    }
}
