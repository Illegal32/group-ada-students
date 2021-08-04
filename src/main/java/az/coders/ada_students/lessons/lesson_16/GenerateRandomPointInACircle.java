package az.coders.ada_students.lessons.lesson_16;

import java.util.Arrays;
import java.util.Random;

public class GenerateRandomPointInACircle {
    public static void main(String[] args) {
        Solution_22 solution_22 = new Solution_22(1.0, 0.0, 0.0);
        solution_22.randPoint();
        solution_22.randPoint();
        solution_22.randPoint();

        System.out.println(Arrays.toString(solution_22.randPoint()));
    }

}
class Solution_22 {


    private final double radius;
    private final double x_center;
    private final double y_center;
    private double x,y,r;

    public Solution_22(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public double[] randPoint() {

        double[] n = new double[2];
        Random random = new Random();
        n[0] = random.nextDouble() * ((x+r) - (x-r)) + (x-r);
        n[1] = random.nextDouble() * ((y+r) - (y-r)) + (y-r);

        return n;
    }
}