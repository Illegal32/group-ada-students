package az.coders.ada_students.lessons.lesson_7;

import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.printf("%d", A.length() + B.length());
        System.out.println();

        if ( A.compareTo(B) > 0 )
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));

    }
}