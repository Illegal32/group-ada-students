package az.coders.ada_students.lessons.lesson_6;

import java.util.Scanner;

public class Assignment1_syl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String giris = input.next();
        int v = giris.length() / 2;
        if(giris.length() % 2 == 1){
            System.out.println(giris.charAt(v));
        }
        else {
            System.out.println(giris.substring(v-1,v+1));
        }
    }
}
