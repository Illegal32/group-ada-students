package az.coders.ada_students.lessons.lesson_11.e_olymp;

import java.util.Scanner;

class perAndAreaTri {
    double deger1, deger2, deger3, deger4, deger5, deger6;

    perAndAreaTri(double deger1, double deger2, double deger3, double deger4, double deger5, double deger6) {
        this.deger1 = deger1;
        this.deger2 = deger2;
        this.deger3 = deger3;
        this.deger4 = deger4;
        this.deger5 = deger5;
        this.deger6 = deger6;
    }

    double perimeter() {
        double X1 = Math.sqrt((Math.pow((deger1 - deger3), 2)) + (Math.pow((deger2 - deger4), 2)));
        double X2 = Math.sqrt((Math.pow((deger3 - deger5), 2)) + (Math.pow((deger4 - deger6), 2)));
        double X3 = Math.sqrt((Math.pow((deger1 - deger5), 2)) + (Math.pow((deger2 - deger6), 2)));
        return X1 + X2 + X3;
    }

    double area() {
        double Y1 = Math.sqrt((Math.pow((deger1 - deger3), 2)) + (Math.pow((deger2 - deger4), 2)));
        double Y2 = Math.sqrt((Math.pow((deger3 - deger5), 2)) + (Math.pow((deger4 - deger6), 2)));
        double Y3 = Math.sqrt((Math.pow((deger1 - deger5), 2)) + (Math.pow((deger2 - deger6), 2)));
        double P = (Y1 + Y2 + Y3) / 2;
        return Math.sqrt(P * (P - Y1) * (P - Y2) * (P - Y3));
    }

}

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        perAndAreaTri giris = new perAndAreaTri(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
        System.out.printf("%.4f %.4f", giris.perimeter(), giris.area());
    }
}