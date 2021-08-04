package az.coders.ada_students.lessons.lesson_11.e_olymp;

import java.util.Scanner;

class perAndArea {
    int teref;

    perAndArea(int teref) {
        this.teref = teref;
    }

    int perimeter() {
        return 4 * teref;
    }

    int area() {
        return teref * teref;
    }

}

public class Square {
    public void main() {
        System.out.print("Write a number" + " ");
        System.out.println("(if wants to break this program just write any letter)");
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            perAndArea giris = new perAndArea(input.nextInt());
            System.out.println(giris.perimeter() + " " + giris.area());
        }
    }
}
