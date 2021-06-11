package az.coders.ada_students.lessons.lesson_5;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        System.out.println("Please, enter positive number or less that 10 billion");
        Scanner input = new Scanner(System.in);
        double giris = input.nextDouble();
        if(giris>0 && giris<1000000000) {
            if(giris>=10 && giris <=99){
                System.out.println("Integer has 2 numbers");
            }
            else if(giris>=100 && giris <=999){
                System.out.println("Integer has 3 numbers");
            }
            else if(giris>=1000 && giris <=9999){
                System.out.println("Integer has 4 numbers");
            }else if(giris>=10000 && giris <=99999){
                System.out.println("Integer has 5 numbers");
            }else if(giris>=100000 && giris <=999999){
                System.out.println("Integer has 6 numbers");
            }else if(giris>=1000000 && giris <=9999999){
                System.out.println("Integer has 7 numbers");
            }else if(giris>=10000000 && giris <=99999999){
                System.out.println("Integer has 8 numbers");
            }else{
                System.out.println("Integer has 9 numbers");
            }
        }
    }
}
