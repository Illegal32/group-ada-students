package az.coders.ada_students.lessons.lesson_11.e_olymp;

import java.util.Scanner;

class pointcircle {
    int x1, y1, x2, y2, z1;

    pointcircle(int x1, int y1, int x2, int y2, int z1) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.z1 = z1;
    }

    Boolean result() {
        if ( (x1 - y2) * (x1 - y2) + (y1 - z1) * (y1 - z1) <= x2 * x2 )
            return true;
        else
            return false;
    }
}

public class PointWithinCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        pointcircle giris = new pointcircle(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println(giris.result());
    }
}
