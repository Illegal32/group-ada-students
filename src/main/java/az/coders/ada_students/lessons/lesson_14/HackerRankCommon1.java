package az.coders.ada_students.lessons.lesson_14;

import java.util.Scanner;
import java.math.BigInteger;

public class HackerRankCommon1 {
    public static void main(String[] args) {
        BigInteger sum, multi;
        Scanner input = new Scanner(System.in);
        String n = input.next();
        String m = input.next();
        BigInteger input1 = new BigInteger(n);
        BigInteger input2 = new BigInteger(m);
        sum = input1.add(input2);
        multi = input1.multiply(input2);
        System.out.println(sum);
        System.out.print(multi);
//10000000000000000000000000022
        //222222222222222222222222222222222222

    }
}
