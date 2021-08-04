package az.coders.ada_students.lessons.lesson_11.e_olymp;

import java.util.Scanner;

class circAndArea {
    double R;

    circAndArea(double R) {
        this.R = R;
    }

    double circumference() {
        return 2 * Math.PI * R;
    }

    double area() {
        return Math.PI * R * R;
    }
}

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        circAndArea n = new circAndArea(input.nextDouble());
        System.out.printf("%.4f %.4f", n.circumference(), n.area());

    }
}