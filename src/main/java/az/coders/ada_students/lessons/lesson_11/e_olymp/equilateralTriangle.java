package az.coders.ada_students.lessons.lesson_11.e_olymp;

import java.util.Scanner;

class equaTri {
    double deger20;

    equaTri(double deger20) {
        this.deger20 = deger20;
    }

    double per() {
        return 3 * deger20;
    }

    double areaa() {
        return Math.pow(deger20, 2) * (Math.sqrt(3) / 4);
    }

}

public class equilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        equaTri giris = new equaTri(input.nextDouble());
        System.out.printf("%.4f %.4f", giris.per(), giris.areaa());
    }
}
