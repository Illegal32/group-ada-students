package az.coders.ada_students.lessons.lesson_11.e_olymp;

import java.util.Scanner;

class perimeterAndArea {
    int deger30, deger31;

    perimeterAndArea(int deger30, int deger31) {
        this.deger30 = deger30;
        this.deger31 = deger31;
    }

    int per() {
        return 2 * (deger30 + deger31);
    }

    int area() {
        return deger30 * deger31;
    }
}

public class rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Square giris1 = new Square();
        giris1.main();
        while (input.hasNextInt()) {
            perimeterAndArea giris = new perimeterAndArea(input.nextInt(), input.nextInt());
            System.out.println(giris.per() + " " + giris.area());
        }
    }
}