package az.coders.ada_students.lessons.lesson_17.assignment2;

public class Rectangle {

    Point topLeft;
    Point bottomRight;
    double width, height;


    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;

        width = Point.distance(topLeft, bottomRight);
        height = Point.distance(topLeft, bottomRight);
    }

    public Rectangle(float topLeftX, float topLeftY, float bottomRightX, float bottomRightY) {
        this.topLeft = new Point(topLeftX, topLeftY);
        this.bottomRight = new Point(bottomRightX, bottomRightY);
    }

    public Rectangle(Rectangle r2) {
        this(r2.topLeft, r2.bottomRight);
    }


    public Point getTopLeft() {
        return topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void translate(float dX, float dY) {}

    public double perimeter() {

        return 2 * (width + height);
    }

    public double area() {
        return height * width;
    }

    public int inWhichQuadrant(){
        if(Point.inWhichQuadrant(topLeft) == Point.inWhichQuadrant(bottomRight))
            return Point.inWhichQuadrant(topLeft);
        return 0;
    }

    public String toString(){
        return "[" +
                this.topLeft +
                ',' +
                this.bottomRight +
                "]";
    }

    public boolean equals(Rectangle r){
        return r.topLeft == topLeft && r.bottomRight == bottomRight;
    }

}
