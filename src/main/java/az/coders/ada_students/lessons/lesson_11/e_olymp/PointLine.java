package az.coders.ada_students.lessons.lesson_11.e_olymp;

import java.util.Scanner;

class pointt {
    int x, y, A, B, C;

    pointt(int x, int y, int A, int B, int C) {
        this.x = x;
        this.y = y;
        this.A = A;
        this.B = B;
        this.C = C;
    }

    Boolean resultPoint() {
        if ( x * A + y * B + C == 0 ) return true;
        return false;
    }

}

public class PointLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        pointt giris = new pointt(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println(giris.resultPoint());
    }
}
