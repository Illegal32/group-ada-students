package az.coders.ada_students.lessons.lesson_6;

import java.util.Scanner;

public class Assignment2_syl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String giris;
        giris = input.nextLine();
        int c = 0;

        for(int i = 0; i < giris.length(); i++) {
            char ch = giris.charAt(i);
            if ( ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u'){
                c++;
            }
        }
        System.out.println(c);
    }
}
