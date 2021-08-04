package az.coders.ada_students.lessons.lesson_17.assignment2;

public class Triangle {

    private final Point vertex1;
    private final Point vertex2;
    private final Point vertex3;

    static double vertex1_l;
    static double vertex2_l;
    static double vertex3_l;

    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }

    public Triangle(Triangle t1) {
        this(t1.vertex1, t1.vertex2, t1.vertex3);
    }

    public Point getVertex1() {
        return vertex1;
    }

    public Point getVertex2() {
        return vertex2;
    }

    public Point getVertex3() {
        return vertex3;
    }

    public static void setVertex1_l(double vertex1_l) {
        Triangle.vertex1_l = vertex1_l;
    }

    public static void setVertex2_l(double vertex2_l) {
        Triangle.vertex2_l = vertex2_l;
    }

    public static void setVertex3_l(double vertex3_l) {
        Triangle.vertex3_l = vertex3_l;
    }

    public void translate(float dX, float dY) {}

    public double perimeter() {

        return Triangle.vertex1_l + Triangle.vertex2_l + Triangle.vertex3_l;
    }

    public double area() {

        double HP = perimeter() / 2;
        return Math.sqrt(HP * (HP - vertex1_l) * (HP - vertex2_l) * (HP - vertex3_l));
    }

    public int inWhichQuadrant() {
        if ( Point.inWhichQuadrant(vertex1) == Point.inWhichQuadrant(vertex2) &&
                Point.inWhichQuadrant(vertex1) == Point.inWhichQuadrant(vertex3) &&
                Point.inWhichQuadrant(vertex2) == Point.inWhichQuadrant(vertex3) ) ;
        return Point.inWhichQuadrant(vertex1);
    }

    public String toString() {
        return "[" +
                this.vertex1 +
                ',' +
                this.vertex2 +
                ',' +
                this.vertex3 +
                "]";
    }
    
    public boolean equals(Triangle t){
        return t.vertex1 == vertex1 && t.vertex2 == vertex2 && t.vertex3 == vertex3;
    }
}
