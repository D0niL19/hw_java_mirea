package pract3.n2;

public class Circle {
    Point point;
    int radius;

    public Point getPoint() {
        return point;
    }

    public int getRadius() {
        return radius;
    }

    public Circle(double x, double y, int radius) {
        this.point = new Point(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "pract4_1.pract9.pract16.pract15.n1.Circle{" +
                "point=" + point +
                ", radius=" + radius +
                '}';
    }
}
