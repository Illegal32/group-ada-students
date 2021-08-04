package az.coders.ada_students.lessons.lesson_9;

import java.util.Scanner;

public class AbstractionSyl {
    public static void main(String[] args) {
        char a = 'A';
        Scanner giris = new Scanner(System.in);
        int m = giris.nextInt();

        int s = m + 3;

        for(int i = 1; i <= m; i++){
            for(int j = s; j != 0; j--){
                System.out.print(" ");
            }

            for(int n = 1; n <= i; n++){
//                for(char a = 'A'; a <= 'Z'; a++)
                System.out.print(a++ +" ");
            }
            System.out.println();
            s--;
        }

    }
}
//   1
//  222
// 33333
//4444444