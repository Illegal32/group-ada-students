package az.coders.ada_students.lessons.lesson_11.e_olymp;

import java.util.Scanner;

class Heroo {
    double deger11, deger12, deger13, deger14, deger15;

    Heroo(double deger1, double deger2, double deger3, double deger4, double deger5) {
        this.deger11 = deger1;
        this.deger12 = deger2;
        this.deger13 = deger3;
        this.deger14 = deger4;
        this.deger15 = deger5;
    }

    double result() {
        double X1 = (deger11 + deger12 + deger15) / 2;
        double X2 = (deger13 + deger14 + deger15) / 2;
        double Y1 = Math.sqrt(X1 * (X1 - deger11) * (X1 - deger12) * (X1 - deger15));
        double Y2 = Math.sqrt(X2 * (X2 - deger13) * (X2 - deger14) * (X2 - deger15));
        return Y1 + Y2;
    }
}

public class HeronEolymp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Heroo giris = new Heroo(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
        System.out.printf("%.4f", giris.result());
    }
}