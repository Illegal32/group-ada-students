package az.coders.ada_students.lessons.lesson_14;

import java.util.Scanner;

public class HackerRankString3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ans = sc.next();
        String answer = new StringBuffer(ans).reverse().toString();

        if ( ans.equals(answer) ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
