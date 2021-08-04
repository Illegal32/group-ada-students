package az.coders.ada_students.lessons.lesson_8;

import java.util.Scanner;

public class MedhodLeet1 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int[] nums = new int[4];
        int target = giris.nextInt();

        for(int i = 0; i<nums.length; i++)
            nums[i] = giris.nextInt();

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(target == nums[i] + nums[j]){
                    System.out.print("[" + i);
                    System.out.print(" " + j + "]");
                    break;
                }
            }
        }
    }
}
