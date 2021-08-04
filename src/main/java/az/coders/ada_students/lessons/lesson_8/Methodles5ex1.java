package az.coders.ada_students.lessons.lesson_8;

import java.util.Scanner;

public class Methodles5ex1 {
    public static void main(String[] args) {
        Ex1();
        Ex3();
        Ex4();
        Ex5();
        Ex6();
        StarTask();
    }

    public static void Ex1(){
        for(int x = 1; x<=10; x++){
            for(int y = 1; y<=x;y++){
                System.out.printf("%s ", y);
            }
            System.out.println("");
        }
    }

    public static void Ex3(){
        Scanner input = new Scanner(System.in);
        int giris = input.nextInt();
        int p = 1;
        for(int x = 1; x <= giris; x++){
            for(int y = 1; y <= x ; y++){
                System.out.print(p);
                ++p;
            }
            System.out.println("");
        }
    }
    public static void Ex4(){
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
            }else if (giris>=1000000000){
                System.out.println("Integer has 9 numbers");
            }
            else{
                System.out.println("Please, enter positive number or less that 10 billion");
            }
        }
    }

    public static void Ex5(){
        Scanner input = new Scanner(System.in);
        int giris1 = input.nextInt();
        int giris2 = input.nextInt();
        int giris3 = input.nextInt();

        if (giris1 == giris2 && giris2 == giris3) {
            System.out.println("All numbers are equal");
        }
        else if (giris1 == giris2 || giris2 == giris3 || giris1 == giris3) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }

    public static void Ex6(){
        Scanner input = new Scanner(System.in);
        int giris1 = input.nextInt();
        int giris2 = input.nextInt();
        int giris3 = input.nextInt();

        if(giris1 < giris2 && giris2 < giris3)
            System.out.println("increasing order");
        else if(giris1 > giris2 && giris2 > giris3)
            System.out.println("decreasing order");
        else if(giris1 <= giris2 && giris2 >= giris3 || giris1 >= giris2 && giris2 <= giris3)
            System.out.println("Neither increasing or decreasing order");
    }

    public static void StarTask(){
        Scanner giris = new Scanner(System.in);
        int input = giris.nextInt();
        for(int i = 1; i <= input; i++){
            for(int e = 1; e<= i; e++)

                System.out.print("* " );
            System.out.println();
        }
    }

}

