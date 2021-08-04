package az.coders.ada_students.lessons.lesson_11.e_olymp;

import java.util.Scanner;

class vecLen {
    double deger10, deger11, deger12, deger13;

    vecLen(double deger10, double deger11, double deger12, double deger13) {
        this.deger10 = deger10;
        this.deger11 = deger11;
        this.deger12 = deger12;
        this.deger13 = deger13;
    }

    double result() {
        return Math.sqrt((Math.pow((deger10 - deger12), 2)) + (Math.pow((deger11 - deger13), 2)));
    }
}

public class vectorLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        vecLen giris = new vecLen(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
        System.out.printf("%.6f", giris.result());
    }
}
