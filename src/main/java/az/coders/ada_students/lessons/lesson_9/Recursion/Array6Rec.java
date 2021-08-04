package az.coders.ada_students.lessons.lesson_9.Recursion;

import java.util.Scanner;

public class Array6Rec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int giris1 = input.nextInt();
        int giris2 = input.nextInt();
        System.out.println(array6(new int[]{giris1}, giris2));
    }
    public static boolean array6(int[] nums, int index) {
        if(index < nums.length)
            return true;
        return false;
    }
}
