package az.coders.ada_students.lessons.lesson_17.assignment2;

public class Point {

    private float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this(p.getX(), p.getY());
    }

    public Point() {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void translate(float dX, float dY) {
        this.x = dX;
        this.y = dY;
    }

    public double distance(Point p) {
        double finalX = Math.pow(x - p.getX(), 2);
        double finalY = Math.pow(y - p.getY(), 2);
        return Math.sqrt(finalX + finalY);
    }

    public static double distance(Point p1, Point p2) {
        return distance(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double finalx = x2 - x1;
        double finaly = y2 - y1;
        return Math.sqrt(Math.pow(finalx, 2) + Math.pow(finaly, 2));
    }

    public int inWhichQuadrant() {
        if ( x > 0 ) {
            if ( y > 0 ) return 1;
            return 4;
        } else if ( x < 0 ) {
            if ( y > 0 ) return 2;
            return 3;
        } else if ( y == 0 ) return 0;
        return 0;
    }

    public static int inWhichQuadrant(Point p) {
        if ( p.x > 0 ) {
            if ( p.y > 0 )
                return 1;
            else if ( p.y < 0 )
                return 4;
        } else if ( p.x < 0 ) {
            if ( p.y > 0 ) return 2;
            return 3;
        } else return 0;
        return 0;
    }

    public String toString() {

        return "(" +
                this.x +
                ',' +
                this.y +
                ")";
    }

    public boolean equals(Point p) {
        return p.x == x && p.y == y;
    }

}
